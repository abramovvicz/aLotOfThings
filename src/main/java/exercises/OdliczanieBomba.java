/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Scanner;

public class OdliczanieBomba {
    public static void main(String[] args) {
//        pobierzLiczbeFor();
        pobierzLiczbeWhile();
    }

    private static void pobierzLiczbeFor() {
        System.out.println("podaj liczbę całkowitą dodatnią");
        Scanner pobierz = new Scanner(System.in);
        Object obj = (Object) pobierz;

        if (obj instanceof String) {
            System.out.println("to jest string spierdalaj");
        } else {
            int liczba = pobierz.nextInt();

            for (int i = liczba; i >= liczba; i--) {
                System.out.println("Bomba wybuchnie za: " + i);
                liczba = -i;
            }
        }
    }

    private static void pobierzLiczbeWhile() {
        System.out.println("podaj liczbę całkowitą dodatnią");
        Scanner pobierz = new Scanner(System.in);

        int liczba = pobierz.nextInt();

        while (liczba != 0) {

            System.out.println("Bomba wybuchnie za: " + liczba);
            liczba -=1;
        }
        System.out.println(liczba + " bomba wybuchła");
    }


}
