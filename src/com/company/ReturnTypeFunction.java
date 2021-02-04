package com.company;

public class ReturnTypeFunction {

    public static void main(String[] args) {

        ReturnTypeFunction ob = new ReturnTypeFunction();
        int x = 10;
        int y = 20;
        int get_result = ob.add(x,y);
        System.out.println(get_result);
    }


    public int add(int num1, int num2){
        int result = num1 + num2;


        return result;
    }
}
