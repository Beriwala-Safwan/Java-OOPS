package com.CoreJava;

import java.util.Scanner;

public class MiniProject {

    public static void main(String[]args) {
        int Guessnumber = (int) (Math.random() * 100);

        int Usernumber;
        do {
            System.out.println("guess my number");
            Scanner sc = new Scanner(System.in);
            Usernumber = sc.nextInt();

            if (Usernumber == Guessnumber) {
                System.out.println("you won");
                break;
            } else if (Usernumber > Guessnumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is small");
            }
        } while (Usernumber >=0);
        System.out.println("my number was "+Usernumber);
        System.out.println("guess number "+Guessnumber);
    }
}
