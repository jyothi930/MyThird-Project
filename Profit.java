import java.util.*;
class Profit
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   double sp,cp,amount,profit,loss;
   System.out.println("Enter the sp,cp");
   sp=sc.nextDouble();
   cp=sc.nextDouble();
   amount=sp-cp;
  if(amount>0)
  System.out.println("profit");
 else
   System.out.println("loss");
 }
}