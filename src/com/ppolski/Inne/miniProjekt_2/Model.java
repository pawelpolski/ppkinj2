package com.ppolski.Inne.miniProjekt_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 20.01.2017.
 */
public class Model {

    private String number;
    private int operation;
    private int base;
    private String resultString;




    public void numToBase (String number, int base) {

        int result = Integer.parseInt(number, base);
        resultString = String.valueOf(result);
    }

    public void decToBaseString(String number, int base) {

        int numberInt = Integer.parseInt(number);
        int index = 0;
        int array[] = new int[50];
        List<String> list = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();

        while (numberInt > 0) {
            int rest = numberInt % base;
            list2.add(rest);
            array[index++] = rest;
            numberInt = numberInt / base;
        }

        for (int i = index - 1; i >= 0; i--) {
            switch (list2.get(i)) {

                case (10): {
                    list.add("A");
                    break;
                }
                case (11): {
                    list.add("D");
                    break;
                }
                case (12): {
                    list.add("C");
                    break;
                }
                case (13): {
                    list.add("D");
                    break;
                }
                case (14): {
                    list.add("E");
                    break;
                }
                case (15): {
                    list.add("F");
                    break;
                }
                default: {
                    list.add(String.valueOf(list2.get(i)));
                    break;
                }
            }
        }

        String listString = String.join("", list);
        resultString = listString;
    }

    public String getResultString(){

        return resultString;
    }



}
