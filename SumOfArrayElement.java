package sumofarrayelement;
import java.util.Scanner;
public class SumOfArrayElement {

    
    public static void main(String[] args) {
        System.out.println("Eneter number of elements in array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
          System.out.println("Enter Element "+(i+1));
          arr[i]=sc.nextDouble();          
        }
        
        double sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        
        System.out.println("Sum="+sum);
                
        
    }
    
}
