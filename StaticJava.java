package com.CoreJava;
//we not create an object to enter values to static fields
public class StaticJava {

    String name;
    static String school;
public static void changeschool(){
    school="my school";
}

public static void CalculateCube(int x){
    int c=x*x*x;
    System.out.println(c);
}
    public static void main(String[]args) {
        StaticJava.school="bright english school";
        StaticJava sj=new StaticJava();
        System.out.println(sj.name="safwan");
        System.out.println(sj.school);
        StaticJava.changeschool();
        StaticJava.CalculateCube(7);

    }
    }

