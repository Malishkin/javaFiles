package com.company;
import java.util.Scanner;

public class StringFunc {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        System.out.println("Enter two words:");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        if (str1.length()>str2.length()) {
            System.out.println("The word "+str1+ " is longer then the word "+str2);

        }
        else if (str2.length()>str1.length()) {
            System.out.println("The word "+str2+ " is longer then the word "+str1);

        }
        else {
            System.out.println("Two words are equal");
        }
        String str3 = "hello";
        String str4 = "world";
        String subS1 = str3.substring(0,2);
        String subS2 = str3.substring(2);
        String conS1 = subS1.concat(str4);
        String conS2 = conS1.concat(subS2);
        System.out.println(conS2);
    }
}
