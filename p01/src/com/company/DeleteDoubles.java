package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DeleteDoubles {
    static boolean duplicates(int[] array) {
        for (int j=0;j<array.length;j++)
            for (int k=j+1;k<array.length;k++)
                if (k!=j && array[k] == array[j]) {
                    return true;
                }
        return false;
    }
    public static void main (String[] args) {
        int [] userArray = null;
        Scanner sc = new Scanner(System.in);
        userArray = new int[6];
        System.out.println("Enter the six numbers of the array, no duplicate elements: ");

    }

}


