package com.ppolski.Model;

import java.util.ArrayList;

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
        return this.id;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
      return this.id+";"+this.serialNumber+";"+this.type;

    }



}
