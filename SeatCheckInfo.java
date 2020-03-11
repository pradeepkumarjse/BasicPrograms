
package seatcheckinfo;

import java.util.Scanner;
public class SeatCheckInfo {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enetr birth number");
        int bn=sc.nextInt();
        int obn=0;
        int m=bn%12;
        String bname="";
       switch(m)
       {
           //window seat  
           case 1: obn=bn+11; System.out.println("Window seat  "+obn);break;
           case 0: obn=bn-11;System.out.println("Window seat  "+obn);break;    
           case 6:obn=bn+1;System.out.println("Window seat  "+obn);break;
           case 7:obn=bn-1;System.out.println("Window seat  "+obn);break;
           //middle seat  
           case 2:obn=bn+9;System.out.println("middle seat  "+obn);break;
           case 11:obn=bn-9;System.out.println("middle seat  "+obn);break;
           case 5:obn=bn+3;System.out.println("middle seat  "+obn);break;
           case 8:obn=bn-3;System.out.println("middle seat  "+obn);break;
           //Aisle seat  
           case 3:obn=bn+7;System.out.println("Aisle seat  "+obn);break;
           case 4:obn=bn+5;System.out.println("Aisle seat  "+obn);break;
           case 9:obn=bn-5;System.out.println("Aisle seat  "+obn);break;
           case 10:obn=bn-7;System.out.println("Aisle seat  "+obn);break;
           
           default : System.out.println("Invalid seat   number");
       }
        
        
       
    }
    
}
