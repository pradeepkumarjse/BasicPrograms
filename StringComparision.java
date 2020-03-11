package stringcomparision;

import java.util.Scanner;
public class StringComparision {

    public static void main(String[] args) {
        
        Scanner sc1=new Scanner(System.in);
        int count;
        System.out.println("Enter no. of string to compare:");
        count=sc1.nextInt();
        
        String str[]=new String[count];
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter string one by one");
        for(int i=0; i<count ; i++)
        {
            str[i]=sc2.nextLine();
        }
        
        sc1.close();
        sc2.close();
        
        for(int i=0; i<count; i++)
        {
            for(int j=i+1; j<count; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
       System.out.println("printing sorted names");
        for(int i=0; i<count; i++)
        {
            System.out.print(str[i]+",");
        }
        
        
    }
    
}
