import java.util.*;
import Vehicle.Color.*;
class Car
{
	protected String engine,acc;
	protected int i,count=0,count2=0,count1=0,count3=0,count4=0,c=0,c1=0,c2=0,c3=0,input,choice2,tcounta=0,tca=0; 
}
final class Hatchback extends Car
{
	private String color,pattern,r,m,nb,mat,polish,k;
	private int n;
	Scanner sc=new Scanner(System.in);
	CarColor cc=new CarColor();
	public void enginemounting()
	{
		System.out.println("ENGINE DEPARTMENT");
		for(i=1;i<=1;i++)
		{
			System.out.println("Turbo 2.6\ne-engine\noil pump\n");
			System.out.println("Enter the engine name:");
			engine=sc.nextLine();
			if(engine.equalsIgnoreCase("Turbo 2.6")) System.out.println("Engine Turbo 2.6 is successfully fitted");
			else if(engine.equalsIgnoreCase("e-engine")) System.out.println("Engine e-engine is successfully fitted");
			else if(engine.equalsIgnoreCase("oil pump")) System.out.println("Engine oil pump is successfully fitted");
			else 
			{
				System.out.println("Invalid choice");
				i--;
				continue;
			}
		}
	}
	public void bodyfitting()
	{
		System.out.println("BODY DESIGN DEPARTMENT");
		cc.choose();
		for(i=1;i<=1;i++)
		{
			System.out.println("Enter the color name:");
			color=sc.nextLine();
			r="red";
			m="maroon";
			nb="navy blue";
			if(color.equalsIgnoreCase(r)) System.out.println("Red colour has successfully been applied");
			else if(color.equalsIgnoreCase(m)) System.out.println("Maroon colour has successfully been applied");
			else if(color.equalsIgnoreCase(nb)) System.out.println("Navy Blue colour has successfully been applied");
			else 
			{
				System.out.println("Invalid choice");
				i--;
				continue;
			}
		}
		for(i=1;i<=1;i++)
		{
			System.out.println("Colors should be mat finish or polished?:");
			pattern=sc.nextLine();
			mat="mat";
			polish="polished";
			if(pattern.equalsIgnoreCase(mat)) System.out.println("Mat finish is applied");
			else if(pattern.equalsIgnoreCase(polish)) System.out.println("polish is applied");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
		do
		{
			System.out.println("1.door\n2.bonet\n3.hood\n4.mud-guard\n5.exit(you can exit only when all parts are assembled)");
			System.out.println("Enter your choice:");
			input=sc.nextInt();
			sc.nextLine();
			switch(input)
			{
				case 1:c++;
					if(c==1) 
					{
						System.out.println("Front doors and back doors are fitted");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:c1++;
				       if(c1==1) 
				       {
						System.out.println("Bonet fitting is done successfully");
						tca++;
				       }
					else System.out.println("Fitting already done");
				break;
				case 3:c2++;
				       if(c2==1) 
				       {
						System.out.println("Hood fitting is done successfully");
						tca++;
				       }
					else System.out.println("Fitting already done");
				break;
				case 4:c3++;
				       if(c3==1)
				       {
					 	System.out.println("Mud-guard fitting is done successfully");
					 	tca++;
				       }
					else System.out.println("Fitting already done");
				break;
				case 5:if(c>=1 && c1>=1 && c2>=1 && c3>=1) System.out.println("Body parts assembly done successfully");
				       else System.out.println("You cant exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tca!=4);
	}
	public void accessories()
	{
		System.out.println("ACCESSORIES DEPARTMENT");
		do
		{
			System.out.println("1.Steering wheel\n2.AC\n3.Music System\n4.Gear\n5.Speedometer(Brakes,Accelerator)\n6.exit(you can exit only when all parts are assembled)");
			System.out.println("Enter your choice:");
			choice2=sc.nextInt();
			sc.nextLine();
			switch(choice2)
			{
				case 1:count++;
					if(count==1)
					{ 
						System.out.println("Steering wheel fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:count1++;
					if(count1==1) 
					{
						System.out.println("Air Condition fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 3:count2++;
					if(count2==1) 
					{
						System.out.println("Music system successfully fitted");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 4:count3++;
					if(count3==1) 
					{
						System.out.println("Gear fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 5:count4++;
					if(count4==1) 
					{
						System.out.println("Speedometer fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 6:if(count>=1 && count1>=1 && count2>=1 && count3>=1 && count4>=1) System.out.println("Accessories installation successfully done");		
					else System.out.println("You cant exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tcounta!=5);
	}
	public String toString()
	{
		return(engine+"\t"+color);
	}	
}
final class Suv extends Car
{
	private String color,pattern,r,m,nb,mat,polish,k;
	private int n;
	Scanner sc=new Scanner(System.in);
	CarColor cc=new CarColor();
	public void enginemounting()
	{
		System.out.println("ENGINE DEPARTMENT");
		for(i=1;i<=1;i++)
		{
			System.out.println("1.Turbo 2.6\n2.e-engine\n3.oil pump\n");
			System.out.println("Enter the engine name:");
			engine=sc.nextLine();
			if(engine.equalsIgnoreCase("Turbo 2.6")) System.out.println("Engine Turbo 2.6 is successfully fitted");
			else if(engine.equalsIgnoreCase("e-engine")) System.out.println("Engine e-engine is successfully fitted");
			else if(engine.equalsIgnoreCase("oil engine")) System.out.println("Engine oil pump is successfully fitted");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}	
		}
	}
	public void bodyfitting()
	{
		System.out.println("BODY DESIGN DEPARTMENT");
		for(i=1;i<=1;i++)
		{
			cc.choose();
			System.out.println("Enter the name of color:");
			color=sc.nextLine();
			r="red";
			m="maroon";
			nb="navy blue";
			if(color.equalsIgnoreCase(r)) System.out.println("Red colour has successfully been applied");
			else if(color.equalsIgnoreCase(m)) System.out.println("Maroon colour has successfully been applied");
			else if(color.equalsIgnoreCase(nb)) System.out.println("Navy Blue colour has successfully been applied");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
		for(i=1;i<=1;i++)
		{
			System.out.println("Colors should be mat finish or polished?:");
			pattern=sc.nextLine();
			mat="mat";
			polish="polished";
			if(pattern.equalsIgnoreCase(mat)) System.out.println("Mat finish is applied");
			else if(pattern.equalsIgnoreCase(polish)) System.out.println("polish is applied");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
		do
		{
			System.out.println("1.door\n2.bonet\n3.hood\n4.mud-guard\n5.exit(you can exit once all parts are assembled)");
			System.out.println("Enter your choice:");
			input=sc.nextInt();
			sc.nextLine();
			switch(input)
			{
				case 1:c++;
					if(c==1) 
					{
						System.out.println("Front doors and back doors are fitted");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:c1++;
					if(c1==1) 
					{
						System.out.println("Bonet fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 3:c2++;
					if(c2==1) 
					{
						System.out.println("Hood fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 4:c3++;
					if(c3==1) 
					{
						System.out.println("Mud-guard fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 5:if(c>=1 && c1>=1 && c2>=1 && c3>=1) System.out.println("Body parts assembly done successfully");
					else System.out.println("You cant exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tca!=4);
	}
	public void accessories()
	{
		System.out.println("ACCESSORIES DEPARTMENT");
		do
		{
			System.out.println("1.Steering wheel\n2.AC\n3.Music System\n4.Gear\n5.Speedometer(Brakes,Accelerator)\n6.exit(you can exit once all parts are assembled)");
			System.out.println("Enter your choice:");
			choice2=sc.nextInt();
			sc.nextLine();
			switch(choice2)
			{
				case 1:count++;
					if(count==1) 
					{
						System.out.println("Steering wheel fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:count1++;
					if(count1==1) 
					{
						System.out.println("Air Condition fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 3:count2++;
					if(count2==1) 
					{
						System.out.println("Music system successfully fitted");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 4:count3++;
					if(count3==1) 
					{
						System.out.println("Gear fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 5:count4++;
					if(count4==1) 
					{
						System.out.println("Speedometer fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 6:if(count>=1 && count1>=1 && count2>=1 && count3>=1 && count4>=1) System.out.println("Accessories installation successfully done");		
					else System.out.println("You can't exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tcounta!=5);
	}
	public String toString()
	{
		return(engine+"\t"+color);
	}	
}
final class Sedan extends Car
{
	private String color,pattern,r,m,nb,mat,polish,k;
	private int n;
	Scanner sc=new Scanner(System.in);
	CarColor cc=new CarColor();
	public void enginemounting()
	{
		System.out.println("ENGINE DEPARTMENT");
		for(i=1;i<=1;i++)
		{
			System.out.println("1.Turbo 2.6\n2.e-engine\n3.oil pump\n");
			System.out.println("Enter the engine name:");
			engine=sc.nextLine();
			if(engine.equalsIgnoreCase("Turbo 2.6")) System.out.println("Engine Turbo 2.6 is successfully fitted");
			else if(engine.equalsIgnoreCase("Turbo 2.6")) System.out.println("Engine e-engine is successfully fitted");
			else if(engine.equalsIgnoreCase("Turbo 2.6")) System.out.println("Engine oil pump is successfully fitted");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
	}
	public void bodyfitting()
	{
		System.out.println("BODY DESIGN DEPARTMENT");
		for(i=1;i<=1;i++)
		{
			cc.choose();
			System.out.println("Enter the name of color:");
			color=sc.nextLine();
			r="red";
			m="maroon";
			nb="navy blue";
			if(color.equalsIgnoreCase(r)) System.out.println("Red colour has successfully been applied");
			else if(color.equalsIgnoreCase(m)) System.out.println("Maroon colour has successfully been applied");
			else if(color.equalsIgnoreCase(nb)) System.out.println("Navy Blue colour has successfully been applied");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
		for(i=1;i<=1;i++)
		{
			System.out.println("Colors should be mat finish or polished?:");
			pattern=sc.nextLine();
			mat="mat";
			polish="polished";
			if(pattern.equalsIgnoreCase(mat)) System.out.println("Mat finish is applied");
			else if(pattern.equalsIgnoreCase(polish)) System.out.println("polish is applied");
			else 
			{
				System.out.println("Invalid choice...please enter again");
				i--;
				continue;
			}
		}
		do
		{
			System.out.println("1.door\n2.bonet\n3.hood\n4.mud-guard\n5.exit(you can exit once all parts are assembled)");
			System.out.println("Enter your choice:");
			input=sc.nextInt();
			sc.nextLine();
			switch(input)
			{
				case 1:c++;
					if(c==1) 
					{
						System.out.println("Front doors and back doors are fitted");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:c1++;
					if(c1==1) 
					{
						System.out.println("Bonet fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 3:c2++;
					if(c2==1) 
					{
						System.out.println("Hood fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 4:c3++;
					if(c3==1) 
					{
						System.out.println("Mud-guard fitting is done successfully");
						tca++;
					}
					else System.out.println("Fitting already done");
				break;
				case 5:if(c>=1 && c1>=1 && c2>=1 && c3>=1) System.out.println("Body parts assembly done successfully");
					else System.out.println("You cant exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tca!=4);
	}
	public void accessories()
	{
		System.out.println("ACCESSORIES DEPARTMENT");
		do
		{
			System.out.println("1.Steering wheel\n2.AC\n3.Music System\n4.Gear\n5.Speedometer(Brakes,Accelerator)\n6.exit(you can exit once all parts are assembled)");
			System.out.println("Enter your choice:");
			choice2=sc.nextInt();
			sc.nextLine();
			switch(choice2)
			{
				case 1:count++;
					if(count==1) 
					{
						System.out.println("Steering wheel fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 2:count1++;
					if(count1==1) 
					{
						System.out.println("Air Condition fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 3:count2++;
					if(count2==1) 
					{
						System.out.println("Music system successfully fitted");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 4:count3++;
					if(count3==1) 
					{
						System.out.println("Gear fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 5:count4++;
					if(count4==1) 
					{
						System.out.println("Speedometer fitting successfully done");
						tcounta++;
					}
					else System.out.println("Fitting already done");
				break;
				case 6:if(count>=1 && count1>=1 && count2>=1 && count3>=1 && count4>=1) System.out.println("Accessories installation successfully done");		
					else System.out.println("You cant exit...body assembly pending");
				break;
				default:System.out.println("Invalid choice");
				break;
			}
		}while(tcounta!=5);
	}
	public String toString()
	{
		return(engine+"\t"+color);
	}	
}
class TestFactory
{
	int test;
	Scanner sc=new Scanner(System.in);
	public void testcar(String k)
	{
		if(k.equalsIgnoreCase("ON"))
		{
			do
			{
				System.out.println("1.Speed test\n2.Air conditioning test\n3.collsion test\n4.exit");
				System.out.println("Enter your choice:");
				test=sc.nextInt();
				sc.nextLine();
				switch(test)
				{
					case 1:System.out.println("Speed test successfully done");
					break;
					case 2:System.out.println("Air condition test successfully done");
					break;
					case 3:System.out.println("Collision test successfully done");
					break;
					case 4:System.out.println("Test reports are convincing...CAR DEPLOYABLE");
					break;
					default:System.out.println("Invalid choice");
					break;
				}
			}while(test!=4);
				
		}
		else System.out.println("Please turn on the car");
	}
}
class CarFactory
{
	public static void main(String[] args)
	{
		int choice,choice1,i=0,quantity;
		String key;
		Scanner sc=new Scanner(System.in);
		Hatchback h[]=new Hatchback[100];
		Sedan s[]=new Sedan[100];
		Suv su[]=new Suv[100];
		TestFactory tf[]=new TestFactory[100];
		do
		{
			System.out.println("1.Manufacture Hatchback\n2.Manufacture Sedan\n3.Manufacture SUV\n4.exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:h[i]=new Hatchback();
					h[i].bodyfitting();
					h[i].enginemounting();
					h[i].accessories();
					System.out.println("Press apprpriate key to switch ON or OFF your car:");
					sc.nextLine();
					key=sc.nextLine();
					tf[i]=new TestFactory();
					tf[i].testcar(key);
					System.out.println("Type of Engine\tColor\n");		
					System.out.println(h[i]);
					i++;
				break;
				case 2:s[i]=new Sedan(); 
					s[i].bodyfitting();
					s[i].enginemounting();
					s[i].accessories();
					System.out.println("Press apprpriate key to switch ON your car:");
					sc.nextLine();
					key=sc.nextLine();
					tf[i]=new TestFactory();
					tf[i].testcar(key);
					System.out.println("Type of Engine\tColor\n");	
					System.out.println(s[i]);		
					i++;
				break;
				case 3:su[i]=new Suv();
					su[i].bodyfitting();
					su[i].enginemounting();
					su[i].accessories();
					System.out.println("Press apprpriate key to switch ON or OFF your car:");
					sc.nextLine();
					key=sc.nextLine();
					tf[i]=new TestFactory();
					tf[i].testcar(key);
					System.out.println("Type of Engine\tColor\n");	
					System.out.println(su[i]);		
					i++;
				break;
				case 4:System.out.println("NAMASTE");
				break;
				default:System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=4);
	}
}