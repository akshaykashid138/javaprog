import java.io.*;
import java.util.*;

class FileCreate
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String fnm;
		System.out.println("enter file name");
		fnm= sc.nextLine();

		File f = new File(fnm);
		if(f.exists())
		{
			System.out.println("File Found");
			System.out.println("File content");

			FileReader fr = new FileReader(fnm);
			int ch;
			while((ch=fr.read())!=-1)
			{
				System.out.println((char)ch);
			}

		fr.close();
		}
		else
		{
			f.createNewFile();
			System.out.println("File Created");
		}
		System.out.println("Do you want to add data");
		String ans = sc.nextLine();
		if(ans.equals("yes"));
		{
			FileWriter fw = new FileWriter(fnm,true);
			String str;
			System.out.println("Enter data & exit at the end");
		
			while(!((str=sc.nextLine()).equals("exit")))
			{
				fw.write(str);
			}
			
			fw.close();
		}

	}

}