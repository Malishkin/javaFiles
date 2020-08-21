package com.company;

public class AmericanLongestName {
    public static String FindLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i<size; i++) {
            if( names[i].length()>longestName.length()) {
                longestName=names[i];

            }
        }
        return longestName;
    }
    public static void  main(String [] args) {
        String [] names1 = {"Natasha", "Zhenia", "Alex", "Mark", "Anton"};
        System.out.println(FindLongestName(names1));
    }
}
