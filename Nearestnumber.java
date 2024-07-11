import java.util.*;
class Nearestnumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   int n,r;
   System.out.println("enter the value of n");
   n=sc.nextInt();
   
   if(n%5==0)

    System.out.println(n+"is divisible by 5");
    else
    {
      r=n%5;
      if(n>2)
      System.out.println("nearest num="+(n-r+5));
      else
      System.out.println("nearest num="+(n-r));
   }
  }
 }
      
      
   
    