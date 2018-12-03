/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;
import tutorials.basic.Person;

public class Arrays {

    public static void main(String[] args) {

        int[] myArray; // declaring an array that is store ints
        //myArray = new int[4]; //initialization our array to be capable of holding 4 ints

        myArray = new int[] {1,2,3,4,5,7,8,9,10};

        Person [] people;
        people = new Person[500];
        people[1].setName("steve");
        System.out.println(people[1]);
//        people[1] =  //??????


        /*myArray = new int[50000];

        for (int counter = 0; counter < myArray.length; counter++) {
            myArray[counter] = counter;
        }

*/
        for (int number : myArray) {
            System.out.println(number);
        }
    }
}
