package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Employee;


public class stream {
//	stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

//	
	public static void main(String args[])
	{
//		map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
//		List number = Arrays.asList(2,3,4,5);
//		List square = number.stream().map(x->x*x).collect(Collectors.toList());
//		filter: The filter method is used to select elements as per the Predicate passed as argument.
//		List names = Arrays.asList("Reflection","Collection","Stream");
//		List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//		sorted: The sorted method is used to sort the stream.
//		List names = Arrays.asList("Reflection","Collection","Stream");
//		List result = names.stream().sorted().collect(Collectors.toList());
		
//		Filter takes a predicate as an argument so basically you are validating your input/collection against a condition, 
//		whereas a map allows you to define or use a existing function on the stream eg you can apply String.
		
//		Filter is used for filtering the data, it always returns the boolean value. 
//		If it returns true, the item is added to list else it is filtered out (ignored) for eg :
//		map returns a stream consisting of the results of applying the given 
//		function to the elements of this stream. In a simple sentence, the map returns the transformed object value.
		
		
//		collect: The collect method is used to return the result of the intermediate operations performed on the stream.
//		List number = Arrays.asList(2,3,4,5,3);
//		Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
//		forEach: The forEach method is used to iterate through every element of the stream.
//		List number = Arrays.asList(2,3,4,5);
//		number.stream().map(x->x*x).forEach(y->System.out.println(y));
//		reduce: The reduce method is used to reduce the elements of a stream to a single value.
//		The reduce method takes a BinaryOperator as a parameter.
//		List number = Arrays.asList(2,3,4,5);
//		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//		
		
		
		
//		List<Integer> number = Arrays.asList(2,3,4,5);
//		  
//	    // demonstration of map method
//	    List<Integer> square = number.stream().map(x -> x*x).
//	                           collect(Collectors.toList());
//	    System.out.println(square);
//	  
//	    // create a list of String
//	    List<String> names =
//	                Arrays.asList("Reflection","Collection","Stream");
//	  
//	    // demonstration of filter method
//	    List<Integer> result = number.stream().filter(x->x%2==0).
//	                          collect(Collectors.toList());
//	    System.out.println(result);
//	  
//	    // demonstration of sorted method
//	    List<String> show =
//	            names.stream().sorted().collect(Collectors.toList());
//	    System.out.println(show);
//	    
//	    // create a list of integers
//	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
//	  
////	     collect method returns a set
//	    Set<Integer> squareSet =
//	         numbers.stream().map(x->x*x).collect(Collectors.toSet());
//	    System.out.println(squareSet);
//	  
//	    // demonstration of forEach method
//	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
//	  
//	    // demonstration of reduce method
//	    int even =
//	       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//	  
//	    System.out.println(even);
		
		List<Employee> employees =new ArrayList<Employee>();
		
		employees.add(new Employee(1001, "John", 4500));
		employees.add(new Employee(1004, "Michelle", 5000));
		employees.add(new Employee(1002, "George", 3000));
		employees.add(new Employee(1003, "Chloe", 7000));
		
//		employees.stream().filter(e->e.getSalary()>3000).forEach(e->System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()));
//		employees.stream()
//		.filter(e->e.getSalary()>=3000)
//		.map(e->e.getEmployeeName())  // Stream<Employee>------> Stream<String>
//		.forEach(e->System.out.println(e));
//		
//		List<String> employeeNames=employees.stream()
//				.map(e->e.getEmployeeName())
//				.collect(Collectors.toList());
		
//		Double averageSalary= employees.stream()
//		.map(e->e.getSalary())
//		.collect(Collectors.averagingDouble(e->e)

		
		
	}
}
