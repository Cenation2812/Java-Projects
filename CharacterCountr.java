import java.util.*;
import java.io.*;
class CharacterCountr
{
	public static void main(String[] args) throws Exception
	{
		int i,l,j=0,count;
		long data;
		String received;
		String output="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the recevied data:");
		received=sc.nextLine();
		l=received.length();
		//System.out.println(l);
		i=0;
		while(i!=l)	
		{
			if(i>l) break;
			else
			{
				//count=0;
				if(i==0)
				{
					for(j=i+1;j<=Integer.parseInt(String.valueOf((received.charAt(i))))-1;j++)
					{
						output=output+String.valueOf(received.charAt(j));
						//count++;
					}
				}
				else
				{
					for(j=i+1;j<=i+Integer.parseInt(String.valueOf((received.charAt(i))))-1;j++)
					{
						output=output+String.valueOf(received.charAt(j));
						//count++;
					}
				}	
					i=i+Integer.parseInt(String.valueOf((received.charAt(i))));
			}
			//System.out.println("Received data is: "+output);
		}
		System.out.println("Received data is: "+output);
	}
}