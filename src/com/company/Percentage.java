package com.company;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("This is Your Result  ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Gujarati : ");
        int a = sc.nextInt();

        System.out.println("English : ");
        int b = sc.nextInt();

        System.out.println("Science : ");
        int c = sc.nextInt();

        System.out.println("Hindi : ");
        int d = sc.nextInt();

        System.out.println("Sanskrit :");
        int e = sc.nextInt();

        int total = a + b + c + d + e;
        System.out.println(total);

       float per = total/5f;
       System.out.println(per);



    }
}
