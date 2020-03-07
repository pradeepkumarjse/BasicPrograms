import java.util.Scanner;
class employee
{
	public static void main(String args[])
	
	{
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.println("Enter your name:");
		name=sc.nextLine();
		
		System.out.println("Enter your age");
		age=sc.nextInt();
		
		System.out.println("Enter your Salary:");
		salary=sc.nextDouble();
		
		System.out.println("Welcome..."+name+
		" your age is.."+age+" 
		Happy to see your Salary..."+salary);
		
		
		
		
		
	}
	
}