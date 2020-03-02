package com.epam2.Cal;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App{
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter First number:");
    int firstnumber=obj.nextInt();
    System.out.println("Enter First number:");
    int secondnumber=obj.nextInt();
    System.out.println("Enter the Operator(+,-,*,/):");
    String operator=obj.next();
    Calculator c=new Calculator(firstnumber,secondnumber);
    switch(operator)
    {
      case "+":System.out.println(c.add());
               break;
      case "-":System.out.println(c.subract());
               break;
      case "*":System.out.println(c.multiply());
               break;    
      case "/":System.out.println(c.divide());
               break;    
    }
    obj.close();
  }
}
