package com.ppolski.Inne;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by student on 2016-11-19.
 */
public class body {
    private int number;
    private String numberx2;
    private int a=0;
    private Vector<Integer> myVector = new Vector<Integer>();
    Scanner scan = new Scanner(System.in);

    private void takeNumber()
    {
        System.out.println("Podaj numer");
        number = scan.nextInt();
    }

    private void countToBasic(int basicNumber)
    {
        takeNumber();
        myVector.clear();
        do
        {
            myVector.add(number%basicNumber);
            System.out.println(number + "/" + basicNumber + "=" + number / basicNumber + " reszta " + number % basicNumber);
            number = number / basicNumber;
        }while(number!=0);

    }

    private void showTable()
    {
        System.out.println(" ");
        for(int j=myVector.size()-1;j>=0;j--)
        {
            System.out.print(myVector.get(j));
        }
        System.out.println(" ");
    }


    private void giveHex(){
        System.out.println(" ");
        for(int j=myVector.size()-1;j>=0;j--)
        {
            switch (myVector.get(j))
            {
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
                default:
                    System.out.print(myVector.get(j));
            }
        }
        System.out.println(" ");
    }

    private boolean isItEnd()
    {
        String end;
        System.out.println("Czy chcesz zakonczyc program ? y/n");
        end = scan.next();
        if(end.equals("y"))
            return false;
        else
            return true;
    }

    private void takeOther()
    {
        System.out.println("Podaj numer");
        numberx2 = scan.next();
    }
    /*private void countToDecimal(int basic){
        takeOther();
        double potega=numberx2.length()-1;
        int result=0;
        for (int i=0;i<numberx2.length();i++)
        {
            if(numberx2.charAt(i)!=0)
            {
                int pojedyncze = numberx2.
                        result += (pojedyncze*(Math.pow(basic,potega)));
                System.out.println(numberx2.charAt(i)+" "+ Math.pow(basic,potega ));
            }
            potega--;
        }
        System.out.println(result);
    }*/
    public void petla()
    {
        do{
            System.out.println("1-dec na bin");
            System.out.println("2-dec na octa");
            System.out.println("3-dec na hex");
            System.out.println("4-bin na dec");
            System.out.println("5-oct na dec");
            System.out.println("6-hex na dec");
            System.out.println("Podaj jakie");
            int t=scan.nextInt();
            switch(t){
                case 1:
                    countToBasic(2);
                    showTable();
                    break;
                case 2:
                    countToBasic(8);
                    showTable();
                    break;
                case 3:
                    countToBasic(16);
                    giveHex();
                    break;
               /* case 4 :
                    countToDecimal(2);
                    break;
*/
            }
        }while(isItEnd());
    }
}
