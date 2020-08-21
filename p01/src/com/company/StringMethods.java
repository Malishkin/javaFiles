package com.company;

public class StringMethods {
 static void longString (String name, String name1) {
     if (name.length()>name1.length()) {
         System.out.println(name);
     }
     else {
         System.out.println(name1);
     }
 }
 public static void main (String [] arg) {
     longString("world", "hello world");
 }
}
