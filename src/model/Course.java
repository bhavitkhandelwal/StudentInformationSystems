package model;

public class Course {
	private int courseId;
	private String courseName;
	private int durationInMonths;
	private double fee;
	private Qualification eligibility;
	private static int courseIdGenerator=100;
	
	


	public Course(String courseName, int durationInMonths, double fee, Qualification eligibility) 
	{
		super();
		this.courseId=++courseIdGenerator;
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
		this.fee = fee;
		this.eligibility = eligibility;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Qualification getEligibility() {
		return eligibility;
	}

	public void setEligibility(Qualification eligibility) {
		this.eligibility = eligibility;
	}

	
	
//	this vs super
//	super is used to call the parent class member both variable and methods
//	we can use them anywhere in class except in static block and methods
//	super is used when we have to call the method of parent class after overriding in its child class
// example supe.printmethod() where printmethod is part of method overrriding	
// the keyword super is commonly used with the method overriding when we call a method with the same name from parent class in the 
	public Course() {
		super();
	}
// this() vs super()
//	• In Java we have the this() call and the super() call. Notice the braces it is known as a call
//	since it looks like a regular method call.
//	• Use this() to call a constructor from another overloaded constructor in the same class.
//	• The call to this() can be used only in a constructor, and it must be the first statement in a
//	constructor. It's used with constructor chaining, in other words when one constructor
//	calls another constructor, and helps to reduce duplicated code.
//	• The only way to call a parent constructor is by calling super(). This calls the parent
//	constructor.
// The call to super() must be the first statement in each constructor.
	
	

	
	
	
}
