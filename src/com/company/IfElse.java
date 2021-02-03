package com.company;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if(age>60)
        {
            System.out.println("You are More experienced");

        }
        else if (age>50)
        {
            System.out.println("You are Experienced");
        }
        else if(age>40)
        {
            System.out.println("You are little experienced");
        }
        else
        {
            System.out.println("You are not experienced");
        }
    }

}
