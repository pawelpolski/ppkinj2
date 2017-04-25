package com.ppolski.Inne.Miniprojekt_1;

import java.util.Scanner;

public class Klasa {

    private String number;
    private int operation;
    private int base;
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

    public void numbetToBase(int base) {
        System.out.println("Podana liczba to: " + Integer.parseInt(getNumber(), base));
    }

    public void decToBase(int base) {

        int numberInt = Integer.parseInt(getNumber());
        int array[] = new int[50];
        int index = 0;

        while (numberInt > 0) {
            int rest = numberInt % base;
            array[index++] = rest;
            numberInt = numberInt / base;
        }

        System.out.print("Przekonwertowana liczba to: ");
        for (int i = index - 1; i >= 0; i--) {
            switch (array[i]) {

                case (10): {
                    System.out.print("A");
                    break;
                }
                case (11): {
                    System.out.print("B");
                    break;
                }
                case (12): {
                    System.out.print("C");
                    break;
                }
                case (13): {
                    System.out.print("D");
                    break;
                }
                case (14): {
                    System.out.print("E");
                    break;
                }
                case (15): {
                    System.out.print("F");
                    break;
                }
                default: {
                    System.out.print(array[i]);
                    break;
                }
            }
        }
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
}


