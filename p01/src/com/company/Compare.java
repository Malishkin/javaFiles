package com.company;

public class Compare {
    private static int minArray(int[]array){
        int min = array[0];
        for(int i = 0; i<array.length;i++) {
            if (array[i]<min) {
                min = array[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {
        int x = minArray(new int[]{5,3});
        int y = minArray(new int[]{2,8});
        int z = minArray(new int[]{100,15});
        System.out.println(x+ " "+y+" "+z);
    }
}
