import java.util.*;

class SavingAccount
{
	private static double annualInterestRate=0.04;
	 private double savingBalance;
	private double monthlyInterest;

	SavingAccount(double amt)
	{
		savingBalance=amt;	
	}

	
	static void modifyInterestRate()
	{
		annualInterestRate=0.05;
	}

	void calculateMonthlyInterest()
	{
		monthlyInterest=(savingBalance*annualInterestRate)/12;
		System.out.println("Monthly interest is:"+monthlyInterest);

		savingBalance=savingBalance+monthlyInterest;
		System.out.println("Saving balance is:"+savingBalance);
	}

}

class Bank
{
	public static void main(String args[])
	{
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);

		System.out.println("\n\n for 4%----------");
		System.out.println("\n\nfor 2000:");
		saver1.calculateMonthlyInterest();

		System.out.println("\n\n for 3000:");
		saver2.calculateMonthlyInterest();
		
		SavingAccount.modifyInterestRate();
		System.out.println("\n\n for 5%----------");
		System.out.println("\n\nfor 2000:");
		saver1.calculateMonthlyInterest();

		System.out.println("\n\n for 3000:");
		saver2.calculateMonthlyInterest();
	}
}