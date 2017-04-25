package com.ppolski.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by pawelpolski on 19.04.2017.
 */

public class Model {

    private int id;
    private String serialNumber;
    private String type;
    private String marged;
    private Equipment Eq;

    private List<Equipment> personDB;

    public Model() {
        personDB = new Vector<Equipment>();

        personDB.add(new Equipment(0, "101", "dekoder"));
        personDB.add(new Equipment(1, "102", "modem"));
        personDB.add(new Equipment(2, "103", "router"));
        personDB.add(new Equipment(3, "104", "router"));
        personDB.add(new Equipment(4, "104", "router"));

    }


    public void marge(int id) {

        this.marged = "" + personDB.get(id);

    }

    public int getDBSize() {

        return personDB.size();

    }


    public void addToDB(int id, String serialNumber, String type) {

        personDB.add(new Equipment(id, serialNumber, type));

    }

    public void addMarged(int id, String serialNumber, String type) {

        this.marged = String.valueOf(id) + ";" + serialNumber + ";" + type + ";";

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

    public void setSerialNumber(String sn) {

        this.serialNumber = sn;

    }

    public String getMarged() {

        return marged;

    }

    public String getSerialNumber() {

        return serialNumber;

    }
}
