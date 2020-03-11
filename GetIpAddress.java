package getipaddress;

import java.net.InetAddress;
public class GetIpAddress {  
    public static void main(String[] args) throws Exception 
    {
      InetAddress myIp=InetAddress.getLocalHost();
      
      System.out.println("My IP address is");
      System.out.println(myIp.getHostAddress());
    }
    
}
