import java.util.*;
class Pattern0
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int i,j,n=0;
      System.out.println("enter the value of n");
       n=sc.nextInt();
    for(i=1;i<=n;i+=2)
    {
      for(j=1;j<i;j=j++){
      System.out.print(" ");}
      for(j=i;j<n;j=j++){
       System.out.print("* ");}
       System.out.println(" ");
    }
 }
}

      