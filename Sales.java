import java.util.*;
class Sales
{
  public static void main(String args[])
  {
   
    Scanner sc=new Scanner(System.in);
   int sales;
  float com,rate;
  System.out.println("Enter the sales rate");
  sales=sc.nextInt();
 if (sales>=20000)
 {
    com=(sales*3)/100f;
 }
  else if(sales>20000 && sales<=50000)
  {
    com=(sales*12)/100f;
  }
  else
  {
  
   com=(sales*31)/100f;
  }
   
  System.out.println("Commision amount:"+com);
 System.out.println("rate of Commision:"+(com*100)/sales);
}
}
    
   
 
 


   
   
 
     
    