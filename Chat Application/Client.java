import java.net.*;
import java.io.*;
class Client{

public static void main(String are[]) throws Exception{

Socket s=new Socket("localhost",2002);
System.out.println("Connection established with server..........");
System.out.println("Start the chat with server. Press q to quit");

String s1;
do{
System.out.println("Enter the message to server: ");
DataInputStream  din = new DataInputStream(System.in);
s1=din.readLine();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF(s1);
System.out.println("Successfully sent to server ");

DataInputStream din1=new DataInputStream(s.getInputStream());
System.out.println("received message from server :"+din1.readUTF());

}while(!s1.equals("q"));

}


}