EmpDB

import java.sql.*;

class EmpDB
{
	public static void main(String[] args) throws Exception
	{
		Class forname=("Sun.jdbc.odbc.JdbcOdbcDriver");
		Connnection con=DriverManager.getConnection("jdbc:odbc:empDSN","","");
		Statement stm=con.createStatement();
		
		stm.executeUpdate("insert into emp values(1,'akshay','solapur')");
		stm.executeUpdate("insert into emp values(2,'ashlesh','sangli')");
		stm.executeUpdate("insert into emp values(3,'akash','nanded')");

		ResultSet rs=stm.executeQuery("select * from emp");

		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getstring(2)+"\t");
			System.out.println(rs.getString(3));
		}

		rs.Close();
		stm.Close();
		con.Close();
	}
}