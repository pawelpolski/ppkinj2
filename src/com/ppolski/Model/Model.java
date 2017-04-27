package com.ppolski.Model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by pawelpolski on 19.04.2017.
 */

public class Model {

    private int id;
    private String serialNumber;
    private String type;

    private DefaultTableModel tableModel1 = new DefaultTableModel();

    public Model() {

        initializeColumns();
        addNextRow(1,"10010101","plc");
        addNextRow(2,"10010102","dekoder");
        addNextRow(3,"10010103","modem");

    }

    public int getLastRowId(){
        int i = tableModel1.getRowCount();
        Object j = tableModel1.getValueAt(i-1,0);
        String k = String.valueOf(j);
        return Integer.valueOf(k);

    }


    public void initializeColumns() {
        tableModel1.addColumn("ID");
        tableModel1.addColumn("Numer seryjny");
        tableModel1.addColumn("Typ");
    }

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

    public void setId(int id) {

        this.id = id;

    }

    public DefaultTableModel getTableModel() {

        return tableModel1;

    }

    public String getSerialNumber() {

        return serialNumber;

    }

    public void setSerialNumber(String sn) {

        this.serialNumber = sn;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }




    }

