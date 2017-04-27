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


        theView.getTable1().setModel(theModel.getTableModel());
        theView.setLabelField(String.valueOf(theModel.getLastRowId()+1));

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            /**
             Takes data from S/N field (View)
             Sets variable S/N (Model)
             */
            theModel.setSerialNumber(theView.getSNField());

            /**
             Takes data from Type field (View)
             Sets variable Type (Model)
             */
            theModel.setType(theView.getTypeField());

            /**
             Add next row to Table, based on input
             */
            theModel.addNextRow(Integer.parseInt(theView.getLabelField()), theModel.getSerialNumber(), theModel.getType());

            //theView.getTable1().geta


            theView.setLabelField(String.valueOf(theModel.getLastRowId()+1));
            theView.setSNField("");
            theView.setTypeField("");
            theView.setTypeField(String.valueOf(theView.getTable1().getSelectedRow()));
        }
    }






}
