package in.sp.factory;

import in.sp.dao.StudentDao;
import in.sp.dao.StudentDaoImpl;

public class StudentDaoFactory 
{
	private static StudentDao stdDao;
	
	static
	{
		stdDao = new StudentDaoImpl();
	}
	
	public static StudentDao getStudentDaoObj()
	{
		return stdDao;
	}
}
