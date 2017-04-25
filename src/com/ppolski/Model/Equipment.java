package com.ppolski.Model;


/**
 * Created by pawelpolski on 23.04.2017.
 */

public class Equipment {

    private int id;
    private String serialNumber;
    private String type;

    public Equipment(int id, String serialNumber, String type) {

        this.id = id;
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }

//    public String toString() {
//      return id+";"+serialNumber+";"+type;
//
//    }



}
