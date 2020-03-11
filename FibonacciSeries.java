package fibonacciseries;

import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        
        System.out.println("Enter numbers of terms to print fibonacci Series");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("fibonacci series upto " + a + "terms");
        int t1=0;
        int t2=1;
        int nt=0;
        
        for(int i=0; i<a; i++)
        {  
           System.out.println(t1 +" "+t2);
            
           nt=t1+t2;
           t1=t2;
           t2=nt;          
           
        }
        
       
    }
    
}
