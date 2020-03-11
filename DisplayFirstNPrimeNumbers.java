package displayfirstnprimenumbers;

import java.util.Scanner;
public class DisplayFirstNPrimeNumbers {

    
    public static void main(String[] args) {
        
      int status=3;
      int num=3; 
      System.out.println("Enter n to calculate first n prime numbers ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>=1)
      {
       System.out.println("First "+n+" prime numbers is");
       System.out.println("2");
      }
      
      for(int i=2;i<=n;)
      {
          for(int j=2;j<=Math.sqrt(num);j++)
          {
              if(num%j==0)
              {
                  status=0;
                  break;
              }
          }
          if(status!=0)
          {
              System.out.println(num);
              i++;
          }
          status=1;
          num++;
          
      }
       
         
         
         
         
         
    }
       
 }
    

