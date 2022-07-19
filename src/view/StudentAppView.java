package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.StudentController;

public class StudentAppView {
	
	public static void main(String[] args)
	{
		StudentController controller =new StudentController();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Student\n2.Admin\n3.Exit");
			int userType =sc.nextInt();
			
			if(userType ==1)
			{
				String choice ="y";
				do {
					System.out.println(
							"1.Sign Up\n2.Update phone number\n 3.View all courses\n 4.Register for a course"
									+ "\n5.Sign out.");
					
					int option =sc.nextInt();
					
					switch(option)
					{
					case 1:
						System.out.println("Enter name,date of birth(dd/mm/YYYY),phone number,email and address");
						String name =sc.next();
						
						String dateofBirth=sc.next(); //"04/12/2001"
						
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						
						LocalDate dob =LocalDate.parse(dateofBirth,formatter);
						
					}
					
				}
			}
		}
	}
}
