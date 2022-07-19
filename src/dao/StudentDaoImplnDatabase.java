package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import Connection.OracleConnection;
import model.Course;
import model.Student;

public class StudentDaoImplnDatabase implements StudentDao {

	
	Connection conn;
	PreparedStatement ps; // used to run sql queries
	
	public StudentDaoImplnDatabase()
	{
		conn =OracleConnection.getConnection();
	}
	@Override
	public String addNewStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into tbl_students values(seq_stud.nextval,?,?,?,?,?,?)";
		String message = "";
		int count = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setDate(2, Date.valueOf(student.getDateofBirth()));
			ps.setString(3, student.getQualification().name());
			ps.setString(4, student.getPhoneNo());
			ps.setString(5, student.getEmail());
			ps.setString(6, student.getAddress());

			count = ps.executeUpdate();
			if (count > 0) {
				message = "New student added successfully";
			} else {
				message = "Error ocurred.";
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public String addNewCourse(Course course) {
		String sql = "insert into tbl_courses values(seq_crs.nextval,?,?,?,?)";
		String message = "";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, course.getCourseName());
			ps.setInt(2, course.getDurationInMonths());
			ps.setDouble(3, course.getFee());
			ps.setString(4, course.getEligibility().name());

			int count = ps.executeUpdate();

			if (count > 0) {
				message = "Course added successfully.";
			} else {
				message = "Error occured.";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return message;
	}

	@Override
	public List<Course> viewAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudentProfile(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registration(Student student, Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student findStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findCourseById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Student, Course> viewAllRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

}
