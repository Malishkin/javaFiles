package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerator {
    // define a function that get array and value as parameters and check if value is in array

    static boolean isValueInArray( int[] array , boolean value){


        return false;
    }
    static void duplicateNumbers(int[] array) {
        for(int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    System.out.println("The array indicates duplicate elements: "+array[j]);



                }
            }
        }
    }

    static void commonArray (int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("The common is "+array1[i]);
                }


            }
        }

    }




    public static void main(String[] args) {
        //How to enter functions because main is too long
        int[]userArray = new int[6];
        int[]lotoArray = new int[6];
        boolean isInputValid;
        int tmpValue=0;

        Scanner sc = new Scanner(System.in);
        userArray = new int[6];
        System.out.println("Enter six numbers of the array from 1 to 46, no duplicate elements: ");

        for (int i = 0; i < userArray.length; i++) {
            do {
                try {
                    tmpValue = sc.nextInt(); //could be a problem try - catch could help to while or do while
                    isInputValid = false;
                }
                catch(Exception e){
                    isInputValid = true;
                }
            }while(isInputValid==true);
            System.err.println("This is not a vald number, please, try again!");//if exeption - loop, else - get out of loop




            do {
                tmpValue = sc.nextInt();
            }while(tmpValue>=1 || tmpValue<45);
            System.err.println("This number is out of range!");

            // --- value is ok
            userArray[i] = tmpValue;

        }
        System.out.println("The array created is: "+Arrays.toString(userArray));
        duplicateNumbers(userArray);

        {
            lotoArray = new int[6];
            Random random = new Random();
            for(int i = 0; i < lotoArray.length; i++) {
                lotoArray[i] = ((int)(Math.random() * 46) +1 ); {

                }

            }
            System.out.println("Random lotoArray is: "+Arrays.toString(lotoArray));
            duplicateNumbers(lotoArray);

            commonArray(userArray,lotoArray);

        }
    }
}
