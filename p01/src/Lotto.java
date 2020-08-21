import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    private static boolean doesValueExistInArray(int value , int [] numbers ){
        for (int i = 0; i < numbers.length; i++){
            if(value == numbers[i]){
                return true;
            }
        }
        return false;
    }
    private static boolean inRange(int number, int []array) {
        for(int i =0; i < array.length; i++) {
            if (number<1 || number>46) {
                System.out.println("The number is out of range!");
                return false;
            }

        }
        return true;
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



    private static int [] getlotteryArray(){
        boolean isRepeated; //equal to doesValueExistInArray()
        Random rand = new Random();
        int min = 1, max = 46, slots = 6; //to define var to be const values "final"

        int lotteryArray[] = new int[slots]; //all elements are initialised to be zeros

        int randomNumber = 0;
        boolean isValueExist;
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                isRepeated = false;
                randomNumber = rand.nextInt(max + 1 - min) + min; //1 to 46
                isRepeated =  doesValueExistInArray(randomNumber,lotteryArray);
            }
            while (isRepeated);
            lotteryArray[indexDrawn] = randomNumber;


        }

        return lotteryArray;

    }
    private static int [] getUserArray() {
        Scanner sc = new Scanner(System.in);
        boolean isRepeated;
        int tmpValue = 0;
        int[] userArray = new int[6];
        System.out.println("Enter six numbers of the array from 1 to 46, no duplicate numbers: ");

        for (int i = 0; i < userArray.length; i++) {
            do {
                isRepeated = false;
                tmpValue = getValidIntegerFromUser();

                if (tmpValue < 1 || tmpValue > 46) {
                    System.err.println("The number " + tmpValue + " is out of range!");
                    break;
                }

                isRepeated = doesValueExistInArray(tmpValue,userArray);
                if(isRepeated){
                    System.err.println("The number " + tmpValue + " is duplicated!");
                       break;
                }

            } while (isRepeated);
            userArray[i] = tmpValue;
        }// end of for
        return userArray;
    }

    private static void mutialNumbers() {
        boolean isRepeated = true;
        int value =0;
        int [] userArray = getUserArray();
        System.out.println("The array created is "+ Arrays.toString(userArray));
        int [] lotteryArray = getlotteryArray();
        System.out.println("The lottery array is "+ Arrays.toString(lotteryArray));




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




