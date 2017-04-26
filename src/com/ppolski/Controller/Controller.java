package com.ppolski.Controller;

import com.ppolski.Model.EquipmentModel;
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
    private EquipmentModel theEquipmentModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;
        this.theView.addListener(new Listener());


    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            theEquipmentModel.setSerialNumber(theView.getSNField()); // sets sn in model, taking data from SN field in view

            theEquipmentModel.setType(theView.getTypeField()); // sets type in model, taking data from type field in view

            theView.addToTable(theView.getLabelField(), theEquipmentModel.getSerialNumber(), theEquipmentModel.getType());


            theView.setSNField("");
            theView.setTypeField("");

        }

    }







}
