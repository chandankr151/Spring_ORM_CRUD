package com.dao;

import java.util.List;

import com.spring.Student;

public interface StudentDao {

	public int saveStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudent();

	public void updateStudent(int id);

	public void deleteStudent(int id);

	public void deleteAllStudent();
}
