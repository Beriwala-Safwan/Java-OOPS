package com.CoreJava;
//ABSTRACTION
//INHERITENCE
//POLYMORPHISM
//ENCAPSULATION

class Student{
    int age;
    String name;

    public void Printinfo(){
        System.out.println("your age is " +this.age);
        System.out.println("your age is " +this.name);
    }

    //default constructor

    Student(){
        System.out.println("this is default constructor");
    }

    //parameter constructor

    Student(int age,String name){
        this.name=name;
        this.age=age;
    }
}
public class ClassObjects {
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="safwan";
        s1.age=23;
        s1.Printinfo();
        Student s2=new Student(23,"saffy");
        s2.Printinfo();
    }
}
