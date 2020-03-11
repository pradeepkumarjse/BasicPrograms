package vowelcheck;
import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        boolean isVowel=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'a':
            case 'e':  
            case 'i': 
            case 'o': 
            case 'u':   
            case 'A': 
            case 'E': 
            case 'I': 
            case 'O': 
            case 'U': isVowel=true;                 
            
        }
        if(isVowel==true)
        {
            System.out.println("charcater is vowel " + ch);
        }
        else
        {
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
               System.out.println("Consonent " + ch);
            }
            else
            {
            System.out.println("Not a character "+ ch);
            }
        }
        
    }
    
}
