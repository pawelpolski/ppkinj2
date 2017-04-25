package com.ppolski.Inne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 2017-01-19.
 */
public class Bmi{
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel etykieta;
    private JLabel etykieta2;

    public Bmi() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float dane = Float.parseFloat(textField1.getText());
                float dane1 = Float.parseFloat(textField2.getText());
                float bmi = dane / (((dane1)/100)*((dane1)/100));
                String bmiString = Float.toString(bmi);
                etykieta.setText("Twoje BMI wynosi"+bmiString);

                //JOptionPane.showMessageDialog(null,"Twoje BMI wynosi"+ bmi);

            }
        });
    }
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Bmi");
        ramka.setContentPane(new Bmi().panel1);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
        ramka.setSize(250,250);
    }


}