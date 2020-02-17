package com.example.demo.Java8.Pracktic.String_Task2;
/*
Enter surname, name and patronymic on the console as a variable of type String.
 Output on the console:
surnames and initials name
name, middle name and last name

 */
public class Task2 {

    public static void main(String[] args) {

        String name = "Ivan";
        String surname = "Ivanov";
        String patronimic = "Ivanovuch";
        System.out.println(name + " " +surname.charAt(0) +"."+ patronimic.charAt(0)+".");
        System.out.println(name + " " + surname);



    }

}
