package com.ppolski.Inne;

import java.util.*;

public class Klasa {

    private String number;
    private int operation;
    private int base;
    private String resultString;

    Scanner read = new Scanner(System.in);
    Scanner read1 = new Scanner(System.in);
    Scanner read2 = new Scanner(System.in);

    public void importOperation() {
        System.out.println("Podaj operację zmiany systemu liczbowego: ");
        System.out.println("1. Binarny na Dziesiętny");
        System.out.println("2. Ósemkowy na Dziesiętny");
        System.out.println("3. Szestnastkowy na Dziesiętny");
        System.out.println("4. Dziesiętny na Binarny");
        System.out.println("5. Dziesiętny na Ósemkowy");
        System.out.println("6. Dziesiętny na Szestnastkowy");
        System.out.println("");
        System.out.println("7. Inny system (wymagana podstawa systemu liczbowego) na Dziesiętny");
        System.out.println("8. Dziesiętny na inny system (wymagana podstawa systemu liczbowego)");
        setOperation(read.nextInt());
    }

    public void importNumber() {
        System.out.println("Podaj liczbe którą chcesz przekonwertować: ");
        setNumber(read1.nextLine());
    }

    public void importBase() {
        System.out.println("Podaj podstawe systemu liczbowego: ");
        setBase(read2.nextInt());
    }

    public void printToConsoleString(){

        System.out.println(resultString);
    }

    public String numToBase () {
        
        int result = Integer.parseInt(getNumber(), getBase());
        setResultString(String.valueOf(result)); //for console
        return resultString;
    }

    public String decToBaseString () {

        int numberInt = Integer.parseInt(getNumber());
        int index = 0;
        List <String> list = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();

        while (numberInt > 0) {
            int rest = numberInt % getBase();
            list2.add(rest);
            index++;
            numberInt = numberInt / getBase();
        }

        for (int i = index - 1; i >= 0; i--) {
            switch (list2.get(i)) {
                case (10): { list.add("A");
                    break; }
                case (11): { list.add("D");
                    break; }
                case (12): { list.add("C");
                    break; }
                case (13): { list.add("D");
                    break; }
                case (14): { list.add("E");
                    break; }
                case (15): { list.add("F");
                    break; }
                default: { list.add(String.valueOf(list2.get(i)));
                    break; }
            }
        }
        String listString = String.join("", list);
        setResultString(listString);
        return resultString;
    }




    public int getOperation() {
        return operation;
    }
    public String getNumber() {
        return number;
    }
    public int getBase() {
        return base;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setOperation(int operation) {
        this.operation = operation;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public String getResultString() {
        return resultString;
    }
    public void setResultString(String resultString) {
        this.resultString = resultString;
    }
}


