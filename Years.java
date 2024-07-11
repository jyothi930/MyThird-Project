import java.util.*;
class Years
{ 
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("****YEARCONVERSIONS****");
   System.out.println("1:MONTHS");
   System.out.println("2:DAYS");
   System.out.println("3:HOURS");
   System.out.println("4:MINUTES");
   System.out.println("5:SECONDS");
   
   int years,months,days,hours,minutes,seconds,choice;
   System.out.println("enter the number of years");
   years=sc.nextInt();
   System.out.println("enter the choice");
   choice=sc.nextInt();
     
   months=years*12;
   days=months*30;
   hours=days*24;
   minutes=hours*60;
   seconds=minutes*60;
   switch(choice)
    {
      case 1:System.out.println("number of months="+months); 
             break;
      case 2:System.out.println("number of days="+days);
             break;
      case 3:System.out.println("number of hours="+hours);
             break;
      case 4:System.out.println("number of minutes="+minutes);
              break;
      case 5:System.out.println("number of seconds="+seconds);
             break;
      default:System.out.println("invalid choice");
    }
  }
}