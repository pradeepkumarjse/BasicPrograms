package sortarrayelement;
import java.util.Scanner;
public class SortArrayElement {

    public static void main(String[] args) {
     int count,temp;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter number of elements in array : ");
     count=sc.nextInt();
     int arr[]=new int[count];
     for(int i=0;i<count;i++)
     {
      System.out.print("Enter element "+(i+1)+":");
      arr[i]=sc.nextInt();     
     }
     sc.close();
      for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
     System.out.println("printing Sorted Elements");
     for(int i=0;i<count-1;i++)
     {
         System.out.print(arr[i]+" ");
     }
     
     System.out.print(arr[count-1]);
    }
    
}
