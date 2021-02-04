package com.company;

public class MethodOverLoading {


    public static void main(String[] args) {

        int length = 50;
        int width = 15;
        float r = 2.5f;

        int rectangle_area = area(50,10);
        float circle_area = area(r);

        System.out.println("Area of Rectangle is : " + rectangle_area);
        System.out.println("Area of Circle is : " + circle_area);

    }

    public static int area(int a, int b){

        int result = a*b;
        return result;
    }
    public static float area(float n){

        float result = 3.14f*n*n;
        return result;
    }
}
