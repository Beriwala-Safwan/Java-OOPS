package com.CoreJava;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //METHODS
    public static void PrintHello(){
        System.out.println("hello java");
    }

    public  static int Add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        PrintHello();
        int result=Add(5,6);
        System.out.println(result);
        System.out.println("primitive data type");
        System.out.println("SHORT [2 BYTE]");
        System.out.println("LONG [8 BYTE]");
        byte b=120;
        System.out.println("BYTE [-12 - 127]" + b);
        int number=123456789;
        System.out.println("INT [4 BYTE]" + number);
        float f=3.14F;
        System.out.println("FLOAT [4 BYTE]" + f);
        double d=123456789000D;
        System.out.println("DOUBLE [8 BYTE]"+ d);
        char c='A';
        System.out.println("CHAR [2 BYTE]"+ c);
        boolean bb=true;
        System.out.println("BOOLEAN [0/1 TRUE/FALSE]"+bb);
        System.out.println("=============================");
        System.out.println("NON primitive data type");
        //length
        //charAt
        //replace
        //substring to fetch only specified string
        String s="safwan Abdulkarim beriwala";
        System.out.println("shows length of string " + s.length());
        System.out.println("shows character at specified index " + s.charAt(0));
       String s2= s.replace('w','v');
        System.out.println("new string after replace "+ s2);
       String substr=s.substring(7,17);
        System.out.println("sub string after "+ substr);

        System.out.println("=============================");
        System.out.println("ARRAYS IN JAVA");

        int[] marks=new int[3];
        //int[] marks={0,1,2,3,4,5,6}
        marks[0]=90;
        marks[1]=80;
        marks[2]=70;
        System.out.println("marks at first index " +marks[1]);
        System.out.println("length of an aray " +marks.length);
        System.out.println("to sort an aray use Arrays classs");

        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++)
            System.out.println("sorted aaray "+marks[i]);


        int[][] markes={{97,98,99},{100,90,80}};
        System.out.println(markes[1][1]);


        //CASTING

        double price=100.00;
        double finalprice=price+18;
        System.out.println(finalprice+ " implicit casting");

        int p=100;
        int fp=p+(int)19.99;
        System.out.println(fp + "explicit casting");

        //CONSTANTS VALUE NOT CHANGE

        System.out.println("====================================");

        final float PI=3.14F;
        System.out.println(PI +"constant");

        //MATHS CLASS


        System.out.println(Math.min(9,2));
        System.out.println(Math.max(8,9));
        System.out.println((int) (Math.random()*1000));

        System.out.println("====================================");
        //INPUT IN JAVA

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your age");
//        int age=sc.nextInt();
//
//        sc.nextLine();
//        System.out.println("enter your name");
//        String name=sc.nextLine();
//
//        System.out.println("your name is "+ name);
//        System.out.println("ypur age is " + age );

        System.out.println("====================================");

        //IF ELSE
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the  age");
        int age=sc.nextInt();

        if(age > 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("cannot vote");
        }

        System.out.println("====================================");
        //SWITCH CASE
        Scanner scc=new Scanner(System.in);
        System.out.println("enter the day");
        String day=scc.nextLine();
        switch (day){
            case "monday":
                System.out.println("your day is monday");
                break;
            case "tuesday":
                System.out.println(" your day is tuesday");
                break;
            case "wednesday":
                System.out.println("your day is wednesday");
                break;
            case "thursday":
                System.out.println("your day is thursday");
                break;
            case "friday":
                System.out.println("your day is friday");
                break;
            case "saturday":
                System.out.println("your day is saturday");
                break;
            default:
                System.out.println("sunday");
        }

        System.out.println("====================================");
        //FOR LOOPS

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====================================");
    //while loop
        int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }

        //DO WHILE LOOP
        System.out.println("====================================");
        int j=100;
        do {
            System.out.println(j);
            j--;
        }while (j >=1);


        Scanner sccc=new Scanner(System.in);
    int numberr=0;
        do {
            System.out.println("enter a number");
            numberr=sccc.nextInt();
            System.out.println("your number is "+numberr);
            System.out.println();
        }while (numberr >=0);

        System.out.println("the end");

        System.out.println("========================================");

        //BREAK AND CONTINUE

        int ii=0;
        while (true){

            if(ii==3){
                ii++;
                continue;
            }
            System.out.println(ii);
            ii++;
            if(ii>5){
                break;
            }
        }
        System.out.println("===========================");

        //TRY-CATCH

        int[] ar={1,2,3,4};
        try{
            System.out.println(ar[6]);
            }

        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code");


        }
}
