package com.example.demo.Java9.Exeption_Pracktic.Task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Create a class Plants, which includes fields int size, Color color and Type type,
and constructor where these fields are initialized. Color and type are Enum.
Override the method toString( ).
Create classes ColorException and TypeException and describe
there all possible colors and types of plants. In the method main
create an array of five plants. Check to work your exceptions.

 */
public class Task2 {

    public static void main(String[] args) throws IOException {
        List<Planet> plants = new ArrayList<Planet>();


        try {
            plants.add(new Planet(1232,Color.DARK,Type.BIG));
        } catch (ColorExeption e) {
            System.out.println(e.toString());
        } catch (TypeExeption e) {
            System.err.println(e.toString());
        }
        try {
            plants.add(new Planet(45,Color.WHITE,Type.SMALL));
        } catch (ColorExeption e) {
            System.out.println(e.toString());
        } catch (TypeExeption e) {
            System.err.println(e.toString());
        }
        try {
            plants.add(new Planet(8965,Color.GREEN,Type.VERY_BIG));
        } catch (ColorExeption e) {
            System.out.println(e.toString());
        } catch (TypeExeption e) {
            System.err.println(e.toString());
        }
        try {
            plants.add(new Planet(23054,"red","little"));
        } catch (ColorExeption e) {
            System.out.println(e.toString());
        } catch (TypeExeption e) {
            System.err.println(e.toString());
        }

        for (Planet planet:plants
             ) {
            System.out.println(planet);

        }
       // Planet [] planets = new Planet[5];

    //try {
      //  planets[0] = new Planet(17852, Color.DARK, Type.BIG);
        //planets[1] = new Planet(27841, Color.GREEN, Type.BIG);
        //planets[2] = new Planet(5685, Color.WHITE, Type.LITTLE);
        //planets[3] = new Planet(9874, Color.RED, Type.VERY_BIG);
        //planets[4] = new Planet(114796, Color.DARK, Type.SMALL);
    //}catch (ColorExeption colorExeption){


    }

}
