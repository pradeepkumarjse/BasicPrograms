package factorialusingrecursion;

import java.util.Scanner;
public class FactorialUsingRecursion {

 
    public static void main(String[] args) {
    System.out.println("Enter number to calculate factorial:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    
    int result=factorial(num);
    
    System.out.println(result);
    }
    
    static int factorial(int num)
    {
        int output;
        if(num==0)
        {
        return 1;
        }
        else 
        return num*factorial(num-1);
        
    }
    
    
}
