/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;

public class ClassesAndObjetcs {
    public static void main(String[] args) {


        Person bartek = new Person("Bartosz");
        bartek.setAge(36);
        //bartek.age = 36;
        //bartek.name = "Bartosz";

//        tutorials.basic.Person michal = new tutorials.basic.Person("Michał");
//        michal.setAge(41);
        //michal.age = 40;
        //michal.name = "Michał";

//        michal.sayHelloTo(bartek);
//        bartek.sayHelloTo(michal);

//        System.out.println(michal.getName() + " is " + michal.getAge() +" years old");
//        System.out.println(bartek.getName() + " is " + bartek.getAge() +" years old");

        Person john;
        john = new Person("John");
        john.setAge(20);
        celebrateBirthDay(john);
        System.out.println(john.getAge());
    }

    private static void celebrateBirthDay(Person john) {
        john.setAge(john.getAge()+1);
    }


}

