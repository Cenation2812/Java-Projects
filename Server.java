import java.io.*;
import java.net.*;
class Server
{
	public static void main(String[] args) throws Exception
	{
		String outmsg;
		int count=0;
		ServerSocket ss1=new ServerSocket(80);
		while(true)
		{
			Socket s1=ss1.accept();
			String m[]={"Internet connection is perfect","Connection is poor","Authentication failed","Failed to establish a secure connection","Bad network quality","Excellent network quality","No ethernet found"};
			int i=(int)(Math.random()*m.length);
			outmsg=m[i];
			PrintStream d1=new PrintStream(s1.getOutputStream());
			count++;
			System.out.println("Message sent to client "+count+" is "+outmsg);
			d1.println(outmsg);
		}
	}
}