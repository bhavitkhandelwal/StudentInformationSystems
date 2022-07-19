package view;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dao.StudentDao;
import dao.StudentDaoImplnMemory;
import model.Course;
import model.Qualification;
import model.Student;
public class main {
	public static void main(String args[])
	{
		StudentDao dao =new StudentDaoImplnMemory();
		Student student1 = new Student("John", LocalDate.of(2000, 10, 12), Qualification.Graduate, "9858585843",
				"john@lti.com", "Mumbai");
		Student student2 = new Student("Mike", LocalDate.of(2001, 9, 15), Qualification.Master, "6785585843",
				"mike@lti.com", "Chennai");
		Student student3 = new Student("Kevin", LocalDate.of(2000, 1, 22), Qualification.Graduate, "7865585843",
				"kevin@lti.com", "Pune");
		Student student4 = new Student("Brett", LocalDate.of(2001, 11, 12), Qualification.Intermidiate, "8849585843",
				"brett@lti.com", "bengaluru");
		
		dao.addNewStudent(student1);
		dao.addNewStudent(student2);
		dao.addNewStudent(student3);
		dao.addNewStudent(student4);
		
		Course course1=new Course("Java", 6, 4000, Qualification.Graduate);
		Course course2=new Course("Python", 3, 2000, Qualification.Graduate);
		Course course3=new Course("Azure", 8, 8000, Qualification.Master);
		Course course4=new Course(".Net", 5, 5000, Qualification.Matric);
		
		dao.addNewCourse(course1);	
		dao.addNewCourse(course2);	
		dao.addNewCourse(course3);	
		dao.addNewCourse(course4);
		
		List<Course> courses=dao.viewAllCourses();
		
		Iterator<Course> iteratorCourse=courses.iterator();
//		An Iterator is an object that can be used to loop through collections
		while(iteratorCourse.hasNext()) {
			Course course=iteratorCourse.next();
			System.out.println(course.getCourseId()+" "+course.getCourseName()+" "+course.getDurationInMonths()+" "+
												course.getFee()+" "+course.getEligibility());
		}
		
		System.out.println("View all students:");

		List<Student> students = dao.viewAllStudents();
// Iterators in Java are used in the Collection framework to retrieve elements one by one
//  Iterator itr = c.iterator();
//	hasNext(): Returns true if the iteration has more elements.
//	next(): Returns the next element in the iteration. It throws
//	3. remove(): Removes the next element in the iteration. This method can be called only once per call to next().
//	Note: remove() method can throw two exceptions namely as follows:
//UnsupportedOperationException : If the remove operation is not supported by this iterator
//IllegalStateException : If the next method has not yet been called, or the remove method has already been called after the last call to the next method.
//  So it is also known as Uni-Directional Cursor.
		
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getEmail()+" "+student.getPhoneNo()+" "+
												//Student.getCollegename());
												student.getCollegename());
		}
		
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter student roll no. and course applying for");
//		int rollNo =scanner.nextInt();
//		int courseId=scanner.nextInt();
//		
//		Student stud1=dao.findStudentByRollNo(rollNo);
//		Course c1=dao.findCourseById(courseId);
//		
//		if(stud1!=null)
//		{
//			if(c1!=null)
//			{
//				dao.registration(stud1,c1);
//				System.out.println("Registration succesfull.");
//			}
//			else
//			{
//				System.out.println("course not found.");
//			}
//		}
//		else
//		{
//			System.out.println("student not found.");
//		}
//		
//		System.out.println("View All registrations.");
//		
//		Map<Student, Course> registrations=dao.viewAllRegistrations();
//		
//		for(Map.Entry<Student, Course> r:registrations.entrySet()) {
//			Student s=r.getKey();
//			Course c=r.getValue();
//			System.out.println(s.getRollNo()+" "+s.getName()+" "+c.getCourseId()+" "+c.getCourseName());
//		}
		
		
		
		
//		System.out.println("Enter rollNo:");
//		int rollNo=scanner.nextInt();
//		
//		Student student= dao.findStudentByRollNo(rollNo);
//		if(student!=null) {
//			System.out.println(student.getRollNo()+" "+student.getName()+" "+student.getEmail());
//		}
//		else {
//			System.out.println("Student not found.");
//		}
		
		
		
		
		
		
		System.out.println("Enter rollNo:");
		int rollNo = scanner.nextInt();
		Student student = dao.findStudentByRollNo(rollNo);
		if (student != null) {
			System.out.println("Enter phone no:");
			String phoneNo = scanner.next();
			student.setPhoneNo(phoneNo);
			dao.updateStudentProfile(student); // DAO method
			System.out.println("succesfully set");
			
		} else {
			System.out.println("Student not found.");
		}
		
		students = dao.viewAllStudents();
		
		iterator = students.iterator();
		while (iterator.hasNext()) {
			student = iterator.next();
			System.out.println(student.getRollNo() + " " + student.getName() + " " + student.getPhoneNo());
		}
		
		
		
		

	}
}


























