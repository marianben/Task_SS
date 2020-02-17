package com.example.demo.Java6.Home.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        Output the entities of the map on the screen.
        There are at less two persons with the same firstName among these 10 people?
        Remove from the map person whose firstName is ”Orest” (or other). Print result.
*/
public class Task2 {

    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Iger", "Kassilias");
        personMap.put("Sergio", "Ramos");
        personMap.put("Zina", "mark");
        personMap.put("perek", "Oleg");
        personMap.put("koren", "Oleg");
        personMap.put("somak", "Olena");
        personMap.put("Zlatan", "Ira");
        personMap.put("Zombi", "Petr");
        personMap.put("Zoozooo", "Alex");

        System.out.println(personMap);

        SameName(personMap);
        RemoveName(personMap, "Oleg");
        System.out.println(personMap);
    }

    public static void SameName(Map<String, String> personMap ){
        int count;
        for (Iterator<Map.Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
            count = 0;
            Map.Entry<String, String> entryi = (Map.Entry<String, String>) i.next();

            for (Iterator<Map.Entry<String, String>> j = personMap.entrySet().iterator(); j.hasNext();) {
                Map.Entry<String, String> entryj = (Map.Entry<String, String>) j.next();

                if (entryi.getValue().equals(entryj.getValue())) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("We have same names - " + entryi.getValue() + " " + entryi.getKey());
            }
        }
    }

    public static void RemoveName(Map<String, String> personMap,  String  name){
        for (Iterator<Map.Entry<String, String>> remove = personMap.entrySet().iterator(); remove.hasNext();) {
            Map.Entry<String,String> entryRemove = (Map.Entry<String, String>) remove.next();
            if ((entryRemove.getValue().equals(name))){
                remove.remove();
            }
        }


        }

}
