package in.sp.test;

import in.sp.beans.Student;
import in.sp.services.StudentService;
import in.sp.services.StudentServiceImpl;

public class Main
{
	public static void main(String[] args)
	{
		String name = "Deepak";
		int rollno = 101;
		String email = "deepak@gmail.com";
		
		Student std = new Student();
		std.setName(name);
		std.setRollno(rollno);
		std.setEmail(email);
		
		StudentService stdService = new StudentServiceImpl();
		boolean status = stdService.registerStudent(std);
		if(status)
		{
			System.out.println("Student registered successfully");
		}
		else
		{
			System.out.println("Student not registered due to some error");
		}
	}
}
