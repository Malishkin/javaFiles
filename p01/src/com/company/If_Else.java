package com.company;
import java.util.Scanner;

public class If_Else {
    public static void main(String [] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String myname = s.nextLine();
        System.out.println("Отлично," +myname+ ", сколько тебе лет?");
        int myage = s.nextInt();
        if (myage<21) {
            System.out.println("Ты не можешь купить водку, "+myname);
            if (myage<18) {
                System.out.println("Ты не можешь голосовать, "+myname);
                if(myage<16) {
                    System.out.println("Ты не можешь водить машину, "+myname);
                }

            }
        }
        else {
            System.out.println("Тебе можно всё, "+myname);
        }
    }
}
