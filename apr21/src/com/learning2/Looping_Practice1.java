package com.learning2;
class Looping_Practice1
{
public static void main (String []args)
{
Looping_Practice1 lp = new Looping_Practice1();
lp.print_reverse(9697);
}
void print_reverse(int cake)
{
while(cake>0)
{
System.out.println(cake%10);
cake=cake/10;
}
}}
