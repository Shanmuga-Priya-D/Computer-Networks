import java.net.*;
import java.io.*;
class Server
{
	public static void main(String are[])throws Exception
	{
		ServerSocket ss=new ServerSocket(2002);
		System.out.println("Socket created with port no.& listening");
		Socket s=ss.accept();	
		DataInputStream din1=new DataInputStream(s.getInputStream());
		String s1=din1.readUTF();
		System.out.println(s1);
		File x=new File(s1);
		String[] y=x.list();
		String c="";
		for(int i=0;i<y.length;i++)
		{
			c=c+y[i]+"\t";
			System.out.println(y[i]);
		}
		System.out.println(c);
		/*String s11="Sorry, File is not exist";
		if(x.exists())
		{
		s11="";
		DataInputStream din=new DataInputStream(new FileInputStream(s1));
		byte b;
		
		while((b=(byte)din.read())!=-1)
		{
			s11=s11+(char)b;	
		}
		}*/
		
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF(c);
				


		//FileOutputStream fout=new FileOutputStream("test.txt");
		//fout.write(s1.getBytes());
		
		
		
	}
}