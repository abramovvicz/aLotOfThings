/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package advent.of.code;

public class Checksum {

    private String[] someText = new String[]{"bababc"};

    public static void main(String[] args) {
        Checksum checksum = new Checksum();
        checksum.check();
    }

    private void check() {
        for (int i = 0; i < someText.length; i++) {
            for (int j = someText.length; j > 0; j--) {
                System.out.println(someText[i]);
                System.out.println(someText[j]);
                if (someText[i].equals(someText[j])) {
                    System.out.println(true);

                }
            }
        }


    }
}