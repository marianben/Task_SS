package com.example.demo.Java9.Exeption_Pracktic.Task1;

import java.io.IOException;
import java.util.Scanner;

/*
Create a method for calculating the area of a rectangle int squareRectangle (int a, int b),
 which should throw an exception if the user enters negative value.
  Input values a and b from console. Check the squareRectangle method in the method main.
   Check to input nonnumeric value.

 */
public class Task1 {

    public static void main(String[] args) {
    try{
        int a,b;
        a = format();
        b = format();
        System.out.println(squareRectangle(a,b));
    }catch (NumberFormatException number){
        number.printStackTrace();
        System.out.println("Bad number");
    }catch (IOException e){
        e.printStackTrace();
        System.out.println("Exeption");
    }catch (LessZerroValue lessZerroValue){
        lessZerroValue.printStackTrace();
        System.out.println("Less zero");
    }

    }

    public static int squareRectangle(int a, int b){
        int result = a*b;
        return result;

    }

    public static int format () throws NumberFormatException, IOException, LessZerroValue{
        System.out.println("Intput first number");
        int value;
        Scanner sc = new Scanner(System.in);
        value = Integer.parseInt(sc.next());
        if(value>0){
            return value;
        }else {
            throw new LessZerroValue();
        }
    }

    public static class LessZerroValue extends Exception{

        private LessZerroValue() {

        }

        private LessZerroValue(String arg0) {
            super(arg0);
        }

    }
}
