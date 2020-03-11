package compoundinterest;

import java.util.Scanner;
public class CompoundInterest {
    
    public static void calculate(double p,double t,double r,double n)
    {
        double amount=p* Math.pow((1+r/n),n*t);
        double cinterest=amount-p;
        System.out.println("Compount Interest anter "+t+"years : "+cinterest);
        System.out.println("Amount After "+ t+ "year : "+amount);
           
    }

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle amount:");
        double p=sc.nextDouble();
        System.out.println("Enetr Time:");
        double t=sc.nextDouble();
        System.out.println("Enter rate:");
        double r=sc.nextDouble();
        System.out.println("Enter compound int. per unit time:");
        double n=sc.nextDouble();
        
        CompoundInterest obj=new CompoundInterest();
        obj.calculate(p,t,r,n);
        
        
    }
    
}
