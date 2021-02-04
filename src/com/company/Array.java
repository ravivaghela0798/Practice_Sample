package com.company;

public class Array {
    public static void main(String[] args) {

//        char[] a = new char[5];
//        a[0] = 'A';
//        a[1] = 'B';
//        a[2] = 'C';
//        a[3] = 'D';
//        a[4] = 'E';
//
//        for( int i=0; i<5; i++){
//
//            System.out.println(a[i]);
//        }

//        int[] a = new int[10];
//        for (int i=0; i<10; i++){
//            a[i]=i;
//            System.out.println(a[i]);
//        }
//      adding two arrays........
        int num = 5;
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        for(int i=0; i<5; i++){
            a[i]=i;
        }
        System.out.println("Values in Array A : ");
        for(int i=0; i<5; i++){
            b[i] = num;
            ++num;
        }
        for(int i=0; i<5; i++){
            System.out.println(a[i] + " ");
        }

        System.out.println();
        System.out.println("Values of Array B : ");

        for(int i=0; i<5; i++){
            System.out.println(b[i] + " ");
        }
        for (int i= 0; i<5; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println();
        System.out.println("Value of Array C : ");

        for(int i=0; i<5; i++){
            System.out.println(c[i] + " ");
        }
    }
}
