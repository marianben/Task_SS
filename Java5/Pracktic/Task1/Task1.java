package com.example.demo.Java5.Pracktic.Task1;
/*
Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
    What values there are more: negative or positive?

 */
public class Task1 {

    public static void main(String[] args) {

        int [] arr = {1,2,-7,4,5,6,7,-88,9,20};
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max number with array are ="+max);

        int sumPositive = 0;
        for (int i:arr) {
            if(i>0){
                sumPositive+=i;
            }
        }
        System.out.println("Sum positive = "+sumPositive);

        int amount_negative = 0;
        for (int i:arr) {
            if (i<0){
                amount_negative++;
            }
        }
        System.out.println("Negative number are = " + amount_negative);

        int amout_positive=0;
        for (int i:arr) {
            if (i>0){
                amout_positive++;
            }

        }
        if(amount_negative>amout_positive){
            System.out.println("Negative are more");
        }else {
            System.out.println("Positive are more");
        }
    }

}
