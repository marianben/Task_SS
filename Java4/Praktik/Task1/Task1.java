package com.example.demo.Java4.Praktik.Task1;

import java.util.Scanner;

/*
Enter three numbers. Find out how many of them are odd.

 */
public class Task1 {

    public static void main(String[] args){

        System.out.println("Input three numbers: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b)&&(a>=c)){
            System.out.println("A is bigger");
        }else if(b>=a&&b>=c){
            System.out.println( "B is bigger");
        }else if(c>=a&&c>=b){
            System.out.println("C is bigger");
        }else{
            System.out.println("Number is rivni");
        }


    }

}
