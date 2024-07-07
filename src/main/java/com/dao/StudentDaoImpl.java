package com.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Student;

public class StudentDaoImpl implements StudentDao {

	HibernateTemplate hibernateTemplate;
	Scanner s = new Scanner(System.in);

	@Override
	@Transactional
	public int saveStudent(Student student) {
		int save = (Integer) this.hibernateTemplate.save(student);
		return save;
	}

	@Override
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = this.hibernateTemplate.loadAll(Student.class);

		return allStudent;
	}

	@Override
	@Transactional
	public void updateStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);

		System.out.println("Enter Student new Name: ");
		student.setName(s.nextLine());
		System.out.println("Enter Student new Address: ");
		student.setAddress(s.nextLine());
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public void deleteAllStudent() {
		this.hibernateTemplate.deleteAll(getAllStudent());
		System.out.println("All Student deleted Successfully.");
	}
}
