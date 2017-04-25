package com.ppolski.Inne;

public class Nowa {
    public static int ALFABET = 26;
    public static char[] litery = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    protected char[] zakodowany = new char[ALFABET];

    public Nowa() {
        for (int i=0; i<ALFABET; i++) {
            zakodowany[i] = litery[(i + 3) % ALFABET];
        }

    }


    public String koduj(String secret) {
        char[] wiadomosc = secret.toCharArray();
        for (int i=0; i<wiadomosc.length; i++) {
            if (Character.isUpperCase(wiadomosc[i])) {
                wiadomosc[i] = zakodowany[wiadomosc[i]-'A'];
            }
        }
        return new String(wiadomosc);
    }

}