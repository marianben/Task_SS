package com.example.demo.Java5.Home.Task3;
/*
   Enter 5 integer numbers. Find
   position of second positive number;
   minimum and its position in the array.

    */
public class Task3 {

        public static void main(String[] args) {

            int [] int_number = {43,-32,6,12,-74};
            int count = 0;
            int number;
            for (int i = 0; i <int_number.length ; i++) {
                if (int_number[i] > 0) {
                    count++;
                }
                if (count == 2)
                {
                    System.out.println(int_number[i]);
                    break;
                }
            }

            int min = 0;
            int min_arr= int_number[0];
            for (int i = 0; i <int_number.length ; i++) {
                if(int_number[i]<min_arr){
                    min_arr=int_number[i];
                    min=i;
                }
            }
            System.out.println("min = " + min_arr + " position = "+ min);

        }

    }


