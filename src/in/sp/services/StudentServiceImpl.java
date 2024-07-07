package in.sp.services;

import in.sp.beans.Student;
import in.sp.dao.StudentDao;
import in.sp.factory.StudentDaoFactory;

public class StudentServiceImpl implements StudentService
{
	@Override
	public boolean registerStudent(Student std) 
	{
		StudentDao stdDao = StudentDaoFactory.getStudentDaoObj();
		boolean status = stdDao.registerStudentDao(std);
		return status;
	}

}
