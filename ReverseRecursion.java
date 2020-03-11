
package reverserecursion;
import java.util.Scanner;
public class ReverseRecursion {
     
       public static void reverseMethod(int num)
       {
           if(num<10)
           {
                  System.out.println(num);
                  return;
           }
           else
           {
                  System.out.print(num%10);
                  reverseMethod(num/10);                  
           }
           
       }
       
   public static void main(String[] args) {
       int num=0;
       int revnum=0;
       System.out.println("Enter number to reverse:");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       
       
       
        System.out.println("Reverse number= "); 
        reverseMethod(num);
      
        
    }
    
}
