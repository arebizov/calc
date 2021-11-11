package com.company;
public class Calculator {
    public static void main(String[] args) {
    Calc calc =new Calc(1,2);
    calc.sum();
    calc.div();
    calc.multi();
    calc.sub();
    }
}
class Calc{
   private double num1;
   private double num2;
   public Calc( double num1, double num2){
   this.num1 =num1;
   this.num2 = num2;
   }
   public void  sum (){
       double s = num1+num2;
       System.out.println(s);
   }

    public void  div (){
        double d = num1/num2;
        System.out.println(d);
    }
    public void  multi (){
        double m = num1*num2;
        System.out.println(m);
    }
    public void  sub (){
        double s1 = num1+num2;
        System.out.println(s1);
    }
}
