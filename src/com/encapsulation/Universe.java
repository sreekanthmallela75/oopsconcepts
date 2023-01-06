package com.encapsulation;

public class Universe extends Sun{
    @Override
    void lunarEclipse() {
        System.out.println("i am in lunarEclipse");
    }

    @Override
    void solarEclipse() {
        System.out.println("i am in solarEclipse");
    }

    public static void main(String[] args) {
        Universe u = new Universe();
        u.lunarEclipse();
        u.solarEclipse();
    }
}
