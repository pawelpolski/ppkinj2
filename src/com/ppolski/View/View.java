package com.ppolski.View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
    private JButton editButton;


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



    }
    public JTextField getTextField1() {

        return textField1;
    }

    public JTextField getTextField2() {

        return textField2;
    }

    public JButton getAddButton() {

        return button1;
    }
    
    public JButton getEditButton() {

        return editButton;
    }

    public JTable getTable1() {

        return table1;
    }

    public int getSelectedRow() {

        return table1.getSelectedRow();
    }

    public String getSNField() {

        return textField1.getText();

    }


    public void setSNField(String input) {

        textField1.setText(input);

    }

    public String getLabelField() {

        return idLabel.getText();

    }

    public void setLabelField(String input) {

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
    public void addListener2(ActionListener listenForButton2) {

        editButton.addActionListener(listenForButton2);

    }
}
