
package leapyear;
import java.util.Scanner;
public class LeapYear {

  
    public static void main(String[] args) {
        
        int year;
        boolean isLeap;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check leap:");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                 isLeap=true;   
                }
                else
                {
                    isLeap=false;
                }
            }
            
            else
            {
                isLeap=true;
            }
            
        }
        else
        {
           isLeap=false;
        }
        
        
        
        
 if(isLeap==true)
 {
 System.out.println("Leap year");
 }
 else
 {
    System.out.println("Not a leap year");  
 }
        
        
    }
    
}
