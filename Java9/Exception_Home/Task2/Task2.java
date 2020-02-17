package com.example.demo.Java9.Exception_Home.Task2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

/*
Write a method readNumber(int start, int end),
that read from console integer number and return it, if it is in the range [start...end].
If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

 */
public class Task2 {

    public static void main(String[] args) {

    int start =0;
    int end = 9;

        for (int i = 0; i < 10; i++) {

            try {
                System.out.println("Number is: " + readNumber(start,end));
            } catch (NumberFormatException e) {
                System.err.println("You intup wrong value");
            } catch(AnotherExeption a) {
                System.err.println(a.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static int readNumber(int start, int end)throws Exception{
       int number;
       number = getInt();
       if (number<start|| number>end){
          throw new AnotherExeption();
       }else {
           return number;
       }

    }

    public static int getInt()throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        return Integer.parseInt(sc.next());
    }

    public static class AnotherExeption extends Exception{

        private AnotherExeption() {

        }

        private AnotherExeption(String message) {
            super(message);
        }

        @Override
        public String toString() {
            return "AnotherExeption{}";
        }
    }
}
