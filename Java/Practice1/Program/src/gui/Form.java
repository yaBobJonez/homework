package gui;

import cli.Main;
import common.Names;
import common.Student;
import linkedList.LinkedList;
import linkedList.ListSorter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;
import java.util.Map;

public class Form extends JFrame {
    LinkedList<Student> list = new LinkedList<>();

    JTable table = new JTable(new DefaultTableModel(new String[]{"Номер", "Ім'я", "Стать", "Гуртожиток"}, 0));
    JSpinner numberEdit = new JSpinner(new SpinnerNumberModel(-1, -1, Integer.MAX_VALUE, 1));
    JComboBox<String> nameEdit = new JComboBox<>(new String[]{
            "Валентин", "Олександр", "Назар", "Максим", "Михайло", "Віктор", "Ростислав", "Володимир",
            "Каміла", "Юліан", "Ілля", "Тарас", "Матвій", "Юлія", "Олександра", "В'ячеслав", "Святослав",
            "Владислав", "Аліна", "Дмитро", "Вадим", "Данило", "Анатолій"
    });
    JComboBox<String> sexEdit = new JComboBox<>(new String[]{"M", "F"});
    JCheckBox dormitoryEdit = new JCheckBox("Гуртожиток");
    JButton addBtn = new JButton("Додати/змінити");
    JButton removeBtn = new JButton("Видалити");
    JButton sortBtn = new JButton("Сортувати за");
    JComboBox<String> sorterEdit = new JComboBox<>(new String[]{"ім'ям", "статтю", "гуртожитком"});
    JToggleButton filterBtn = new JToggleButton("Фільтрувати");
    JLabel lengthLabel = new JLabel("Довжина: 0");

    public Form(){
        super("Демонстрація");
        initializeGui();
        setupListeners();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    void initializeGui(){
        JPanel addPanel = new JPanel();
        addPanel.setLayout(new BoxLayout(addPanel, BoxLayout.LINE_AXIS));
        addPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
            addPanel.add(removeBtn);
            addPanel.add(numberEdit);
            addPanel.add(nameEdit);
            addPanel.add(sexEdit);
            addPanel.add(dormitoryEdit);
            addPanel.add(addBtn);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel actionsPanel = new JPanel();
        actionsPanel.setLayout(new BoxLayout(actionsPanel, BoxLayout.LINE_AXIS));
        actionsPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
            actionsPanel.add(sortBtn);
            actionsPanel.add(sorterEdit);
            actionsPanel.add(Box.createGlue());
            actionsPanel.add(lengthLabel);
            actionsPanel.add(Box.createGlue());
            actionsPanel.add(filterBtn);
        this.add(addPanel, BorderLayout.NORTH);
        this.add(tableScrollPane, BorderLayout.CENTER);
        this.add(actionsPanel, BorderLayout.SOUTH);
    }

    void setupListeners(){
        addBtn.addActionListener(event -> {
            if(numberEdit.getValue().equals(-1))
                list.PushBack(new Student(
                    Names.values()[nameEdit.getSelectedIndex()],
                    sexEdit.getSelectedItem().equals("M")? 'm' : 'f',
                    dormitoryEdit.isSelected()
                ));
            else if((int)numberEdit.getValue() < list.getLength())
                list.set((int)numberEdit.getValue(), new Student(
                    Names.values()[nameEdit.getSelectedIndex()],
                    sexEdit.getSelectedItem().equals("M")? 'm' : 'f',
                    dormitoryEdit.isSelected()
                ));
            updateTable(list);
        });
        removeBtn.addActionListener(event -> {
            if(!numberEdit.getValue().equals(-1) && (int)numberEdit.getValue() < list.getLength())
                list.Remove((int)numberEdit.getValue());
            updateTable(list);
        });
        sortBtn.addActionListener(event -> {
            int sortParam = sorterEdit.getSelectedIndex();
            ListSorter<Student> sorter = (Student a, Student b) -> {
                if(sortParam == 0) return Main.names[a.name.ordinal()].compareTo(Main.names[b.name.ordinal()]) > 0;
                else if(sortParam == 1) return a.sex > b.sex;
                else return !a.dormitory && b.dormitory;
            };
            list.Sort(sorter);
            updateTable(list);
        });
        filterBtn.addActionListener(event -> {
            addBtn.setEnabled(!addBtn.isEnabled());
            removeBtn.setEnabled(!removeBtn.isEnabled());
            sortBtn.setEnabled(!sortBtn.isEnabled());
            if(filterBtn.isSelected()){
                LinkedList<Student> filtered = list.Filter( (Student st) -> st.sex=='f' && st.dormitory );
                updateTable(filtered);
            } else updateTable(list);
        });
    }

    void updateTable(LinkedList<Student> list){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        int index = list.getLength()-1;
        for(Student st : list){
            model.addRow(new String[]{
                String.valueOf(index--),
                Main.names[st.name.ordinal()],
                st.sex == 'f'? "F" : "M",
                st.dormitory? "Так" : "Ні"
            });
        } lengthLabel.setText("Довжина: "+list.getLength());
    }
}
