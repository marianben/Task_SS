package com.example.demo.Java6.Praktic.Task1;

import java.util.*;

/*
Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection.
Print newCollection
Remove from collection myCollection elements, which are greater then 20.
Print result
Insert elements 1, -3, -4 in positions 2, 8, 5.
Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection
 */

public class Task1 {
    private static final int MAX_VALUE_FOR_5 = 5;
    private static final int MAX = 20;
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<Integer>();

        WriteToCollection(myCollection);
        System.out.println("----------");
        System.out.println(FindElement(myCollection,5));
        System.out.println("-----!----!-----");
        System.out.println(Biggers_20(myCollection,20));
        System.out.println("-------------");
        System.out.println(Insert_element(myCollection,4,12));
        System.out.println("!!!!!!!!!!!!-----!!!!!!!!!");
        PrintCollection(myCollection);
        System.out.println(".................");
        System.out.println(Sort_Collection(myCollection));
    }

    public static void WriteToCollection(Collection myCollection){
        int count = 0;
        for (int i = 0; i < 100000; i++) {
            if (count < 10) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input number");
                int num = sc.nextInt();
                myCollection.add(num);
                System.out.println(myCollection);
                count++;
            }
        }

    }

    public static  List<Integer> FindElement (List<Integer> myCollection, int maxValue) {
        List <Integer> newCollection = new ArrayList<Integer>();

        for (Integer integer : myCollection) {
            if (integer > maxValue) {
                newCollection.add(myCollection.indexOf(integer));

            }
        }
        return newCollection;
    }

    public static List<Integer> Biggers_20(List<Integer> myCollection, int maxValue){
       List<Integer>coll = new ArrayList<>();
       coll.addAll(myCollection);
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()){
            if(iterator.next()>maxValue){
                iterator.remove();
            }
        }

        return coll;
    }

    public static List<Integer> Insert_element (List<Integer>myCollection, int index, int value){

        myCollection.set(index,value);

        return myCollection;
    }

    public static void PrintCollection(List<Integer>myCollection){
        for (Integer integer : myCollection) {
            System.out.println("Position - " + myCollection.indexOf(integer)+ " value = "+ integer);
        }
    }

    public static  List<Integer> Sort_Collection(List<Integer>myCollection){
        List<Integer>collect = new ArrayList<>();
        collect.addAll(myCollection);
        Collections.sort(collect);
        return collect;
    }

}







