package in.sp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.sp.beans.Student;
import in.sp.factory.ConnectionFactory;

public class StudentDaoImpl implements StudentDao
{
	@Override
	public boolean registerStudentDao(Student std)
	{
		boolean status = false;
		try
		{
			Connection con = ConnectionFactory.getConnection();
			
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?)");
			ps.setString(1, std.getName());
			ps.setInt(2, std.getRollno());
			ps.setString(3, std.getEmail());
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}

}
