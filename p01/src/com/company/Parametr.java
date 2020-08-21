package com.company;

public class Parametr {
    public int  height ;
    public String name = "Default";

    public void love(String name) {
        System.out.println("Love you, "+name);

    }
    public Parametr(int h, String n) {
        //constructor
        height = h;
        name = n;
    }
    public Parametr(String n) {
        name = n;
    }


}
