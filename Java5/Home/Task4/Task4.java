package com.example.demo.Java5.Home.Task4;

import java.util.Scanner;

/*
Organize entering integers until the first negative number.
Count the product of all entered even numbers.

 */
public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] integer = new int[5];
        int dani=1;
        int num;
        int count= 0;
        for (int i = 0; i <integer.length ; i++) {
            System.out.println("Input numbers");
            num = sc.nextInt();
                if(num<=0){
                count++;
                    break;
                }
                if(num%2 ==0){
                    dani *= num;
                }

        }
        System.out.println("All number ARE = " + dani);

        }




    }


