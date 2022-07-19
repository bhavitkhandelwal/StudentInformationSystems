package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localdatetiem {
	public static void main(String args[])
	{
		LocalDate lt=LocalDate.of(2021, 1, 16);
		System.out.println(lt);
						
		LocalTime lt1 = LocalTime.of(12,15);
		System.out.println(lt1);
		
		LocalDateTime ldt = LocalDateTime.of(lt, lt1);
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD.MMMM.YYYY");
		System.out.print(lt.format(dtf));
	}
}
