package view;

import java.util.ArrayList;
import java.util.Collections;
//ArrayList is fast because it is non-synchronized
//Vector is slow because it is synchronized, i.e., in a multithreading environment, 
//it holds the other threads
//in runnable or non-runnable state until current thread releases the lock of the object.
public class Array_List {
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
//		ArrayList<String> list1= new ArrayList<String>();
		list .add(0);
		list.add(2);
		list.add(4);
		
		System.out.println(list);
		list.get(0);
		
		//to add elementy in between
		list.add(1,1);
		System.out.println(list);
		
		list.set(3,43);
		System.out.println(list);
		
		list.remove(2);
		
		int size=list.size();
		System.out.println(size);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//sorting
		Collections.sort(list);
	}
}
