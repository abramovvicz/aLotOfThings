/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;public class Password {

    static final String PROMPT1 = "Do You want password?";
    static final String PROMPT2 = "You have to solve the mystery!";


    public static void main(String[] args) {

        for (int i = 0; i < PROMPT2.length(); i++) {
            for (int j = 0; j < PROMPT2.length(); j++)

                if (i == 4 && j == 5) {
                    System.out.println("?");
                    substringString(PROMPT2, i, j);
                    substringString(PROMPT1, i, j);
                } else if (i == 7 && j == 8) {
                    substringString(PROMPT1, i, j);
                } else if (i == 9 && j == 10) {
                    substringString(PROMPT2, i, j);
                } else if (i == 10 && j == 11) {
                    substringString(PROMPT2, i, j);
                } else if (i == 19 && j == 20) {
                    substringString(PROMPT1, i, j);
                } else if (i == 20 && j == 21) {
                    substringString(PROMPT2, i, j);
                    substringString(PROMPT2, i - 5, j - 5);
                    System.out.println("!");
                }
        }

    }

    private static void substringString(String prompt, int i, int j) {
        int subI = i;
        int subJ = j;
        String s = prompt.substring(subI,subJ);
        System.out.println(s);

    }
}


