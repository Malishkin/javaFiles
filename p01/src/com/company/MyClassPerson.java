
package com.company;

import java.sql.Driver;

public class MyClassPerson {
    String fname = "Malachi";
    String lname = "Gutman";
    int age = 42;
    public MyClassPerson(int a, String n) {
        age = a;
        fname = n;


    }

    public static void main(String [] args) {
        MyClassPerson myObject = new MyClassPerson(52, null);
        Parametr sveta = new Parametr(173,"Sveta");
        Car toyota = new Car();
        toyota.actualSpeed(120);
        sveta.love("Malachi");
        Parametr malachi = new Parametr(170,"Malachi");
        malachi.love("Sveta");
        Parametr mama = new Parametr("Lena");
        Parametr anton = new Parametr(170,"Anton");
        System.out.println(mama.name);




        System.out.println("The first name is "+myObject.fname);
        System.out.println("The last name is "+myObject.lname);
        System.out.println("The age is "+myObject.age);
        System.out.println("My name is "+sveta.name);
        System.out.println("His name is "+malachi.name);
        System.out.println("Sveta's height is "+sveta.height);
        System.out.println("");
        Student freshmen = new Student(42,"Malachi",1);
        freshmen.tell();




    }
}
