import java.util.*;
class Notice extends Exception
{
	Notice()
	{
		System.out.println("Amount less than 10000");
	}
}
class Myexception
{	
	int fl;
	public int validate(float s) throws Notice
	{
		fl=0;
		if (s<10000)
		{
			fl=fl+1;
			Notice no=new Notice();
		}
		else
		{
			System.out.println("Amount is Fine");
		}
		return fl;
	}
}
class Bank
{
	protected float comp,l,t,amt,amt1,withdraw,deposit;
	final protected float r=6.4f;
	protected String name,name1,choice,str,y,ne;
	protected long pass1,spass,cpass,d,ccopy,scopy;
	protected int k,i,c=0,c1=0,sig;
}
final class Savings extends Bank
{
	//private int i;
	Scanner sc=new Scanner(System.in);
	Myexception m=new Myexception();
	public void create()
	{
		sig=0;
		System.out.println("Enter the name of the account holder:");
		name=sc.nextLine();
		for(k=1;k<=1;k++)
		{
			System.out.println("Create a password of your account(minimum 4 numerals):");
			spass=sc.nextLong();
			scopy=spass;
			c=0;
			while(spass!=0)
			{
				d=spass%10;
				c++;
				spass=spass/10;
			}
			if(c<4)
			{
				System.out.println("Invalid password...Please enter again");
				k--;
				continue;
			}
			else if(c>=4)
			{
				for(i=1;i<=1;i++)
				{
					System.out.println("Enter the amount you want to keep(Maintain a minimum balance of 10000):");
					amt=sc.nextFloat();
					sc.nextLine();
					try
					{
						sig=m.validate(amt);
					}	
					catch(Exception e)
					{
						System.out.println(e);
					}
					if(sig!=0)
					{
						i--;
						continue;
					}
					else System.out.println("Your Savings account in the name of "+name+" is successfully created");
				}
			}
		}
	}
	public int withdraw(int z)
	{
		sig=0;
		withdraw=0;
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();	
		if(pass1==scopy)
		{
			z=1;
			System.out.println("Balance left in your account="+amt);
			for(i=1;i<=1;i++)
			{
				System.out.println("Enter the withdrawal amount(Maintain minimum balance of 10000):");
				withdraw=sc.nextFloat();
				sc.nextLine();
				if((withdraw>amt) || (withdraw<0)) System.out.println("Invalid input");
				else
				{
					amt=amt-withdraw;
					try
					{
						sig=m.validate(amt);
					}	
					catch(Exception e)
					{
						System.out.println(e);
					}
					if(sig!=0)
					{
						amt=amt+withdraw;
						i--;
						continue;
					}
					else System.out.println("Amount left in the account after withdrawing="+amt);
				}
			}
		}
		else System.out.println("No account was found");
		return z;	
	}
	public int deposit(int z)
	{
		deposit=0;
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();
		if(pass1==scopy)
		{
			z=1;
			System.out.println("Balance left in the account="+amt);
			System.out.println("Enter the amount to be deposited:");
			deposit=sc.nextFloat();
			sc.nextLine();
			if(deposit<0) System.out.println("Invalid input");
			else
			{
				amt=amt+deposit;
				System.out.println("Amount left in the account after depositing="+amt);
			}
		}
		else System.out.println("No account was found"); 
		return z;
	}
	public int interest(int z)
	{
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();
		if(pass1==scopy)
		{
			z=1;
			System.out.println("Balance left in your account"+amt);
			System.out.println("Enter the time period elapsed in years:");
			t=sc.nextFloat();
			sc.nextLine();
			l=r/t;
			comp=amt*((float)(Math.pow(1+r/l,l*t)));
			System.out.println("Interest applied per year is of:"+comp);
		}
		else System.out.println("No account was found");
		return z;
	}		
	public int delete(int z)
	{
		System.out.println("Enter the password....whose account you want to delete:");
		pass1=sc.nextLong();
		sc.nextLine();
		if(pass1==scopy)
		{
			z=1;
			System.out.println("Your account balance is:"+amt);
			System.out.println("Do you really want to delete your account?");
			System.out.println("Yes\nNo");
			System.out.println("Enter your choice:");
			y="Yes";
			ne="No";
			choice=sc.nextLine();
			if(choice.equalsIgnoreCase(y))
			{
				name=" ";
				amt=0;
				System.out.println("Your account was successfully deleted");
			}
			else if(choice.equalsIgnoreCase(ne))
			{
				System.out.println("Your account was retained");
			}
		}	
		else System.out.println("No account was found");
		return z;
	}
	public int display(int z)
	{
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();
		sc.nextLine();
		if(pass1==scopy)
		{
			z=1;
			System.out.println("Name of account holder:"+name);
			System.out.println("Password="+scopy);
			System.out.println("Account type-Savings");	
			System.out.println("Account balance="+amt);
		}
		else System.out.println("No account was found");
		return z;
	}
	public boolean check(String x)
	{
		if(x.equals(name)) return true;
		else return false;
	}
}
final class Current extends Bank
{
	Scanner sc=new Scanner(System.in);
	Myexception m1=new Myexception();
	public void create()
	{
		sig=0;
		System.out.println("Enter the name of the account holder:");
		name1=sc.nextLine();
		for(k=1;k<=1;k++)
		{
			System.out.println("Create your own password(minimum 4 numerals):");
			cpass=sc.nextLong();
			ccopy=cpass;
			c1=0;
			while(cpass!=0)
			{
				d=cpass%10;
				c1++;
				cpass=cpass/10;
			}
			if(c1<4)
			{
				System.out.println("Invalid password....Please enter again");
				k--;
				continue;
			}
			else if(c1>=4)
			{	
				for(i=1;i<=1;i++)
				{
					System.out.println("Enter the amount you want to keep(Maintain minimum balance of 10000):");
					amt1=sc.nextFloat();
					sc.nextLine();
					try
					{
						sig=m1.validate(amt1);
					}	
					catch(Exception e)
					{
						System.out.println(e);
					}
					if(sig!=0)
					{
						i--;
						continue;
					}
					else System.out.println("Your Current account in the name of "+name1+" is successfully created");
				}
			}	
		}
	}
	public int withdraw(int z)
	{
		sig=0;
		withdraw=0;
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();	
		if(pass1==ccopy)
		{
			z=1;
			System.out.println("Balance left in the account="+amt1);
			for(i=1;i<=1;i++)
			{
				System.out.println("Enter the withdrawal amount(Maintain minimum balance of 10000):");
				withdraw=sc.nextFloat();
				sc.nextLine();
				if((withdraw>amt1) || (withdraw<0)) System.out.println("Invalid input");
				else
				{
					amt1=amt1-withdraw;
					try
					{
						sig=m1.validate(amt1);
					}	
					catch(Exception e)
					{
						System.out.println(e);
					}
					if(sig!=0)
					{
						amt1=amt1+withdraw;
						i--;
						continue;
					}
					else System.out.println("Amount left in the account after withdrawing="+amt1);
				}
			}
		}
		else System.out.println("No account was found");
		return z;
	}
	public int deposit(int z)
	{
		deposit=0;
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();
		if(pass1==ccopy)
		{
			z=1;
			System.out.println("Balance left in the account="+amt1);
			System.out.println("Enter the amount to be deposited:");
			deposit=sc.nextFloat();
			sc.nextLine();
			if(deposit<0) System.out.println("Invalid input");
			else
			{
				amt1=amt1+deposit;
				System.out.println("Amount left in the account after depositing="+amt1);
			}
		}
		else System.out.println("No account was found");
		return z; 
	}
	public int delete(int z)
	{
		System.out.println("Enter the password of the account you want to delete:");
		pass1=sc.nextLong();
		sc.nextLine();
		if(pass1==ccopy)
		{
			z=1;
			System.out.println("Your account balance is:"+amt1);
			System.out.println("Do you really want to delete your account?");
			System.out.println("Yes\nNo");
			System.out.println("Enter your choice:");
			y="Yes";
			ne="No";
			choice=sc.nextLine();
			if(choice.equalsIgnoreCase(y))
			{
				name1=" ";
				amt1=0;
				System.out.println("Your account was successfully deleted");
			}
			else if(choice.equalsIgnoreCase(ne))
			{
				System.out.println("Your account was retained");
			}
			return z;
		}	
		else System.out.println("No account was found");
		return z;
	}
	public int display(int z)
	{
		System.out.println("Enter your account password:");
		pass1=sc.nextLong();
		sc.nextLine();
		if(pass1==ccopy)
		{
			System.out.println("Name of account holder:"+name1);
			System.out.println("Password="+ccopy);
			System.out.println("Account type-Current");	
			System.out.println("Account balance="+amt1);
		}
		else System.out.println("No account was found");
		return z;
	}
	public boolean check(String z)
	{
		if(z.equals(name1)) return true;
		else return false;
	}
}		
public class BankAccounts
{
	public static void main(String[] args)
	{
		int i=0,input,input1,flag,f,j,count=0,count1=0;
		String str1;
		Savings s[]=new Savings[100];
		Current c[]=new Current[100];
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Press 1 to enter Savings Account\nPress 2 to enter Current Account\nPress 3 to exit");
			System.out.println("Enter your choice:");
			input=sc.nextInt();
			switch(input)
			{
				case 1:i=0;
					do
					{
						System.out.println("Press 1 to create an account\nPress 2 to withdraw amount\nPress 3 to deposit amount\nPress 4 to delete account\nPress 5 to display details\nPress 6 to Compound interest\nPress 7 to exit");
						System.out.println("Enter your choice:");
						input1=sc.nextInt();
						sc.nextLine();
						switch(input1)
						{
							case 1:
								s[i]=new Savings();
								s[i].create();
								i++;
								count++;
							break;
							case 2:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count-1;j++)
								{
									if(s[j].check(str1))
									{
										flag=0;
										f=s[j].withdraw(flag);
										if(f==1) break;
									}
								}
							break;
							case 3:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count-1;j++)
								{
									if(s[j].check(str1))
									{
										flag=0;
										f=s[j].deposit(flag);	
										if(f==1) break;
									}
								}
							break;
							case 4:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count-1;j++)
								{
									if(s[j].check(str1))
									{
										flag=0;
										f=s[j].delete(flag);
										if(f==1) break;
									}
								}
							break;
							case 5:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count-1;j++)
								{
									if(s[j].check(str1))
									{
										flag=0;
										f=s[j].display(flag);
										if(f==1) break;
									}
								}
							break;
							case 6:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count-1;j++)
								{
									if(s[j].check(str1))
									{
										flag=0;
										f=s[j].interest(flag);
										if(f==1) break;
									}
								}
							break;
							case 7:System.out.println("Please visit again");
							break;
							default:System.out.println("Invalid input");
							break;
						}
					}while(input1!=7);
				break;
				case 2:i=0;
					do
					{
						System.out.println("Press 1 to create an account\nPress 2 to withdraw amount\nPress 3 to deposit amount\nPress 4 to delete account\nPress 5 to display details\nPress 6 to exit");
						System.out.println("Enter your choice:");
						input1=sc.nextInt();
						sc.nextLine();
						switch(input1)
						{
							case 1:
								c[i]=new Current();
								c[i].create();
								i++;
								count1++;
							break;
							case 2:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count1-1;j++)
								{
									if(c[j].check(str1))
									{
										flag=0;
										f=c[j].withdraw(flag);
										if(f==1) break;
									}
								}
							break;
							case 3:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count1-1;j++)
								{
									if(c[j].check(str1))
									{
										flag=0;
										f=c[j].deposit(flag);	
										if(f==1) break;	
									}
								}
							break;
							case 4:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count1-1;j++)
								{
									if(c[j].check(str1))
									{
										flag=0;
										f=c[j].delete(flag);
										if(f==1) break;
									}
								}
							break;
							case 5:System.out.println("Enter the name of account holder:");
								str1=sc.nextLine();
								for(j=0;j<=count1-1;j++)
								{
									if(c[j].check(str1))
									{
										flag=0;
										f=c[j].display(flag);
										if(f==1) break;
									}
								}
							break;
							case 6:System.out.println("Please visit again");
							break;
							default:System.out.println("Invalid input");
							break;
						}
					}while(input1!=6);
				break;
				case 3:System.out.println("Thank you for banking with us");
				break;
				default:System.out.println("Invalid input");
				break;
			}
		}while(input!=3);
	}
}				