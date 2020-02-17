package com.example.demo.Java3.Java3_praktic;

public class main_employe {
    public static void main(String[] args) {

        Employee em1 = new Employee("ira",5000, 40);

        Employee em2 = new Employee("Sara", 6000);
        em2.setHours(14);

        Employee em3 = new Employee();
        em3.setHours(23);
        em3.setName("Petro");
        em3.setRate(699999);

        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());

        em3.changeRait(3000);
        em1.Sallery(5000,40);
        em1.bonuses();

    }


}
