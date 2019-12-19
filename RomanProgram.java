import java.io.*;
class roman
{
	int i;
	roman(int i) 
	{
    	if (i < 1 || i > 3999)
       	{ 
			System.out.println("\nInvalid Roman Number...");
			System.exit(0);
		}
    	else
		{
       		this.i=i;
		}
	}
	public void toroman() 
	{
		String s = "";
		int input = i;

		while (input >= 1000) 
		{
			s += "M";
			input -= 1000;        
		}
		while (input >= 900) 
		{
			s += "CM";
			input -= 900;
		}
		while (input >= 500) 
		{
			s += "D";
			input -= 500;
		}
		while (input >= 400) 
		{
			s += "CD";
			input -= 400;
		}
		while (input >= 100) 
		{
			s += "C";
			input -= 100;
		}
		while (input >= 90) 
		{
			s += "XC";
			input -= 90;
		}
		while (input >= 50) 
		{
			s += "L";
			input -= 50;
		}
		while (input >= 40) 
		{
			s += "XL";
			input -= 40;
		}
		while (input >= 10) 
		{
			s += "X";
			input -= 10;
		}
		while (input >= 9) 
		{
			s += "IX";
			input -= 9;
		}
		while (input >= 5) 
		{
			s += "V";
			input -= 5;
		}
		while (input >= 4) 
		{
			s += "IV";
			input -= 4;
		}
		while (input >= 1) 
		{
			s += "I";
			input -= 1;
		}
		System.out.println("\nDecimal Number is: " + i);
		System.out.println("\nRoman Number is: " + s);
	}
}
class RomanProgram
{
	public static void main(String[] args)throws IOException
	{
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter any Integer: ");
		try
		{
			num = Integer.parseInt(br.readLine());
			roman r = new roman(num);
			r.toroman();
		}
		catch (NumberFormatException ex)
		{
			System.out.println("error: " + ex);
		}
	}
}