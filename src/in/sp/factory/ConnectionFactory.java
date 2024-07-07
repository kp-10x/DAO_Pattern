package in.sp.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory 
{
	static Connection con;
	static public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dao_db", "root", "root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
}
