package dao;

import java.util.List;
import java.util.Map;

import model.Course;
import model.Registration;
import model.Student;
public interface StudentDao {
	String addNewStudent(Student student); 
	String addNewCourse(Course course);
	List<Course> viewAllCourses();
	List<Student> viewAllStudents();
	void updateStudentProfile(Student student);
	void registration(Student student,Course course);
	Student findStudentByRollNo(int rollNo);
	Course findCourseById(int courseId);
//	String registrationDb(Registration registration);
	Map<Student, Course> viewAllRegistrations();

}
