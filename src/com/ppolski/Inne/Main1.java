package com.ppolski.Inne;

import java.util.Scanner;


public class Main1 {
    public static void main( String [] args ) {

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Używaj tylko znaków alfabetu, bez znaków diakrytycznych, cyfr, znaków specjalnych.");
        System.out.println("Wpisz slowo do zaszyfrowania: ");
        String tekst = odczyt.next();

        System.out.println("Podaj o ile znaków mam zaszyfrować tekst: ");
        int znak = odczyt.nextInt();

        tekst = tekst.toLowerCase();
        char[] slowo = tekst.toCharArray();


        for (int i = 0; i < slowo.length; i++) {
            slowo[i] = (char) (((int) slowo[i] + znak + 7) % 26 + 65);
        }
        System.out.println(slowo);

    }
}




