package com.ppolski.View;

import com.ppolski.Model.Equipment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by macbook on 19.04.2017.
 */
public class View extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JList list1;
    private JTextField textField2;
    private JLabel idLabel;
    private JScrollPane scroll;
    private JTable table1;

    private DefaultListModel listOfSerialNumbers = new DefaultListModel();
    private DefaultTableModel tableModel;
    private java.util.List<Equipment> eqDB;

    public View() {
        JFrame frame = new JFrame("MAGAZYN");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
        frame.setSize(1000, 500);
        frame.setResizable(true);
        list1.setModel(listOfSerialNumbers);


        this.tableModel = new DefaultTableModel();

        table1.setAutoCreateRowSorter(true);
        table1.setFillsViewportHeight(true);
        table1.setPreferredScrollableViewportSize(new Dimension(300, 300));
        frame.pack();
        tableModel.addColumn("ID");
        tableModel.addColumn("Numer seryjny");
        tableModel.addColumn("Typ");

        eqDB = new Vector<Equipment>();
        table1.setModel(tableModel);

    }



    public String getSNField() {

        return textField1.getText();

    }


    public void setSNField(String input) {

        textField1.setText(input);

    }


    public void setLabelField(String input) {

        idLabel.setText(input);

    }


    public String getTypeField() {

        return textField2.getText();

    }


    public void setTypeField(String input) {

        textField2.setText(input);

    }


    public void addToList(String addons) {

        listOfSerialNumbers.add(0, addons);

    }


    public void addListener(ActionListener listenForButton1) {

        button1.addActionListener(listenForButton1);

    }

    public void addToTable(int id, String serialNumber, String type) {
        tableModel.addRow(new Object[]{id, serialNumber, type});
    }

}
