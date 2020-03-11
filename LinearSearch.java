package linearsearch;


public class LinearSearch {

    
    public static void main(String[] args) {
        
        int arr[]={11,2,33,4,5,54};
        int item=52;
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("item found at loaction "+(i+1));
                break;
            }
            
        } 
        if(counter==6)
             System.out.println("item found at loaction ");
           
        
        
         
        
        
    }
    
}
