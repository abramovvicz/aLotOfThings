/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Scanner;

public class LiczbyPodzielne {

    public static void main(String[] args) {
        obliczLiczby();
    }

    private static void obliczLiczby() {
        int liczba;
        int dzielnik;

        System.out.println("ten program drukuje wszystkie liczby \n  mniejsze od podaje i podzielne przez podany dzielnik");
        System.out.print("Podaj liczbę: ");
        Scanner getLiczba = new Scanner(System.in);
        liczba = getLiczba.nextInt();
        System.out.print("podaj dzielnik");
        Scanner getDzielnik = new Scanner(System.in);
        dzielnik = getDzielnik.nextInt();


        for (int i = 1; i < liczba+1; i++) {
            if (i < liczba) {
                if(i%dzielnik==0)
                System.out.println("te liczby sa mniejsze od podajen liczbyi są podzielne przez podany dzielnik " + i);
            }

        }


    }
}
