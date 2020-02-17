package com.example.demo.Java5.Home.Task2;
/*
Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive or product
of last 5 element in the other case.

 */
public class Task2 {

    public static void main(String[] args) {

        int [] integer_number ={1,2,3,4,5,-9,-8,5,-2,-7};
        int sum=0;
        for (int i = 0; i <5; i++) {
            if (integer_number[i]>0){
                sum+=integer_number[i];
                integer_number[i]=sum;
            }
        }

        if(sum>0){
            System.out.println(sum);
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= integer_number[i];
            }
            System.out.println(product);
        }
        }
    }


