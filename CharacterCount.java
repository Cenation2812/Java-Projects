import java.util.*;
import java.io.*;
class CharacterCount
{
	public static void main(String[] args) throws Exception
	{
		int n,i,count;
		long r,copy;
		String message;
		String sending="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of frames:");
		n=sc.nextInt();
		long data[]=new long[n];
		String m[]=new String[n];
		for(i=0;i<=n-1;i++)
		{
			System.out.print("Enter the data frame:");
			data[i]=sc.nextLong();
		}
		for(i=0;i<=n-1;i++)
		{
			count=0;
			copy=data[i];
			while(copy!=0)
			{
				r=copy%10;
				count++;
				copy=copy/10;
			}
			message=String.valueOf(count+1);
			message=message+String.valueOf(data[i]);
			m[i]=message;
			System.out.println("Your "+(i+1)+" data frame is "+message);
		}
		for(i=0;i<=n-1;i++)
		{
			sending=sending+m[i];
		}
		System.out.println("Your sending data is: "+sending);
	}
}