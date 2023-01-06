package com.abstrction;

public class Apartment extends Building{
    @Override
    public void building1() {
        int a = 20;
        int b = 30;
        int c= a+b;
        System.out.println(c);
    }

    @Override
    public void house2() {
        System.out.println("This is abstract classes and methods");

    }

    public static void main(String[] args) {
        Apartment a = new Apartment();
        a.building1();
        a.house2();
    }
}
