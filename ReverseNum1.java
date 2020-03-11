
package reversenum1;
import java.util.Scanner;

public class ReverseNum1 {

    
    public static void main(String[] args) {
        int num=0;
        int revnum=0;
        System.out.println("Enetr number to reverse ");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        
        for(;num!=0;)
        {
            revnum=revnum*10;
            revnum=revnum+num%10;
            num=num/10;
        }
        System.out.println("Reverse number "+revnum);



    }
    
}
