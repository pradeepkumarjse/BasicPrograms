package sumofarrayelement1;
public class SumOfArrayElement1 {

    public static void main(String[] args) {
        
       int arr[]={12,13,15,20,34,16};
        double sum=0;
        //advance for loop
        for(int num : arr)
        {
          sum=sum+num;  
        }
        
        System.out.println("Sum="+sum);
        
    }
    
}
