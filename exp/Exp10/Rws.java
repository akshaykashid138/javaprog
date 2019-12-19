import java.io.*;
import java.util.*;

class Rws
{
	public static void main(String args[])  throws Exception
	{
		FileReader fr=new FileReader(args[0]);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(args[1]);

		String line;

		while((line=br.readLine()) != null)
		{
			line=line.trim();
			String[] words= line.split(" ");
			for(String ele : words)
			{
				fw.write(ele);
			}
		}
		fr.close();
		fw.close();
	}
}