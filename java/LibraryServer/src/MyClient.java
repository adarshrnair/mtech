

import java.io.*;  
import java.net.*;  
public class MyClient {  
public static void main(String[] args) {  
    System.out.println("Mile 3");
try{      
System.out.println("Mile 1");
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println("Mile 2");}  
}  
}  