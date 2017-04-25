package com.ppolski.Inne.Miniprojekt_1;

public class Main {
    public static void main(String[] args) {


        Klasa converter = new Klasa();

        converter.importOperation();
        converter.importNumber();

        switch (converter.getOperation()) {
            case 1:
                converter.numbetToBase(2);
                break;
            case 2:
                converter.numbetToBase(8);
                break;
            case 3:
                converter.numbetToBase(16);
                break;
            case 4:
                converter.decToBase(2);
                break;
            case 5:
                converter.decToBase(8);
                break;
            case 6:
                converter.decToBase(16);
                break;
            case 7:
                converter.importBase();
                converter.numbetToBase(converter.getBase());
                break;
            case 8:
                converter.importBase();
                converter.decToBase(converter.getBase());
                break;
            default:
                System.out.println("Podałeś błędną operacje!");
        }
    }
}

