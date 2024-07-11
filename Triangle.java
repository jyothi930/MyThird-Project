import java.util.*;
class Triangle
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   int a,b,c;
   System.out.println("Enter the values of a,b,c");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
  if(a==b && b==c)
{
   System.out.println("it is an equilateral triangle");
 } 
   else if(a==b || b==c || c==a)
{
   System.out.println("it is an Isosceles triangle");
  }

   else
  
   System.out.println("it is an scalene triangle");
  
 }
}