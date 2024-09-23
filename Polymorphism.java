package com.CoreJava;
class Studentt{
    int age;
    String name;

    public void Printinfo(int age){
        System.out.println(age);
    }

    public void Printinfo(int age,String name){
        System.out.println(age+ "  "+name);
    }

    public void Printinfo(String name){
        System.out.println(name);
    }
}
public class Polymorphism {
    public static void main(String[]args){
        Studentt st=new Studentt();
        st.name="safwan beriwala";
        st.age=23;
        st.Printinfo(st.age);
        st.Printinfo(st.name);
        st.Printinfo(st.age, st.name);

    }
}
