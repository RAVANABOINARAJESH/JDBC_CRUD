package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.servise.StudentService;

public class StudentController {
	
	public static void main(String[] args) {
		Student student=new Student();
		StudentService service=new StudentService();
			//service.createStudent();
		
				//INSERTING
		
//		student.setId(6);
//		student.setName("rakesh");
//		student.setEmail("rakesh@143");
//		student.setPhone(952688272l);
//		student.setAge(45);
//		int res=service.saveStudent(student);
//		if(res>0) {
//			System.out.println("DATA SAVED");
//		}
//		else {
//			System.out.println("please check the data");
//		}
		
		
				//UPDATING
		
		
		student.setName("madhu");
		student.setName("kajal");
		
		//student.setName("kajal");
		//student.setId(4);
		//service.updateStudent(student);	
		//student.setAge(33);
		//student.setName("prabhas");
		//student.setId(4);
//		student.setId(10);
//		student.setName("ammulu");
//		student.setEmail("ammu123@gmail.com");
//		student.setPhone(646464737338l);
//		student.setAge(33);
		int res=(int) service.updateStudent(student);
		
		//student.setEmail("ammu@143");	
		//student.setEmail("manoj@143");
		//service.updateStudent(student);
		if(res>0) {
		System.out.println("data updated");
		}
		else {
			System.out.println("please check the data");
		}
		
				//DELETING
//		student.setName("ramu");
//		service.deleteStudent(student);	
//		student.setId(2);
//		service.deleteStudent(student);
//		System.out.println("data deleted");
		
	}

}
