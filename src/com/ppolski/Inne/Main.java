package com.ppolski.Inne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

/**
 * Created by macbook on 18.01.2017.
 */

public class Main {
    private JPanel Panel1;
    private JTextField textField1;
    private JRadioButton binaryFirst;
    private JRadioButton octFirst;
    private JButton resultButton;
    private JRadioButton hexFirst;
    private JRadioButton binarySecond;
    private JRadioButton octSecond;
    private JRadioButton hexSecond;
    private JTextField baseField;
    private JRadioButton otherFirst;
    private JRadioButton otherSecond;
    private JLabel resultLabel;
    private JTabbedPane tabbedPane2;
    private JList list2;
    private JButton cleanHistoryButton;
    private JButton getAndPasteButton;
    private JScrollPane scroll;
    private JButton binToHex;
    private String operation;

    public void buttonDisabler(String operationType, boolean state){

        switch (operationType) {
            case "baseFromButton":
                binaryFirst.setEnabled(state);
                binarySecond.setEnabled(state);
                octFirst.setEnabled(state);
                octSecond.setEnabled(state);
                hexFirst.setEnabled(state);
                hexSecond.setEnabled(state);
                otherFirst.setEnabled(state);
                otherSecond.setEnabled(state);
                baseField.setEnabled(state);
                break;
            case "typeBase":
                binaryFirst.setEnabled(state);
                binarySecond.setEnabled(state);
                octFirst.setEnabled(state);
                octSecond.setEnabled(state);
                hexFirst.setEnabled(state);
                hexSecond.setEnabled(state);
                otherFirst.setEnabled(state);
                otherSecond.setEnabled(state);
                break;
        }
    }

    public Main(){

        DefaultListModel history = new DefaultListModel(); // add data model to list
        list2.setModel(history);
        list2.setVisibleRowCount(10);
        JScrollPane scroll = new JScrollPane();


        ButtonGroup group = new ButtonGroup(); //when buttons are in same group, only one can be selected
        group.add(binaryFirst);
        group.add(binarySecond);
        group.add(octFirst);
        group.add(octSecond);
        group.add(hexSecond);
        group.add(hexFirst);
        group.add(otherFirst);
        group.add(otherSecond);

        resultButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {

                Klasa converter = new Klasa();
                converter.setNumber(textField1.getText());

                try {
                    converter.setBase(Integer.parseInt(baseField.getText()));
                }catch (NumberFormatException e2) {
                    resultLabel.setText("Wybierz operacje!");
                }
                if (operation == "first"){
                try {
                    resultLabel.setText("Podana liczba to: " + converter.numToBase());
                } catch (NumberFormatException e1) {
                    resultLabel.setText("Podano błędną liczbę!");
                }
                } else {
                    try {
                    resultLabel.setText("Podana liczba to: " + converter.decToBaseString());
                } catch (NumberFormatException e2) {
                    resultLabel.setText("Podano błędną liczbę!");
                }
                }

                buttonDisabler("baseFromButton", true); // enable all button
                group.clearSelection();

                history.add(0, textField1.getText());
            }
        });

        binaryFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false); //disable all button, with base field
                baseField.setText("2");
                operation = "first";
            }
        });

        octFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false);
                baseField.setText("8");
                operation = "first";
            }
        });

        hexFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false);
                baseField.setText("16");
                operation = "first";
            }
        });

        otherFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("typeBase", false); //disable all button, except base field
                operation = "first";
            }
        });
        binarySecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false);
                baseField.setText("2");
                operation = "second";
            }
        });
        octSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false);
                baseField.setText("8");
                operation = "second";
            }
        });
        hexSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("baseFromButton", false);
                baseField.setText("16");
                operation = "second";
            }
        });
        otherSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDisabler("typeBase", false);
                operation = "second";
            }
        });

        list2.addComponentListener(new ComponentAdapter() {

        });

        cleanHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                history.clear();
            }
        });

        getAndPasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = list2.getSelectedValue().toString();
                textField1.setText(selected);
            }
        });

        binToHex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Klasa converter = new Klasa();
                converter.setNumber(textField1.getText());
                converter.setBase(2);
                converter.numToBase();
                converter.setNumber(converter.getResultString());
                converter.setBase(16);
                converter.decToBaseString();
                resultLabel.setText(converter.getResultString());

            }
        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Kalkulator systemów liczbowych");
        frame.setContentPane(new Main().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setSize(800, 400);
        frame.setResizable(false);



        Klasa converter = new Klasa();
        converter.importOperation();
        converter.importNumber();

        switch (converter.getOperation()) {
            case 1:
                converter.setBase(2);
                converter.numToBase();
                converter.printToConsoleString();
                break;
            case 2:
                converter.setBase(8);
                converter.numToBase();
                converter.printToConsoleString();
                break;
            case 3:
                converter.setBase(16);
                converter.numToBase();
                converter.printToConsoleString();
                break;
            case 4:
                converter.setBase(2);
                converter.decToBaseString();
                converter.printToConsoleString();
                break;
            case 5:
                converter.setBase(8);
                converter.decToBaseString();
                converter.printToConsoleString();
                break;
            case 6:
                converter.setBase(16);
                converter.decToBaseString();
                converter.printToConsoleString();
                break;
            case 7:
                converter.importBase();
                converter.numToBase();
                converter.printToConsoleString();
                break;
            case 8:
                converter.importBase();
                converter.decToBaseString();
                converter.printToConsoleString();
                break;
            default:
                System.out.println("Podałeś błędną operacje!");
        }
    }




}

