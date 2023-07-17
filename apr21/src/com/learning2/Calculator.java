package com.learning2;
class Calculator
 {
public static void main(String[] args)
{
Calculator calc = new Calculator();
calc.add(); // Method Calling Statement
calc.sub();// (10,20);
calc.multiply(10,20);
}
void multiply(int no1,int no2)
{
System .out. println(no1*no2);
}
void add()
{ // Method Body /  Method Definition
System .out.println(10+20);
}
void sub()
{
System .out.println(20-10);
}
}
