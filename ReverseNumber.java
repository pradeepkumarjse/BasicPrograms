package reversenumber;
import java.util.Scanner;

public class ReverseNumber {   
    public static void main(String[] args) {
        int num=0;
        int revnum=0;
        
System.out.println("Enter number to reverse");
Scanner in=new Scanner(System.in);
num=in.nextInt();
while(num!=0)
{
   revnum=revnum*10;
   revnum=revnum+num%10;
   num=num/10;
   
}

System.out.println("Reverse number = " + revnum);




    }
    
}
