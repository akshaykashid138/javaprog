import java.io.*;
import java.net.*;
class Client
{
   public static void main(String args[ ]) throws IOException
   {
	Socket s=new Socket("local host",7777);
	InputStream obj=s.getInputStream();
	BufferedReader br =new BufferedReader(new InputStreamReader(obj));
	String str;
	
	while((str=br.readLine())!= null)
	{
	   System.out.println(str);
	}

	br.close();
	s.close();
   }
}