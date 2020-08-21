package com.company;
import java.util.Scanner;

public class AgeName {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        String name = s.nextLine();
        System.out.println("Ok, " +name+ ", how old are you?");
        int age = s.nextInt();
        if (age<25) {
            System.out.println("You can't rent a car, "+name);
            if (age<18) {
                System.out.println("You can't vote, "+name);
                if (age<16) {
                    System.out.println("You can't drive, "+name);
                }

            }

        }

        else {
            System.out.println("You can do anything that's legal , "+name);
        }
    }
}
