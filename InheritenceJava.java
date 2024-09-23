package com.CoreJava;

class Shape{
    public void area(){
        System.out.println("this is parent class area");
    }
}

class Circle extends Shape{
    public void areaaa() {
        super.area();
        System.out.println("this is child circle class");
    }
}

class Triangle extends Circle{
    public void areaa() {
        super.areaaa();
        System.out.println("this is triangle classs");
    }
}

public class InheritenceJava {
    public static void main(String[]args){
Triangle c=new Triangle();
c.areaa();
    }
}
