import java.io.*;
import java.util.*;

class FileCreate
{
	public static void main(String ar[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name");
		String fnm= sc.nextLine();

		File f = new File(fnm);
		if(exists)
		{
			System.out.println("File Found");
			System.out.println("File content");

			FileReader fr = new FileReader(fnm);
			int ch;
			while((ch=fr.read()!=-1))
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
		String ans = sc.NextLine();
		if(ans.equals("yes"));
		{
			FileWrite fw = new FileWrite(fnm,true);
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