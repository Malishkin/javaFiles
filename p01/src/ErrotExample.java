
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ErrotExample {
    static public void main (String [] arg)   {
        Scanner sc = new Scanner(System.in);
        int userArray[] = new int[6];
        System.out.println("Введите шесть номеров от 1 до 46");
        try {
            for (int i = 0; i<userArray.length; i++) {
                userArray[i] = sc.nextInt();
                if (userArray[i] < 1 || userArray[i] > 46) {
                    System.err.println("The number is out of range!");
                    break;
                }

            }
        } catch (Exception e) {
            System.err.println("Вы ввели не число!");
        }





    }
}
