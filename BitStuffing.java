import java.util.*;
class BitStuffing
{
	public static void main(String[] args)
	{
		int i=0,n,j,k,count=0;
		String msg="",data,flag,outmsg="",data1,data2;
		char ch,ch1,ch2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Hey sender, enter the data:");
		data=sc.nextLine();
		System.out.print("Hey sender, enter the flag pattern:");
		flag=sc.nextLine();
		n=data.length();
		StringBuffer s=new StringBuffer(data);
		while(i!=n)
		{
			ch=data.charAt(i);
			count=0;
			k=i;
			while(ch=='1')
			{
				count++;
				k++;
				if(k<n)
				{
					ch=data.charAt(k);
				}
				if(count==5) break;
			}
			if(count==5)
			{
				data1=data.substring(0,k);
				if(k!=n)
				{
					data2=data.substring(k,n);
					outmsg=flag+data1+'0'+data2+flag;
				}
				else if(k==n)
				{
					outmsg=flag+data1+'0'+flag;
				}
				//System.out.print(data);
				break;
			}
			i++;
		}
		//msg=flag+data+flag;
		System.out.print("Your sent data is "+outmsg);
	}
}