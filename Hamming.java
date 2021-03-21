import java.util.*;
class Hamming
{
	public static void main(String[] args)
	{
		//Sender code
		int m,n,r=0,i,j,count1=0,count2=0,count3=0,lhs,rhs,num1=0,num2=0,num3=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of data bits:");
		m=sc.nextInt();
		for(r=0;r<=100;r++)
		{
			lhs=(int)Math.pow(2,r);
			rhs=m+r+1;
			if(lhs>=rhs) break;
		}
		n=m+r;
		int hamming[]=new int[n];
		int nhamming[]=new int[n];
		System.out.println("Enter the data bits:");
		hamming[6]=sc.nextInt();
		hamming[5]=sc.nextInt();
		hamming[4]=sc.nextInt();
		hamming[2]=sc.nextInt();
		for(i=0;i<=n-1;i++)
		{
			j=0;
			if(i==0)
			{
				while(j<=6)				
				{
					if(j==2 || j==4 || j==6)
					{
						if(hamming[j]==1) count1++;
					}
					j++;
				}
				if(count1%2==0) hamming[i]=0;
				else hamming[i]=1;
			}
			else if(i==1)
			{
				while(j<=6)
				{
					if(j==2 || j==5 || j==6)
					{
						if(hamming[j]==1) count2++;
					}
					j++;
				}
				if(count2%2==0) hamming[i]=0;
				else hamming[i]=1;
			}
			else if(i==3)
			{
				while(j<=6)
				{
					if(j==4 || j==5 || j==6)
					{
						if(hamming[j]==1) count3++;
					}
					j++;
				}
				if(count3%2==0) hamming[i]=0;
				else hamming[i]=1;
			}
		}
		System.out.println("Hamming code:");
		for(i=n-1;i>=0;i--)
		{
			//nhamming[n-i-1]=hamming[i];
			System.out.print(hamming[i]);
		}
		System.out.println();
		//receiver's code
		//int error[]=new int[n];
		System.out.print("Enter the received hamming code:");
		for(i=n-1;i>=0;i--)
		{
			nhamming[i]=sc.nextInt();
		}
		count1=0;
		count2=0;
		count3=0;
		for(i=0;i<=n-1;i++)
		{
			j=0;
			if(i==0)
			{
				while(j<=6)				
				{
					if(j==0 || j==2 || j==4 || j==6)
					{
						if(nhamming[j]==1) count1++;
					}
					j++;
				}
				if(count1%2==0) num1=0;
				else num1=1;
			}
			else if(i==1)
			{
				while(j<=6)
				{
					if(j==1 || j==2 || j==5 || j==6)
					{
						if(nhamming[j]==1) count2++;
					}
					j++;
				}
				if(count2%2==0) num2=0;
				else num2=1;
			}
			else if(i==3)
			{
				while(j<=6)
				{
					if(j==3|| j==4 || j==5 || j==6)
					{
						if(nhamming[j]==1) count3++;
					}
					j++;
				}
				if(count3%2==0) num3=0;
				else num3=1;
			}
		}
		System.out.print("Received hamming code is:");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(nhamming[i]);
		}
		System.out.println();
		if(num1==0 && num2==0 && num3==0) System.out.print("There is no error in received data");
		else System.out.print("There is an error in the "+num1+num2+num3+" bit of received data");											
	}
}