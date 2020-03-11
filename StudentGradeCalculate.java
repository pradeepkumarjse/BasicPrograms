package studentgradecalculate;
import java.util.Scanner;
public class StudentGradeCalculate {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number of Subjects:");
        int n=sc.nextInt();
        double marks[]=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter marks of subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
       double total=0;
       for(int i=0;i<n;i++)
       {
           total=total+marks[i];
       }
       double avg=total/n;
       
       if(avg>=80 && avg<=100)
       {
           System.out.println("A");
           
       }
       else if(avg>=60 && avg<80)
       {
           System.out.println("B");
       }
       else if(avg>=40 && avg<60)
       {
           System.out.println("C");
       }
       else if(avg>100)
       {
           System.out.println("Invalid Grade types");

       }
       else
       {
            System.out.println("F");
                    
       }
        
    }
    
}
