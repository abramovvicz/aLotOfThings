/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        sumaLiczb();
    }

    public static void sumaLiczb() {
        System.out.println("podaj liczbę dodatnią");
        Scanner scanner = new Scanner(System.in);
        double podanaLiczba = scanner.nextInt();
        double suma = 0;

        for (int i = 0; i <=podanaLiczba; i++) {

            System.out.println(i);
            suma += i;
            System.out.println("suma :" + suma);
        }


    }

}
