package com.company;

public class Functions {
    public static void printChorus(){  //идентификатор доступа, функция статична, тип возвращаемого значения и имя функции без параметров
        System.out.println("Привет из функции!");  //вывод на экран сообщения
    }

    public static void main(String[] args) {
        printChorus();
        printToo("Света");
        System.out.println(isPositive( -5.3));
        myNameAge("Света",46);
    }
    static void printToo(String name) {
        System.out.println("Привет передаёт "+name);
    }
    static boolean isPositive(double x) {
        if (x>0) {
            return true;

        }
        else {
            return false;
        }


    }
    static void myNameAge(String myname, int x) {
        int year = 2020 - x;
        System.out.println(myname + " was born at "+year);

    }

}

