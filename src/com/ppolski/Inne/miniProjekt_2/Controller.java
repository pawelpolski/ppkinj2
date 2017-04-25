package com.ppolski.Inne.miniProjekt_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by macbook on 20.01.2017.
 */

public class Controller {
    private View theView;
    private Model theModel;
    private String operation;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListner(new Listner());
        this.theView.addListner1(new Listner1());
        this.theView.addListner2(new Listner2());
        this.theView.addListner3(new Listner3());
        this.theView.addListner4(new Listner4());
        this.theView.addListner5(new Listner5());
        this.theView.addListner6(new Listner6());
        this.theView.addListner7(new Listner7());
        this.theView.addListner8(new Listner8());


    }

    class Listner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String number;
            int base;

            number = theView.getNumber();
            base = theView.getBase();

            if (getOperation() == "first"){
                theModel.numToBase(number, base);
                theView.setResult(theModel.getResultString());
                theView.buttonDisabler(1, true);
                theView.grupa();

                } else {

                theModel.decToBaseString(number, base);
                theView.setResult(theModel.getResultString());
                theView.buttonDisabler(1, true);
                theView.grupa();
                }

        }
    }

    class Listner1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("2");
            theView.buttonDisabler(1, false);
            setOperation("first");
        }
    }
    class Listner2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("8");
            theView.buttonDisabler(1, false);
            setOperation("first");
        }
    }
    class Listner3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("16");
            theView.buttonDisabler(1, false);
            setOperation("first");
        }
    }
    class Listner4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("2");
            theView.buttonDisabler(1, false);
            setOperation("second");
        }
    }
    class Listner5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("8");
            theView.buttonDisabler(1, false);
            setOperation("second");
        }
    }
    class Listner6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setBase("16");
            theView.buttonDisabler(1, false);
            setOperation("second");
        }
    }
    class Listner7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.getBase();
            theView.buttonDisabler(2, false);
            setOperation("first");
        }
    }
    class Listner8 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.getBase();
            theView.buttonDisabler(2, false);
            setOperation("second");
        }
    }

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }

}