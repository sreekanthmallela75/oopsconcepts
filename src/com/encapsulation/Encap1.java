package com.encapsulation;

public class Encap1 {
     private String name;
    private Float sal;
     private int rollNo;

     public void setName(String name){
      this .name=name;

     }
     public String getName(){
         return name;
     }
     public void setSal(Float sal){
         this.sal = sal;
     }
     public Float getSal(){
         return sal;
     }
     public void setRollNo(int rollNo){
         this.rollNo = rollNo;
     }
     public int getRollNo(){
         return rollNo;
     }

    public static void main(String[] args) {
       Encap1 e = new Encap1();
     //  e.getName();
       e.setName("sree");
       //e.getRollNo();
       e.setRollNo(1);
       //e.getSal();
       e.setSal(33000f);
        System.out.println(e.getName());
        System.out.println(e.getRollNo());
        System.out.println(e.getSal());
    }
}


