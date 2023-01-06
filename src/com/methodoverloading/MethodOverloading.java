package com.methodoverloading;

public class MethodOverloading {
    public static int addition(int a, int b, int c) {
        return a+b+c;
    }
    public static float addition(float a, float b){
        return a+b;
    }
    public static int Subtraction(int a , int b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.addition(23,34,67));
        System.out.println(MethodOverloading.Subtraction(45,34));
        System.out.println(MethodOverloading.addition(4.5f,5.6f));
    }
}
