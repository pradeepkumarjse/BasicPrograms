class Employee
{
	String name;
	int salary;
	String cname;
		
}

class ClassExample
{
	public static void main(String[] args)
    {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.name="pradeep kumar yadav";
		e1.salary=50000;
		e1.cname="ABC";
		
		
		e2.name="kishor kumar yadav";
		e2.salary=600000;
        e2.cname="cab";
		
		
		System.out.println(e1.name+"..."+e1.salary+"..."+e1.cname);
        System.out.println(e2.name+"..."+e2.salary+"..."+e2.cname);		
	}		
	
}