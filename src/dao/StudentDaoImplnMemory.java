package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Course;
import model.Registration;
import model.Student;

public class StudentDaoImplnMemory implements StudentDao {
//	Any group of individual objects which are represented as a single unit is known as the collection of the objects. In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds all the collection classes and interface in it. 
//	resize the array
//	insert element in between
//	
	public static List<Student> students=new ArrayList<Student>();
	public static Set<Course> courses=new HashSet<Course>();
//	A map is a data structure that supports the key-value pair mapping for the data. This interface doesn’t support duplicate keys because the same key cannot have multiple mappings. A map is useful if there is data and we wish to perform operations on the basis of the key. This map interface is implemented by various classes like HashMap, TreeMap, etc. Since all the subclasses implement the map, we can instantiate a map object with any of these classes
	
	public static Map<Student,Course> registrations=new HashMap<Student,Course>();
	
	public String addNewStudent(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		return "";
	}
	
	public String addNewCourse(Course course) {
		courses.add(course);
		return "";
	}
	
	public void updateStudentProfile(Student student) {
		// TODO Auto-generated method stub
		Student student1= findStudentByRollNo(student.getRollNo());
		int index;
		index=students.indexOf(student1);
		students.set(index, student);

	}

	
//	public boolean registration(Registration registration) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
	public Student findStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return students.parallelStream().filter(s->s.getRollNo()==rollNo)
				.findFirst().orElse(null);
		
	}

	
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return students.stream().collect(Collectors.toList());
//		return students;
	}
	
	public List<Course> viewAllCourses()
	{
		return courses.stream().collect(Collectors.toList());
	}
	
	public Course findCourseById(int courseId)
	{
//		Note : findAny() is a terminal-short-circuiting operation of Stream interface. This method returns any first element satisfying the intermediate operations. This is a short-circuit operation because it just needs ‘any’ first element to be returned and terminate the rest of the iteration.
		
		return courses.stream()
				.filter(c->c.getCourseId()==courseId)
				.findAny().orElse(null);
	}
	
	public void registration(Student student,Course course)
	{
		registrations.put(student ,course);
	}
	
	public Map<Student, Course> viewAllRegistrations()
	{
		return registrations;
	}

}
