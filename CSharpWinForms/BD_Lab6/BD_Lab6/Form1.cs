using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BD_Lab6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'flightsDBDataSet.Service' table. You can move, or remove it, as needed.
            this.serviceTableAdapter.Fill(this.flightsDBDataSet.Service);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Seat' table. You can move, or remove it, as needed.
            this.seatTableAdapter.Fill(this.flightsDBDataSet.Seat);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Restriction' table. You can move, or remove it, as needed.
            this.restrictionTableAdapter.Fill(this.flightsDBDataSet.Restriction);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Plane' table. You can move, or remove it, as needed.
            this.planeTableAdapter.Fill(this.flightsDBDataSet.Plane);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Passenger' table. You can move, or remove it, as needed.
            this.passengerTableAdapter.Fill(this.flightsDBDataSet.Passenger);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Flight' table. You can move, or remove it, as needed.
            this.flightTableAdapter.Fill(this.flightsDBDataSet.Flight);
            // TODO: This line of code loads data into the 'flightsDBDataSet.Company' table. You can move, or remove it, as needed.
            this.companyTableAdapter.Fill(this.flightsDBDataSet.Company);

        }

        private void авіакомпаніїToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormCompanies().Show(this);
        }

        private void рейсиToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormFlights().Show(this);
        }

        private void пасажириToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormPassengers().Show(this);
        }

        private void літакиToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormPlanes().Show(this);
        }

        private void обмеженняToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormRestrictions().Show(this);
        }

        private void місцяToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormSeats().Show(this);
        }

        private void послугиToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new FormServices().Show(this);
        }

        private void внутрішнєЗєднанняMenuItem_Click(object sender, EventArgs e)
        {
            new InnerJoin().Show(this);
        }
    }
}
