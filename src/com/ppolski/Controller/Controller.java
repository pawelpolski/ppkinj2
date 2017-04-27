package com.ppolski.Controller;

import com.ppolski.Model.Model;
import com.ppolski.View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pawelpolski on 19.04.2017.
 */
public class Controller {

    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListener(new Listener());

        theView.addRow(3,"10010103","plc");
        theView.addRow(4,"12111114","dekoder");
        theView.addRow(5,"10010105","modem");

        theView.setLabelField(String.valueOf(theView.getLastRowId()+1));

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            theModel.setSerialNumber(theView.getSNField()); // sets sn in model, taking data from SN field in view

            theModel.setType(theView.getTypeField()); // sets type in model, taking data from type field in view

            theView.addToTable(theView.getLabelField(), theModel.getSerialNumber(), theModel.getType());


            theView.setLabelField(String.valueOf(theView.getLastRowId()+1));
            theView.setSNField("");
            theView.setTypeField("");

        }

    }







}
