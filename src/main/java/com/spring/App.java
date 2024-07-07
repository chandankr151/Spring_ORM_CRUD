package com.spring;

///import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
///import org.springframework.orm.hibernate5.HibernateTemplate;

import com.dao.StudentDao;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
		/// HibernateTemplate htemp = (HibernateTemplate)
		/// context.getBean("hibernateTemplate");

		StudentDao studentDao = (StudentDao) context.getBean("stDao");
		Scanner s = new Scanner(System.in);
		// System.out.println(htemp);

		/// Insert Student...
//        Student student = new Student();
//        student.setId(1001);
//        student.setName("Chandan Kumar");
//        student.setAddress("Noida");
//
//        int save = (Integer) studentDao.saveStudent(student);
//        System.out.println(save+" Student inserted into database Successfully");

		/// Display All Student...
//         List<Student> allStudent = studentDao.getAllStudent();
//
//         for (Student student : allStudent) {
//			System.out.println(student);
//		}

		/// Update Student...
//         System.out.println("Enter Student_Id");
//         int stdId = s.nextInt();
//
//         studentDao.updateStudent(stdId);
//         System.out.println("Student updated Successfully");

		/// Delete Specific student from database table...
//		System.out.println("Enter Student_Id to delete: ");
//		int stdId = s.nextInt();
//		studentDao.deleteStudent(stdId);
//		System.out.println("Student with Id: " + stdId + " deleted Successfully.");
//
//		s.close();

		/// studentDao.deleteAllStudent();
	}
}