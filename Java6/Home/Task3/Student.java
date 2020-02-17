package com.example.demo.Java6.Home.Task3;

import java.util.*;

public class Student implements Comparable{

    private String name;
    private Course course;
    static CompareByName compareByName = new CompareByName();





    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public static CompareByName getCompareByName() {
        return compareByName;
    }

    public static void setCompareByName(CompareByName compareByName) {
        Student.compareByName = compareByName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void PrintStudent(List<Student> list, Course course){
        System.out.println("Student " + this.getName() + "Course" + this.getCourse());


    }

    public static class CompareByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {

            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class CompareByCourse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }
    }

    public static List<Student> sortByCourse(List<Student> list) {
        list.sort(new CompareByCourse());
        System.out.println("List has been sorted by course");
        return list;
    }

}
