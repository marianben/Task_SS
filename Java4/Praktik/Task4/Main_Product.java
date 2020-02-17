package com.example.demo.Java4.Praktik.Task4;

import java.util.Scanner;

/*
Create class Product with fields name, price and quantity.
Create four instances of type Product.
Display the name and quantity of the most expensive item.
Display the name of the items, which has the biggest quantity.
 */
public class Main_Product {

    public static void main(String[] args) {

        Product p1 = new Product("Moloko", 140,4);
        Product p2 = new Product("Sik", 23,45);
        Product p3 = new Product("Voda", 85,81);
        Product p4 = new Product("Rom", 65,32);

        System.out.println("Input what you want to do: 1. Most expresive ");
        System.out.println("2.Most quantity");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.print("Most expensive = ");
                if(p1.getPrice()>p2.getPrice()&&p1.getPrice()>p3.getPrice()&&p1.getPrice()>p4.getPrice()){
                    System.out.println(p1.getName() +" "+ p1.getQuantity());
                }else if(p2.getPrice()>p1.getPrice()&&p2.getPrice()>p3.getPrice()&&p2.getPrice()>p4.getPrice()){
                    System.out.println(p2.getName() +" "+p2.getQuantity());
                }else  if(p3.getPrice()>p2.getPrice()&&p3.getPrice()>p1.getPrice()&&p3.getPrice()>p4.getPrice()){
                    System.out.println(p3.getName() +" "+p3.getQuantity());
                }else if(p4.getPrice()>p2.getPrice()&&p4.getPrice()>p3.getPrice()&&p4.getPrice()>p1.getPrice()){
                    System.out.println(p4.getName() +" "+p4.getQuantity());
                }else{
                    System.out.println("All is rivni");
                }
            case 2:
                System.out.print("Most Quantity = ");
                if(p1.getQuantity()>p2.getQuantity()&&p1.getQuantity()>p3.getQuantity()&&p1.getQuantity()>p4.getQuantity()){
                    System.out.println(p1.getName() );
                }else if(p2.getQuantity()>p1.getQuantity()&&p2.getQuantity()>p3.getQuantity()&&p2.getQuantity()>p4.getQuantity()){
                    System.out.println(p2.getName());
                }else  if(p3.getQuantity()>p2.getQuantity()&&p3.getQuantity()>p1.getQuantity()&&p3.getQuantity()>p4.getQuantity()){
                    System.out.println(p3.getName());
                }else if(p4.getQuantity()>p2.getQuantity()&&p4.getQuantity()>p3.getQuantity()&&p4.getQuantity()>p1.getQuantity()){
                    System.out.println(p4.getName());
                }else{
                    System.out.println("All is rivni");
                }

        }

    }

}
