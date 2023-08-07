package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.dto.Student;

public class StudentDao {

	public void createStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_crud?user=root&password=root");
			Statement statement=connection.createStatement();
			statement.execute("create table Student(id int primary key,name varchar(45),email varchar(45),phone bigint(10),age int)");
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int saveUser(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?,?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setLong(4, student.getPhone());
			preparedStatement.setInt(5, student.getAge());
			
			int res=preparedStatement.executeUpdate();
			
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public Object updateStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");
			
			//PreparedStatement preparedStatement=connection.prepareStatement("update student set name=? where id=?");
			//preparedStatement.setString(1, student.getName());
			//preparedStatement.setInt(2, student.getId());
			
			
//			PreparedStatement preparedStatement=connection.prepareStatement("update student set id=? ,name=?,email=?,phone=? where age=?");
//			preparedStatement.setInt(1, student.getId());
//			preparedStatement.setString(2, student.getName());
//			preparedStatement.setString(3, student.getEmail());
//			preparedStatement.setLong(4, student.getPhone());
//			preparedStatement.setInt(5, student.getAge());
			
			PreparedStatement preparedStatement=connection.prepareStatement("update student set name=? where name=?");
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getName());
			
			
			
//			preparedStatement.setInt(1, student.getAge());
//			preparedStatement.setInt(2, student.getId());
			
			
			//PreparedStatement preparedStatement=connection.prepareStatement("update student set email=? where email=?");
			//preparedStatement.setString(1, student.getEmail());
			//preparedStatement.setString(2, student.getEmail());
			
			
			int res=preparedStatement.executeUpdate();
			connection.close();
			return res;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	
	
	public Object deleteStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");
			
			//PreparedStatement preparedStatement=connection.prepareStatement("delete from student where name=?");
			//preparedStatement.setString(1, student.getName());
			PreparedStatement preparedStatement=connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1, student.getId());
			
			preparedStatement.executeUpdate();
			connection.close();
			return student;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
		
	}
	
	

}
