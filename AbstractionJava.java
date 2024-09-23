package com.CoreJava;
abstract class Accelator{
    abstract void race();

    public void meter(){
        System.out.println("showing sppedo meter");
    }
}

class Activa extends Accelator{
    public void race(){
        System.out.println("activa pusing Accelator");
    }
}
class Car extends Accelator{
    public void race(){
        System.out.println("car is pusshing Accelator");
    }
}

public class AbstractionJava {
    public static void main(String[]args) {
   Car c=new Car();
   c.race();
   c.meter();
    }
    }

