package com.CoreJava;


class Employee{
    private String name;
    private int age;



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age >= 18){
            this.age=age;
        }
        else {
            System.out.println("you r not adult");
        }
    }
}
public class EncapsulationJava {
    public static void main(String[]args) {

        Employee e=new Employee();
        e.setName("safwan");
        e.setAge(12);
        System.out.println(e.getAge());
        System.out.println(e.getName());

    }
}
