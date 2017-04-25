package com.ppolski.Inne.miniProjekt_2;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by macbook on 18.01.2017.
 */

public class View extends JFrame {
    private JFrame frame = new JFrame( "Kalkulator");
    private JPanel Panel;
    private JTextField textField1 = new JTextField(10);
    private JRadioButton binarnyRadioButton = new JRadioButton("Binarny");
    private JRadioButton ósemkowyRadioButton = new JRadioButton("Ósemkowy");
    private JButton button1 = new JButton("Oblicz");

    private JRadioButton szestnastkowyRadioButton = new JRadioButton("Szestnastkowy");
    private JRadioButton binarnyRadioButton1 = new JRadioButton("Binarny");
    private JRadioButton ósemkowyRadioButton1 = new JRadioButton("Ósemkowy");
    private JRadioButton szestanstkowyRadioButton1 = new JRadioButton("Szestnastkowy");
    private JTextField textField2 = new JTextField(10);
    private JRadioButton innyRadioButton = new JRadioButton("Inny");
    private JRadioButton innyRadioButton1 = new JRadioButton("Inny");
    private JLabel label = new JLabel("Test");
    private JTabbedPane tabbedPane2;

    public View() {


        JFrame frame = new JFrame("Kalkulator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(650, 350);
        setTitle("Kalkulator Liczbowy");

        JPanel panel = new JPanel();


        panel.add(binarnyRadioButton);
        panel.add(ósemkowyRadioButton);
        panel.add(szestnastkowyRadioButton);
        panel.add(innyRadioButton);
        panel.add(binarnyRadioButton1);
        panel.add(ósemkowyRadioButton1);
        panel.add(szestanstkowyRadioButton1);
        panel.add(innyRadioButton1);

        button1.setBounds(101,111,111,111);
        panel.add(button1);

        panel.add(textField1);
        panel.add(textField2);
        panel.add(label);
        panel.add(button1);

        add(panel);


    }

    void addListner(ActionListener listenForButton) {
        button1.addActionListener(listenForButton);
    }

    void addListner1(ActionListener listenForButton) {
        binarnyRadioButton.addActionListener(listenForButton);
    }

    void addListner2(ActionListener listenForButton) {
        ósemkowyRadioButton.addActionListener(listenForButton);
    }

    void addListner3(ActionListener listenForButton) {
        szestnastkowyRadioButton.addActionListener(listenForButton);
    }
    void addListner4(ActionListener listenForButton) {
        binarnyRadioButton1.addActionListener(listenForButton);
    }

    void addListner5(ActionListener listenForButton) {
        ósemkowyRadioButton1.addActionListener(listenForButton);
    }

    void addListner6(ActionListener listenForButton) {
        szestanstkowyRadioButton1.addActionListener(listenForButton);
    }

    void addListner7(ActionListener listenForButton) {
        innyRadioButton.addActionListener(listenForButton);
    }

    void addListner8(ActionListener listenForButton) {
        innyRadioButton1.addActionListener(listenForButton);
    }



    public String getNumber() {
        return textField1.getText();
    }

    public int getBase() {
        return Integer.parseInt(textField2.getText());
    }

    public String getResult() {
        return label.getText();
    }

    public void setBase(String base) {
        textField2.setText(base);
    }

    public void setResult(String result) {
        label.setText(result);
    }

    public void buttonDisabler(int operationType, boolean state) {

        switch (operationType) {
            case 1:
                binarnyRadioButton.setEnabled(state);
                binarnyRadioButton1.setEnabled(state);
                ósemkowyRadioButton.setEnabled(state);
                ósemkowyRadioButton1.setEnabled(state);
                szestnastkowyRadioButton.setEnabled(state);
                szestanstkowyRadioButton1.setEnabled(state);
                innyRadioButton.setEnabled(state);
                innyRadioButton1.setEnabled(state);
                textField2.setEnabled(state);
                break;
            case 2:
                binarnyRadioButton.setEnabled(state);
                binarnyRadioButton1.setEnabled(state);
                ósemkowyRadioButton.setEnabled(state);
                ósemkowyRadioButton1.setEnabled(state);
                szestnastkowyRadioButton.setEnabled(state);
                szestanstkowyRadioButton1.setEnabled(state);
                innyRadioButton.setEnabled(state);
                innyRadioButton1.setEnabled(state);
                break;
        }
    }
    public void grupa() {
        ButtonGroup group = new ButtonGroup(); //when buttons are in same group, only one can be selected
        group.add(binarnyRadioButton);
        group.add(binarnyRadioButton1);
        group.add(ósemkowyRadioButton);
        group.add(ósemkowyRadioButton1);
        group.add(szestanstkowyRadioButton1);
        group.add(szestnastkowyRadioButton);
        group.add(innyRadioButton);
        group.add(innyRadioButton1);
        group.clearSelection();
    }

}
