import java.io.*;
import java.util.*;

class FileWriteRead
{
	String name;
	String age;
	String wd;
	String ht;
	String phno;

	void fileWrite() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ener name");
		name=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextLine();
		System.out.println("");
		wd=sc.nextLine();
		System.out.println("");
		ht=sc.nextLine();
		System.out.println("");
		phno=sc.nextLine();

		FileOutputStream fout = new FileOutputStream("Student.txt");
		DataOutputStream dos = new DataOutputStream(fout);

		dos.writeUTF(name+"\t");
		dos.writeUTF(age+"\t");
		dos.writeUTF(wd+"\t");
		dos.writeUTF(ht+"\t");
		dos.writeUTF(phno+"\t");
		
		dos.close();
	}

	void fileRead() throws IOException
	{
		FileInputStream fin = new FileInputStream("Student.txt");
		DataInputStream dis = new DataInputStream(fin);

		while(dis.available()>0)
		{
			String str = dis.readUTF();
			System.out.print(str);
		}
		dis.close();	
	}

	public static void main(String args[])
	{
		FileWriteRead obj = new FileWriteRead();
		obj.fileWrite();
		obj.fileRead();
	}
}