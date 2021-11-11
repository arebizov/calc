package com.company;
public class Game {
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz =new Fizzbuzz(3);
        fizzbuzz.div();

    }
}
class Fizzbuzz{
    private double num1;
    public Fizzbuzz( double num1){
        this.num1 =  num1;

    }
    public void  div (){
      if (num1%3==0&num1%5==0)
            System.out.println("fizzbizz");
      else if (num1%3==0)
          System.out.println("fizz");
      else if (num1%5==0)
          System.out.println("bizz");
        }
}


