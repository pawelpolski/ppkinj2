package com.ppolski.Controller;

import com.ppolski.Model.Model;
import com.ppolski.View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by pawelpolski on 19.04.2017.
 */
public class Controller {

    private View theView;
    private Model theModel;
    private String buttonChange;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListener(new Listener());

        this.theView.addListener2(new Listener2());


        theView.getTable1().setModel(theModel.getTableModel());
        theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));

    }

    class Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (theView.getAddButton().getText() == "Add") {

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

                theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));
                theView.setSNField("");
                theView.setTypeField("");

            } else {
                // button is save
                theModel.setSerialNumber(theView.getSNField());
                theModel.setType(theView.getTypeField());
                theModel.editRow(theView.getTable1().getSelectedRow(), theView.getLabelField(), theModel.getSerialNumber(), theModel.getType());
                theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));
                theView.setSNField("");
                theView.setTypeField("");
                theView.getAddButton().setText("Add");
                theView.getEditButton().setText("Edit");
                theView.getTable1().clearSelection();
            }
        }
    }

    class Listener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theView.getTable1().getSelectedRow() >= 0) {
                if (theView.getEditButton().getText() == "Edit") {
                    theView.getAddButton().setText("Save");
                    theView.getEditButton().setText("Cancel");
                    theView.setLabelField(theModel.getSelectedId(theView.getTable1().getSelectedRow()));

                } else {
                    theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));
                    theView.setSNField("");
                    theView.setTypeField("");
                    theView.getAddButton().setText("Add");
                    theView.getEditButton().setText("Edit");

                    theView.getTable1().clearSelection();
                }
            } else {
                showMessageDialog(null, "Select row if you want to edit");
            }
        }
    }

}
