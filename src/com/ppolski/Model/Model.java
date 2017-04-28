package com.ppolski.Model;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * Created by pawelpolski on 19.04.2017.
 * Model is place which contains data and logic
 */

public class Model {

    private int id;
    private String serialNumber;
    private String type;

    private DefaultTableModel tableModel1 = new DefaultTableModel();

    /**
     * Initialize table columns and fixed data
     */
    public Model() {

        initializeColumns();
        addNextRow(1, "10010101", "plc");
        addNextRow(2, "10010102", "dekoder");
        addNextRow(3, "10010103", "modem");

    }

    /**
     * Returns id from table
     * @param row row number is needed for this method, usualli it is number of selected row
     */
    public String getSelectedId(int row) {
        Object j = tableModel1.getValueAt(row, 0);
        String id = String.valueOf(j);
        return id;
    }

    /**
     * Returns serial number from table
     * @param row row number is needed for this method, usualli it is number of selected row
     */
    public String getSelectedSerialNumber(int row) {
        Object j = tableModel1.getValueAt(row, 1);
        String id = String.valueOf(j);
        return id;
    }

    /**
     * Returns type from table
     * @param row row number is needed for this method, usualli it is number of selected row
     */
    public String getSelectedType(int row) {
        Object j = tableModel1.getValueAt(row, 2);
        String id = String.valueOf(j);
        return id;
    }


    /**
     * Method is used to edit selected row from table
     * @param row param needed for number of selecter row
     * @param idField input for id
     * @param idField input for sn
     * @param idField input for type
     */
    public void editRow(int row, String idField, String serialNumberField, String typeField) {
        Object i = tableModel1.getValueAt(row, 0);
        Object s = tableModel1.getValueAt(row, 1);
        Object t = tableModel1.getValueAt(row, 2);
        String id = String.valueOf(i);
        String sn = String.valueOf(s);
        String type = String.valueOf(t);
        Vector rowEdit = new Vector();
        rowEdit.add(id);
        rowEdit.add(sn);
        rowEdit.add(type);
        tableModel1.setValueAt(idField, row, 0);
        tableModel1.setValueAt(serialNumberField, row, 1);
        tableModel1.setValueAt(typeField, row, 2);
    }

    /**
     * Returns last row id number, so you can increment it later
     */
    public int getLastRowId() {
        int i = tableModel1.getRowCount();
        Object j = tableModel1.getValueAt(i - 1, 0);
        String k = String.valueOf(j);
        return Integer.valueOf(k);
    }

    /**
     * Sets columns to id, sn, and type
     */
    public void initializeColumns() {
        tableModel1.addColumn("ID");
        tableModel1.addColumn("Numer seryjny");
        tableModel1.addColumn("Typ");
    }

    /**
     * Add row to table basing on input
     */
    public void addNextRow(int id, String serialNumber, String type) {

        Vector row = new Vector();
        row.add(id);
        row.add(serialNumber);
        row.add(type);
        tableModel1.addRow(row);
    }

    public int getId() {

        return id;

    }

    /**
     * Access to table model
     */
    public DefaultTableModel getTableModel() {

        return tableModel1;

    }

    /**
     * Access to serialNumber
     */
    public String getSerialNumber() {

        return serialNumber;

    }

    /**
     * lets you Set serial number
     */
    public void setSerialNumber(String sn) {

        this.serialNumber = sn;

    }

    /**
     * Access to type
     */
    public String getType() {

        return type;

    }

    /**
     * lets you Set type
     */
    public void setType(String type) {

        this.type = type;

    }


}

