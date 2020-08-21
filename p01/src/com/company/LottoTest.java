package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LottoTest {
    private static boolean inRange(int number, int []array) {
        for(int i =0; i < array.length; i++) {
            if (number<1 || number>46) {
                return true;
            }

            }
        return false;
        }
    private static boolean doesValueExistInArray(int value , int [] numbers ){
        for (int i = 0; i < numbers.length; i++){
            if(value == numbers[i]){
                return true;
            }
        }
        return false;
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

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int [] userArray = new int[6];
        System.out.println("Please, enter the number from 1 to 46 no duplicates:");
    }



    }


