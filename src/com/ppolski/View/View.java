package com.ppolski.View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


/**
 * Created by pawelpolski on 19.04.2017.
 * This is what user see
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

    /**
     * Initialize frame and components
     */
    public View() {
        JFrame frame = new JFrame("Warehouse by Pawel Polski");
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

    /**
     * Access to button
     */
    public JButton getAddButton() {

        return button1;
    }

    /**
     * Access to button
     */
    public JButton getEditButton() {

        return editButton;
    }

    /**
     * Access to table
     */
    public JTable getTable1() {

        return table1;
    }

    /**
     * Returns text which is now on serialNumber text field
     */
    public String getSNField() {

        return textField1.getText();

    }

    /**
     * Sets serialNumber text-field to text from input
     * @param input Type your input to set in field
     */
    public void setSNField(String input) {

        textField1.setText(input);

    }

    /**
     * Returns text which is now on id-label
     */
    public String getLabelField() {

        return idLabel.getText();

    }

    /**
     * Sets id label to text from input
     * @param input Type your input to set in field
     */
    public void setLabelField(String input) {

        idLabel.setText(String.valueOf(input));

    }

    /**
     * Returns text which is now on type text field
     */
    public String getTypeField() {

        return textField2.getText();

    }

    /**
     * Sets type text field to text from input
     * @param input Type your input to set in field
     */
    public void setTypeField(String input) {

        textField2.setText(input);

    }


    /**
     * Creates action listner for add/save button
     */
    public void addListener(ActionListener listenForButton1) {

        button1.addActionListener(listenForButton1);

    }

    /**
     * Creates action listner for edit/cancel button
     */
    public void addListener2(ActionListener listenForButton2) {

        editButton.addActionListener(listenForButton2);

    }
}
