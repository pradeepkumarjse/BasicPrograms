
package averageofarrayelement;
import java.util.Scanner;
public class AverageOfArrayElement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        
        double arr[]=new double[n];
        double total=0;
        
        for(int i=0; i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=sc.nextDouble();
        }
        sc.close();
        
        
        for(int i=0;i<arr.length;i++)
        {
            total=total+arr[i];
        }
        double avg=total/arr.length;
        
        
        System.out.println("Average="+avg);
    }
    
}
