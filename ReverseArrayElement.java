package reversearrayelement;
import java.util.Scanner;
public class ReverseArrayElement {

    public static void main(String[] args) {
        int i,j,temp;
        System.out.println("Enter number of elements to reverse");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
          System.out.println("Enter element "+(i+1)); 
          arr[i]=sc.nextInt();
        }
        sc.close();
        i=0;
        j=i-1;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
        
    }
    
}
