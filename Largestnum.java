import java.util.*;
class Largestnum
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,rem,Lar_num=0;
   System.out.println("enter the value of n");
  n=sc.nextInt();
  
  while (n>0)
  {
   rem=n%10;
   if(Lar_num<rem)
  {
   Lar_num=rem;
  }
  n=n/10;
  }
    System.out.println("Lar_num of a given num="+Lar_num);
 }
}