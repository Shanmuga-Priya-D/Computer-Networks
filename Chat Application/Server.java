import java.net.*;
import java.io.*;
class Server{

public static void main(String are[]) throws Exception{

ServerSocket ss=new ServerSocket(2002); //Application Created with port number 2001
System.out.println("Socket created and listening to port");
Socket s=ss.accept();// application starts to listen to port for any requests

String s1;

do{
DataInputStream din1=new DataInputStream(s.getInputStream());
System.out.println("received message from client :"+din1.readUTF());


System.out.println("Enter the message to client: ");
DataInputStream  din = new DataInputStream(System.in);
s1=din.readLine();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF(s1);
System.out.println("Successfully sent to client");
}while(!s1.equals("q"));

}


}