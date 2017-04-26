package com.ppolski.View;

import com.ppolski.Model.EquipmentModel;
import com.ppolski.Model.Model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

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

    private DefaultTableModel tableModel = new DefaultTableModel();


    public View() {
        JFrame frame = new JFrame("MAGAZYN");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1000, 500);
        frame.setResizable(true);
        table1.setAutoCreateRowSorter(true);
        table1.setFillsViewportHeight(true);
        table1.setPreferredScrollableViewportSize(new Dimension(300, 300));
        frame.pack();



        tableModel.addColumn("ID");
        tableModel.addColumn("Numer seryjny");
        tableModel.addColumn("Typ");
        Object[] header = {1, "Name", "Quantity"};
        tableModel.addRow(header);
        tableModel.addRow(new Object[]{2, "10002", "Modem"});
        tableModel.addRow(new Object[]{3, "10003", "CI+"});

        table1.setModel(tableModel);

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
