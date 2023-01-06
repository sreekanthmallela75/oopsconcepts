package com.interfaces;

public class Paradise implements Biryani,PannerButterMasala {
    @Override
    public void vegBiryani() {
        float a = 3.5f;
        float b = 1.5f;
        float c = a+b;
        System.out.println(c);
    }

    @Override
    public void rumaliRoti() {
        System.out.println("This is my favourite food");
    }

    public static void main(String[] args) {
        Paradise p = new Paradise();
        p.vegBiryani();
        p.rumaliRoti();
    }
}
