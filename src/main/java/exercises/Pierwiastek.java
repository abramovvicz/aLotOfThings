/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Scanner;

public class Pierwiastek {
    public static void main(String[] args) {
        Pierwiastek pierwiastek = new Pierwiastek();
        pierwiastek.countSqr();
    }

    private void countSqr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe aby obliczyć sqrt");
        int liczba = scanner.nextInt();

        do {

            int wynik = (int) Math.sqrt(liczba);
            System.out.println(wynik);
            break;

        } while (liczba > 0);

    }
}
