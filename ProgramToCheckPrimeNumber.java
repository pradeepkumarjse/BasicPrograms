
package programtocheckprimenumber;
import java.util.Scanner;
public class ProgramToCheckPrimeNumber {

    
    public static void main(String[] args) {
        System.out.println("Enter number to check prime");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        int temp;
        for(int i=2;i<n/2;i++)
        {
           temp=n%i;
           if(temp==0)
           {
               isPrime=false;
               break;
           }
        }
        if(isPrime)
            System.out.println(n+" is prime number");
        
        else
           System.out.println(n+" is not a prime number");
       
        
        
        
    }
    
}
