package com.CoreJava;
interface Animal{
     void walk();
}

interface Eat{
    void eat();
}

class myclass implements Animal,Eat{
    @Override
    public void walk() {
        System.out.println("animal can walk");
    }

    @Override
    public void eat() {
        System.out.println("horse only eats plants");
    }
}
public class InterfaceJava {

    public static void main(String[]args){
        myclass mc=new myclass();
        mc.eat();
        mc.walk();
    }
}
