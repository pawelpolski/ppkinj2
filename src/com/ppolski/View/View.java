package com.ppolski.View;

import com.ppolski.Model.Equipment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by pawelpolski on 19.04.2017.
 */

public class View extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JLabel idLabel;
    private JScrollPane scroll;
    private JTable table1;

    private DefaultTableModel tableModel;

    private java.util.List<Equipment> eqDB;

    public View() {
        JFrame frame = new JFrame("MAGAZYN");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1000, 500);
        frame.setResizable(true);



        this.tableModel = new DefaultTableModel();

        table1.setAutoCreateRowSorter(true);
        table1.setFillsViewportHeight(true);
        table1.setPreferredScrollableViewportSize(new Dimension(300, 300));
        frame.pack();
        tableModel.addColumn("ID");
        tableModel.addColumn("Numer seryjny");
        tableModel.addColumn("Typ");
        eqDB = new Vector<Equipment>();
        tableModel.addRow(new Object[]{1, "10001", "Dekoder"});
        tableModel.addRow(new Object[]{2, "10002", "Modem"});
        tableModel.addRow(new Object[]{3, "10003", "CI+"});
        tableModel.addRow(new Object[]{4, "10004", "Router"});

        table1.setModel(tableModel);

    }

    public int getRowCount() {

       return tableModel.getRowCount();

    }

    public int getLastRowId() {
        int allRows = getRowCount()-1;
        int lastRow = (int) getIDFromTB(allRows);
        lastRow++;
        return lastRow;

    }

    public Object getIDFromTB(int i) {

        return tableModel.getValueAt(i, 0);

    }


    public Object getSNFromTB() {

        int i = table1.getSelectedRow();
        return tableModel.getValueAt(i, 1);

    }

    public Object getTypeFromTB() {

        int i = table1.getSelectedRow();
        return tableModel.getValueAt(i, 2);

    }

    public String getSNField() {

        return textField1.getText();

    }

    public String getLabelField() {

        return idLabel.getText();

    }

    public void setSNField(String input) {

        textField1.setText(input);

    }


    public void setLabelField(int input) {

        idLabel.setText(String.valueOf(input));


    }


    public String getTypeField() {

        return textField2.getText();

    }


    public void setTypeField(String input) {

        textField2.setText(input);

    }

    public void addListener(ActionListener listenForButton1) {

        button1.addActionListener(listenForButton1);

    }

    public void addToTable(String id, String serialNumber, String type) {

        tableModel.addRow(new Object[]{id, serialNumber, type});

    }

}
