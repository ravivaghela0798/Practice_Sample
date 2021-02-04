package com.company;

public class Swapping {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(a,b);
    }

    public static void swap(int num1, int num2){
        System.out.println("Values Before Swapping are [ A : " + num1 + "] " + " [ " + " B : " + num2 + " ] ");
        int c = num1;
        num1 = num2;
        num2 = c;
        System.out.println("Values After Swapping are [ A : " + num1 + " [ " + " [ " + " B : " + num2 + " ] ");

    }
}
