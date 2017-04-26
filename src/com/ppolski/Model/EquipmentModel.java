package com.ppolski.Model;


/**
 * Created by pawelpolski on 23.04.2017.
 */

public class EquipmentModel {

    private int id;
    private String serialNumber;
    private String type;

    public EquipmentModel(int id, String serialNumber, String type) {

        this.id = id;
        this.serialNumber = serialNumber;
        this.type = type;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

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
