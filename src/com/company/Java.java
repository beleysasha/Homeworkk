package com.company;
import java.util.Scanner;
public class Java {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scr.nextInt();
        int[] array = new int[]{scr.nextInt(),scr.nextInt(),scr.nextInt(),scr.nextInt(),scr.nextInt()};
        int sumOfEven = 0;
        int sumOfNotEven = 0;
        for(int i = 0;i<array.length;i++){
            if (array[i]%2==0 && array[i]>=n){
                sumOfEven +=array[i];
            }else if(array[i]%2!=0 && array[i]>=n) {
                sumOfNotEven+=array[i];
            }
        }
        System.out.println("sum of even numbers that are >n is "+sumOfEven);
        System.out.println("sum of not even numbers that are >n is "+sumOfNotEven);
    }
}
