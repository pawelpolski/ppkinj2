package com.ppolski.Controller;

import com.ppolski.Model.Equipment;
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
        theView.setLabelField(theView.getRowCount()+1);

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            theModel.setSerialNumber(theView.getSNField()); // sets sn in model, taking data from SN field in view

            theModel.setType(theView.getTypeField()); // sets type in model, taking data from type field in view

            theView.addToTable(theView.getLabelField(), theModel.getSerialNumber(), theModel.getType());


            theView.setLabelField(theView.getRowCount()+1);

            //theView.setSNField((String) theView.getSNFromTB());
            //theView.setTypeField((String) theView.getTypeFromTB());
            theView.setSNField("");
            theView.setTypeField("");

        }

    }







}
