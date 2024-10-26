using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Design;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TempUI
{
    public partial class AlternativeGridViewPanel : UserControl
    {
        public string Title
        {
            get => label.Text;
            set => label.Text = value;
        }

        [Editor(typeof(MyColumnEditor), typeof(UITypeEditor))]
        [DesignerSerializationVisibility(DesignerSerializationVisibility.Content)]
        public DataGridViewColumnCollection First {
            get => dataGridView1.Columns;
        }
        [Editor(typeof(MyColumnEditor), typeof(UITypeEditor))]
        [DesignerSerializationVisibility(DesignerSerializationVisibility.Content)]
        public DataGridViewColumnCollection Second
        {
            get => dataGridView2.Columns;
        }

        public AlternativeGridViewPanel()
        {
            InitializeComponent();
        }

        public void ShowFirst()
        {
            dataGridView1.Visible = true;
            dataGridView2.Visible = false;
        }
        public void ShowSecond()
        {
            dataGridView2.Visible = true;
            dataGridView1.Visible = false;
        }

        public void SetFirstData(DataTable data)
        {
            dataGridView1.DataSource = data;
        }
        public void SetSecondData(DataTable data)
        {
            dataGridView2.DataSource = data;
        }

        private void dataGridView1_SelectionChanged(object sender, EventArgs e)
        {
            dataGridView1.ClearSelection();
        }

        private void dataGridView2_SelectionChanged(object sender, EventArgs e)
        {
            dataGridView2.ClearSelection();
        }
    }

    internal class MyColumnEditor : UITypeEditor
    {
        public override UITypeEditorEditStyle GetEditStyle(ITypeDescriptorContext context)
        {
            return UITypeEditorEditStyle.Modal;
        }
        public override object EditValue(ITypeDescriptorContext context,
                                         IServiceProvider provider, object value)
        {
            var fieldName = "dataGridView" + (context.PropertyDescriptor.Name == "First"? "1" : "2");
            var field = context.Instance.GetType().GetField(fieldName,
                           System.Reflection.BindingFlags.NonPublic |
                           System.Reflection.BindingFlags.Instance);

            var dataGridView1 = (DataGridView)field.GetValue(context.Instance);
            dataGridView1.Site = ((Control)context.Instance).Site;
            var columnsProperty = TypeDescriptor.GetProperties(dataGridView1)["Columns"];
            var tdc = new TypeDescriptionContext(dataGridView1, columnsProperty);
            var editor = (UITypeEditor)columnsProperty.GetEditor(typeof(UITypeEditor));
            var result = editor.EditValue(tdc, provider, value);
            dataGridView1.Site = null;
            return result;
        }
    }

    internal class TypeDescriptionContext : ITypeDescriptorContext
    {
        private Control editingObject;
        private PropertyDescriptor editingProperty;
        public TypeDescriptionContext(Control obj, PropertyDescriptor property)
        {
            editingObject = obj;
            editingProperty = property;
        }
        public IContainer Container
        {
            get { return editingObject.Container; }
        }
        public object Instance
        {
            get { return editingObject; }
        }
        public void OnComponentChanged()
        {
        }
        public bool OnComponentChanging()
        {
            return true;
        }
        public PropertyDescriptor PropertyDescriptor
        {
            get { return editingProperty; }
        }
        public object GetService(Type serviceType)
        {
            return editingObject.Site.GetService(serviceType);
        }
    }
}
