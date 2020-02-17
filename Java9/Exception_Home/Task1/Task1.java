package com.example.demo.Java9.Exception_Home.Task1;

import java.io.IOException;
import java.util.Scanner;

/*
Create method div(), which calculates the dividing of two double numbers.
 In main method input 2 double numbers and call this method. Catch all exceptions.

 */
public class Task1 {


    public static void main(String[] args) {

        try{
            System.out.println("div = " + div());
        }catch (NumberFormatException n){
            n.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }catch (Div div){
            div.printStackTrace();
        }


    }

    private static int div() throws Div, NumberFormatException, IOException {

        int a = getInt();
        int b = getInt();

        if (b == 0&&b<0) {
            throw new Div("Don't divide to zero");
        } else {
            return a / b;
        }

    }

    private static   int getInt() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you integer number: ");
        return Integer.parseInt(sc.next());

    }
}

