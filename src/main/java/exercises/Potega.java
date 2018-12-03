/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Scanner;

public class Potega {
    public static void main(String[] args) {
        potega();
    }

    private static void potega() {
        System.out.println("podaj liczbę podnoszoną do potęgi");
        Scanner getNumber1 = new Scanner(System.in);
        double liczba = getNumber1.nextInt();

        System.out.println("podaj potęgę");
        Scanner getNumber2 = new Scanner(System.in);
        double potega = getNumber2.nextInt();

        double wynik = Math.pow(liczba, potega);
        System.out.println("wynik = " + wynik);
    }

}
