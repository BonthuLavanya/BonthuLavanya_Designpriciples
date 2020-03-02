package com.epam2.Cal;
public class Calculator{
  int firstnumber,secondnumber;
  Calculator(int firstnumber,int secondnumber)
  {
    this.firstnumber=firstnumber;
    this.secondnumber=secondnumber;
  }
  public int add(){return (firstnumber+secondnumber);}
  public int subract(){return (firstnumber-secondnumber);}
  public int multiply(){return (firstnumber*secondnumber);}
  public float divide(){return (firstnumber/secondnumber);}
}
