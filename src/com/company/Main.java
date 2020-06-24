package com.company;
import java.util.Scanner;
public class Main {
static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        int array[] = new int[scr.nextInt()];
        int maxValue=array[0];
        int minValue=array[0];
        int sumOfEven=0;
        int sumOfNotEven = 0;


        for (int i = 0;i<array.length;i++){
            array[i]= scr.nextInt();
            if(maxValue<array[i]){
                maxValue = array[i];
            }
            else if(minValue>array[i]){
                minValue=array[i];
            }
        }
        for (int i = 0;i<array.length;i++){
            if(i%2==0){
                sumOfEven +=array[i];

            }else{
                sumOfNotEven +=array[i];
            }
        }
        System.out.println("min value of array is " + minValue + "\n"
                           +"max value of array is " + maxValue+"\n"
                           +"sum of even array cells is " +sumOfEven+"\n"
                            +"sum of not even array cells is " +sumOfNotEven);
    }
}

