package com.example.demo.Java4.Praktik.Task2;

import java.util.Scanner;

/*
Enter the number of the day of the week. Display the name in three languages.

 */
public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number day of week");
        int number = sc.nextInt();
        if ((sc != null) &&(number>0)) {
            switch (number){
                case 1:
                    System.out.println("Понедолок, Monday, Ponedilok " );
                    break;
                case 2:
                    System.out.println("Вівторок, Thursday, Vivtirok");
                    break;
                case 3 :
                    System.out.println("Вівторок, Wendsday, Sereda");
                    break;
                case 4:
                    System.out.println("Четвер, Tursday, Chetver");
                    break;
                case 5:
                    System.out.println("Пятниця, Friday, Piatniza");
                    break;
                case 6:
                    System.out.println("Субота, Sunday, Sybota");
                    break;
                case 7:
                    System.out.println("Неділя, Satuday, Nedilia");
                    break;
            }
        }else {
            System.out.println("Please input corect");
        }
        }

    }


