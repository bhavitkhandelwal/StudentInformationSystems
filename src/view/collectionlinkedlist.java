package view;

import java.util.LinkedList;

public class collectionlinkedlist {
	public static void main(String args[])
	{
		LinkedList<String> list= new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("b");
		list.add("c");
		list.addLast("list");
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		
	}
}
