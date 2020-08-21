package com.company;
import java.util.Scanner;

public class Partlll {
    public static void main(String[] args) {
        int i;
        int sum =0;
        for (i=1; i<1000; i++) {
            sum = i+sum;
            System.out.println(sum);



       }
        System.out.println("--------");

        int x = 1024;
        while(x>1) {
            x = x/2;
            System.out.println(x);
        }

        System.out .println("-------");

        x = 10;
        while (x > 5) {
            System.out.println(x);
            x--;

        }
        System.out.println("======");
        i = 1;
        while (i<50) {
            System.out.println(i);
            i++;
        }
        System.out.println("*******");

        for(i=20;i>0;i-=2)
            System.out.println(i);

        System.out.println("///////");


        int y;
        sum = 0;
        for (y=1;y<1000;y++) {
            sum = y+sum;
            System.out.println(sum);
        }
        System.out.println("________");
        int j = 1024;
        while (j>1) {
            j = j/2;
            System.out.println(j);
        }









    }

}
