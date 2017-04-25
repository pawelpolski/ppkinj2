package com.ppolski.Inne.miniProjekt_2;

public class Main {
    public static void main(String[] args) {

        int liczba = 10;
        int tablica[] = new int[20];
        int index = 0;
        int podstawaSystemu = 15;

        while (liczba > 0) {
            int reszta = liczba % podstawaSystemu;
            tablica[index++] = reszta;
            liczba = liczba / podstawaSystemu;
            System.out.println(liczba + " reszta :" + reszta);
        }

        for (int i = index - 1; i >= 0; i--) {
            switch (tablica[i]) {

                case (10) : {
                    System.out.print("A");
                    break;
                }
                case (11) : {
                    System.out.print("B");
                    break;
                }
                case (12) : {
                    System.out.print("C");
                    break;
                }
                case (13) : {
                    System.out.print("D");
                    break;
                }
                case (14) : {
                    System.out.print("E");
                    break;
                }
                case (15) : {
                    System.out.print("F");
                    break;
                }
                default : {
                    System.out.print(tablica[i]);
                    break;
                }
            }
        }
    }
}


//
//
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj kwote początkową: ");
//        int kwotaPoczatkowa = odczyt.nextInt();
//
//        System.out.println("Podaj ile pieniędzy zamierzasz wpłacać miesięcznie: ");
//        int kwotaMiesieczna = odczyt.nextInt();
//
//        System.out.println("Podaj oprocentowanie roczne: ");
//        int oprocentowanieRoczne = odczyt.nextInt();
//
//        System.out.println("Podaj kwotę jaką chcesz uzbierać: ");
//        int kwotaDocelowa = odczyt.nextInt();
//
//        double oprocentiowanieMiesieczne = oprocentowanieRoczne / 12.0 / 100;
//        double stanKonta = kwotaPoczatkowa;
//        int lata = 0;
//        int miesiace = 1;
//        double odsetki = 0;
//
//        if (kwotaPoczatkowa >= kwotaDocelowa) {
//            System.out.println("Nie musisz już odkładać - masz już uzbieraną kwotę docelową.");
//        }
//
//        while (stanKonta <= kwotaDocelowa) {
//            for (miesiace = 1; miesiace <= 12; miesiace++) {
//                odsetki = stanKonta * oprocentiowanieMiesieczne;
//                stanKonta = stanKonta + odsetki;
//                stanKonta = stanKonta + kwotaMiesieczna;
//
//                System.out.print("Stan konta po " + lata + " roku " + miesiace + " miesiącu wynosi: ");
//                System.out.format("%.2f%n", stanKonta);
//
//            }
//            lata++;
//            miesiace = 1;
//        }
//        System.out.println("Twoje konto osiągnie kwote docelową za " + lata + " lat.");
//    }
//}
