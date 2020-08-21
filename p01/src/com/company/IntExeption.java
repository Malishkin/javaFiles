package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class IntExeption {
    private static int [] getUserArray() {
        Scanner sc = new Scanner(System.in);

        boolean isRepeated;
        int tmpValue = 0;
        int[] userArray = new int[6];
        System.out.println("Enter six numbers of the array from 1 to 46, no duplicate numbers: ");



        boolean isNumberIntValid;




        for (int i = 0; i < userArray.length; i++) {
            do {
                isRepeated = false;


                // --- get valid integer from user


                tmpValue = getValidIntegerFromUser();

                for (int j = 0; j <= i; j++) {
                    if (userArray[j] == tmpValue) {
                        isRepeated = true;
                        System.err.println("The number " + tmpValue + " is duplicated!");
                        break;

                    }
                    else if(tmpValue<1||tmpValue>46) {
                        System.err.println("The number "+tmpValue+" is out of range!");
                        break;

                    }

                }

            }
            while (isRepeated);
            userArray[i] = tmpValue;

        }
        return userArray;
    }
    private static int [] getlotteryArray(){
        boolean isRepeated;
        Random rand = new Random();
        int min = 1, max = 46, slots = 6;

        int lotteryArray[] = new int[slots];

        int randomNumber = 0;
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                isRepeated = false;
                randomNumber = rand.nextInt(max + 1 - min) + min;
                for (int k = 0; k <= indexDrawn; k++) {
                    if (lotteryArray[k] == randomNumber) {
                        isRepeated = true;
                        break;
                    }
                }
            }
            while (isRepeated);
            lotteryArray[indexDrawn] = randomNumber;


        }

        return lotteryArray;


    }
    private static int getValidIntegerFromUser() {

        boolean isNumberIntValid = true;
        int validInteger = 0;




        do{
            try {
                Scanner sc = new Scanner(System.in);
                validInteger=sc.nextInt();
                isNumberIntValid = true;

            }catch (InputMismatchException e) {

                System.err.println("The format is not correct, please, enter the numeric value!");
                isNumberIntValid = false;


                //I've already found the bug!
            }
        }while(!isNumberIntValid);


        return validInteger;
    }
    private static void getGuessed() {
        int[]userArray=getUserArray();
        System.out.println("The array created is "+ Arrays.toString(userArray));

        int[] lotteryArray = getlotteryArray();
        System.out.println("The lottery array is "+ Arrays.toString(lotteryArray));

        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < lotteryArray.length; j++) {
                if (userArray[i]==lotteryArray[j]) {
                    System.out.println("You guessed the number "+userArray[i]);
                }

            }

        }

    }


    public static void main(String[] args) {
        getGuessed();


    }

}
