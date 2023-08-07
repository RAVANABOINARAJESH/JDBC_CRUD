package com.jsp.servise;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public void createStudent() {
		studentDao.createStudent();
	}
	public int saveStudent(Student student) {
		return studentDao.saveUser(student);
	}
	public Object updateStudent(Student student) {
		 return studentDao.updateStudent(student);
	}
	public Object deleteStudent(Student student) {
		return studentDao.deleteStudent(student);
	}

	

}
