import java.net.*;
import java.io.*;
class Client
{
	public static void main(String are[])throws Exception
	{
		Socket s=new Socket("localhost",2002);
		System.out.println("Connection established with server..");
		System.out.println("Enter the name of the file to server :");
		DataInputStream din=new DataInputStream(System.in);
		String fn=din.readLine();
		System.out.println(fn);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF(fn);

		DataInputStream din1=new DataInputStream(s.getInputStream());
		String s1=din1.readUTF();
		System.out.println(s1);
		
		File ff=new File("aa.txt");
		System.out.println(ff.delete());
		//if(ff.mkdir())
		//{
			//System.out.println("success");	
		//FileOutputStream fout=new FileOutputStream("e:\\Demo1\\test.txt");
		//fout.write(s1.getBytes());
		//}	
	}
}