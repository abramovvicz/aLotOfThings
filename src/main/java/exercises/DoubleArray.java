/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package exercises;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        DoubleArray doubleArray = new DoubleArray();
        doubleArray.showTable();

    }

    private void showTable() {
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                table[i][j] = 0;
                if (i==3)
                {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j]);
            }
        }

    }
}