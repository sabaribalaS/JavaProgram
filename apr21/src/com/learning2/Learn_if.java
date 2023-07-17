package com.learning2;
 vclass Learn_if
{
public static void main(String[] args)
{

Learn_if li=new Learn_if();
li.find_highest_scorer(90,95);
}
void find_highest_scorer(int vk, int msd)
{
//int vk=95;
//int msd=n100;
if(vk>msd)
{
  System.out.println(vk);
}
else if(msd>vk)
{
System.out.println(msd);
}
else
{
System.out.println(vk + msd);
}


}


}
