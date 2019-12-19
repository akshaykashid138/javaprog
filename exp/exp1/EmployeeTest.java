import java.util.*;

class Employee
{
	String fnm;
	String lnm;
	Double sal;

	Employee()
	{
		fnm=" ";
		lnm=" ";
		sal=0.0;
	}

	void get()
	{
		System.out.println("First name is:"+fnm);
		System.out.println("last name is:"+lnm);
		System.out.println("Monthly salary of employee  is: "+sal);
		System.out.println("Yearly salary of employee  is:"+sal*12);
	}

	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name of Employee");
		fnm=sc.nextLine();
		System.out.println("Enter last name of employee"+lnm);
		lnm=sc.nextLine();	
		System.out.println("Enter monthly sal of empolyee");
		sal=sc.nextDouble();
		
		if(sal<0)
		{
			sal=0.0;
		}
	}

		void raise_sal()
		{
			sal=sal=sal*0.1;
		}
	
	
}

class EmployeeTest
{
	public static void main(String args[]) 
               	{
		Employee obj1=new Employee();
		Employee obj2=new Employee();

		obj1.set();
		obj2.set();

		obj1.get();
		obj2.get();

		obj1.raise_sal();
		obj2.raise_sal();
	
		System.out.println("\n\nAfter 10% raise----------");
		obj1.get();
		obj2.get();

		
		

	}
}