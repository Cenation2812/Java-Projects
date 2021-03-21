import java.io.*;
import java.util.*;
import java.net.*;
class Csend extends Thread
{
	private int count=0;
	public synchronized void run()
	{
		String msg;
		try
		{
			Socket s2=new Socket("localhost",80);
			BufferedReader d2=new BufferedReader(new InputStreamReader(s2.getInputStream()));
			msg=d2.readLine();
			count++;
			System.out.println("Client "+count+" your received message is "+msg);
			s2.close();
		}
		catch(Exception e)
		{
		}
	}
}		
class Client
{
	public static void main(String[] args)
	{
		Csend c=new Csend();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}
}