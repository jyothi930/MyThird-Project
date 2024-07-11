import java.util.*;
class Grosspay
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float basicpay,grosspay,dearnessallowance,Houserentallowance,providentfund,netpay;

   System.out.println("Enter the basicpay");
   basicpay=sc.nextFloat();
   dearnessallowance=(basicpay*25)/100;
   Houserentallowance=(basicpay*15)/100;
   providentfund=(basicpay*8.33f)/100;
   netpay=basicpay+dearnessallowance+Houserentallowance;
   grosspay=netpay-providentfund;
   System.out.println(grosspay);
  }
}