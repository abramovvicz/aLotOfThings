/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;

import java.util.Scanner;


public class Methods {
    static Scanner userInput;

    public static void main(String[] args) {


        userInput = new Scanner(System.in);


        System.out.println("Enter value of x to counter square of x \n");
        System.out.println("Square of x result is: " + square(Integer.parseInt(userInput.nextLine()))); //ciekawostka


        sayHelloWorld();
        sayHelloTo("John");

        int x = returnFive();
        System.out.println(x);

        int result = square(returnFive());
        System.out.println(result);

        generateAlphabet();
    }

    static void sayHelloTo(String name) {
        System.out.println("Hello,  " + name);

    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static int returnFive() {
        return 5;//userInput;
    }

    static int square(int x) {
        return x * x;
    }

    static void generateAlphabet()
    {
        char[] abc = new char[26];
        for(int i = 0; i<26;i++) {
            abc[i] = (char)('a'+i);

        }
        System.out.println(abc);
    }
}
