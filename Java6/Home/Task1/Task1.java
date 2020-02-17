package com.example.demo.Java6.Home.Task1;

import java.util.Set;
import java.util.TreeSet;

/*
Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets
 */
public class Task1 {

    public static void main(String[] args) {

        TreeSet <String> set1 = new TreeSet<>();
        TreeSet <String> set2 = new TreeSet<>();

        set1.add("Oleh");
        set1.add("Ira");
        set1.add("Oksana");
        set1.add("Dima");

        set2.add("Vira");
        set2.add("Oleh");
        set2.add("Dima");
        set2.add("Ivan");

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        System.out.println("Union: " + union(set1,set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference (set1 - set2): " + difference(set1, set2));
    }

    public static Set union (Set set1, Set set2){
        Set  treeSet = new TreeSet<>(set1);
        treeSet.addAll(set2);
        return  treeSet;
    }

    public static <String> Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> tmp = new TreeSet<>();
        for (String x : set1)
            if (set2.contains(x))
                tmp.add(x);
        return tmp;
    }

    public static Set difference (Set set1, Set set2){
        Set  treeSet = new TreeSet<>(set1);
        treeSet.removeAll(set2);
        return  treeSet;
    }

}
