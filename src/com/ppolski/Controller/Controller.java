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
        theView.setLabelField(String.valueOf(theModel.getDBSize()));

        for (int i = 0; i <= theModel.getDBSize() - 1; i++) {

            theModel.marge(i);
            theView.addToList(theModel.getMarged());
        }

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            theModel.setSerialNumber(theView.getSNField()); // sets sn in model, taking data from SN field in view

            theModel.setType(theView.getTypeField()); // sets type in model, taking data from type field in view

            theModel.addToDB(theModel.getDBSize() - 1, theView.getSNField(), theView.getTypeField());

            theView.addToList(theModel.getDBSize() -1 +";"+theModel.getSerialNumber()+";"+theModel.getType());

            theModel.addMarged(theModel.getDBSize() - 1, theView.getSNField(), theView.getTypeField());

            theView.addToTable(theModel.getDBSize() -1, theModel.getSerialNumber(), theModel.getType());
            //theView.addToList(theModel.getMarged());

            theView.setTypeField("");

            theView.setSNField("");

            theView.setLabelField(String.valueOf(theModel.getDBSize()));
        }

    }
}
