import java.io.*;
import java.net.*;

class Server
{
   public static void main(String args[ ]) throws IOException
   {
      ServerSocket ss=new ServerSocket(7777);
      Socket s=ss.accept();
      System.out.println("Connection Estblished");

 	OutputStream obj=s.getOutputStream();
                  PrintStream ps=new PrintStream(obj);
	ps.println("Hello");
	ps.println("Bye");
	ps.close();
	s.close();
	ss.close();
     }
}
