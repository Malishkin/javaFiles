package com.company;

public class ClassMain1 {

        public static void main(String[] args) {
            String a = new String("Wow");
            String b = "Wow";
            String c = a; //"Wow"
            String d = c; //"Wow"

            boolean b1 = a == b; //"Wow"
            boolean b2 = d.equals(b + "!"); //"Wow!"
            boolean b3 = !c.equals(a); //"Wow"

            if (b1 && b2 && b3) {
                System.out.println("Success!");
            }
            else {
                System.out.println("Not sussess...");
            }
        }

}
