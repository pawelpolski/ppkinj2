package com.ppolski.Controller;

import com.ppolski.Model.Model;
import com.ppolski.View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by pawelpolski on 19.04.2017.
 * Controller knows model and view and knows what to do with provided data
 */
public class Controller {

    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {

        this.theView = theView;
        this.theModel = theModel;
        this.theView.addListener(new Listener());
        this.theView.addListener2(new Listener2());

        /**
         * initializes table data model
         */
        theView.getTable1().setModel(theModel.getTableModel());
        theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));

    }

    class Listener implements ActionListener {

        /**
         * First button is clicked
         */
        public void actionPerformed(ActionEvent e) {

            /**
             * First button can be add or save button, it depends on action which user wants to make
             */
            if (theView.getAddButton().getText() == "Add") {
                //add button is selected

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
                 * Add next row to Table, based on input in sn and type fields
                 */
                theModel.addNextRow(Integer.parseInt(theView.getLabelField()), theModel.getSerialNumber(), theModel.getType());

                /**
                 * ID label is set to next availible id
                 */
                theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));

                /**
                 * SN field is cleared
                 */
                theView.setSNField("");

                /**
                 * SN field is cleared
                 */
                theView.setTypeField("");

            } else {
                // Save button is selected
                theModel.setSerialNumber(theView.getSNField());
                theModel.setType(theView.getTypeField());

                /**
                 * Selected row is edited based on user input
                 */
                theModel.editRow(theView.getTable1().getSelectedRow(), theView.getLabelField(), theModel.getSerialNumber(), theModel.getType());
                theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));
                theView.setSNField("");
                theView.setTypeField("");

                /**
                 * First button is set to add
                 */
                theView.getAddButton().setText("Add");

                /**
                 * First button is set to edit
                 */
                theView.getEditButton().setText("Edit");


                theView.getTable1().clearSelection();
            }
        }
    }

    class Listener2 implements ActionListener {
        /**
         * Second button is clicked
         */
        public void actionPerformed(ActionEvent e) {
            /**
             * Second button can be add or save button, it depends on action which user wants to make
             */
            if (theView.getTable1().getSelectedRow() >= 0) {
                // edit button is selected
                if (theView.getEditButton().getText() == "Edit") {
                    theView.getAddButton().setText("Save");
                    theView.getEditButton().setText("Cancel");
                    theView.setLabelField(theModel.getSelectedId(theView.getTable1().getSelectedRow()));

                    /**
                     * Takes serial number value from selection, and inserts to serial number field so user can edit this value
                     */
                    theView.setSNField(theModel.getSelectedSerialNumber(theView.getTable1().getSelectedRow()));
                    theView.setTypeField(theModel.getSelectedType(theView.getTable1().getSelectedRow()));
                } else {
                //Cancel button is selected
                    theView.setLabelField(String.valueOf(theModel.getLastRowId() + 1));
                    theView.setSNField("");
                    theView.setTypeField("");
                    theView.getAddButton().setText("Add");
                    theView.getEditButton().setText("Edit");

                    /**
                     * Removes selection from selected row
                     */
                    theView.getTable1().clearSelection();
                }
            } else {
                showMessageDialog(null, "Select row if you want to edit");
            }
        }
    }

}
