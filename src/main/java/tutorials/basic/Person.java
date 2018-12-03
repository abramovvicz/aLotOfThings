/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;


public class Person {
     String people[];
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person (String name)
    {
        this.name= name;
        System.out.println("tutorials.basic.Person created");
    }

    public void sayHelloTo(Person person){
        System.out.println(getName() + " said hello to: " + person.getName());
    }
}
