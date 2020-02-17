package com.example.demo.Java6.Praktic.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
In the main() method declare map employeeMap of pairs <Integer, String>.
Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
Ask user to enter ID, then find and write corresponding name from your map.
If you can't find this ID - say about it to user (use function containsKey()).
Ask user to enter name, verify than you have name in your map and write corresponding ID.
 If you can't find this name - say about it to user (use function containsValue()).
 */
public class Task2 {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Olia");
        employeeMap.put(3, "Olia");
        employeeMap.put(4, "rostik");
        employeeMap.put(5, "Ira");
        employeeMap.put(6, "angolini");
        employeeMap.put(7, "Ira");

       // PrintMap(employeeMap);
        //GetValueByKey(employeeMap);
        //GetKey(employeeMap);
        //GetKey(employeeMap);
        GetValueByName(employeeMap);

    }

    public static Map<Integer, String> PrintMap(Map<Integer, String> employeeMap) {
        HashMap<Integer, String> PrintMap = new HashMap<>();
        PrintMap.putAll(employeeMap);
        for (Map.Entry<Integer, String> integerStringMap : employeeMap.entrySet()) {
            System.out.println(integerStringMap.getKey() + " = " + integerStringMap.getValue());
        }
        return PrintMap;
    }

    public static void  GetValueByKey(Map<Integer, String> employeeMap) {
        System.out.println("Input kay ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        Map<Integer, String> getValue = new HashMap<>();
        getValue.putAll(employeeMap);
        System.out.println( getValue.get(inputNumber));
    }

    public static void  GetKey(Map<Integer, String> employeeMap) {
        System.out.println("Input kay ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        Map<Integer, String> getByKay = new HashMap<>();
        getByKay.putAll(employeeMap);
        System.out.println(getByKay.containsKey(inputNumber));
    }

     public static void  GetValueByName(Map<Integer, String> employeeMap){
         System.out.println("Input name");
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         for (Map.Entry<Integer, String> inger: employeeMap.entrySet()) {

             if(inger.getValue().equalsIgnoreCase(name)) {
                 System.out.println(inger.getKey());
                 System.out.println("Are there value = " + employeeMap.containsValue(name));
             }else {
                 System.out.println("There are not a value   " + employeeMap.containsValue(name));
                 break;
             }
         }
    }

}
