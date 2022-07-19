package view;

import java.util.Stack;

public class stack {
	static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
//	The static keyword is used for a constant variable or a method that is the same
//	for every instance of a class.
//	1 blocks
//	
//  2 variable(Static)
//  We can create static 
//	variables at the class level only. not allowed to create locally(local variable)
//	
// 3 methods(FUNCTION)
//	it can be accessed before any objects of its class are created, and without reference to any object
//	They can only directly call other static methods.
//	They can only directly access static data.
//	They cannot refer to this or super in any way.
//	// Cannot make a static reference to the non-static field b
//	Cannot make a static reference to the 
    // non-static method m2() from the type Test
	
//	4 STATIC CLASSES;
//	A static nested class may be instantiated without instantiating its outer class
//	taht's why
//	a class can be made static if it is nested in to a class
//	static class canot acces non static member of outer class
	static class stackcl{
		
		public static Node head;
		public static boolean isEmpty()
		{
			return head==null;
		}
		
		public static void push(int data)
		{
			Node newNode=new Node(data);
			if(isEmpty())
			{
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		public static int pop()
		{
			int top=head.data;
			if(isEmpty())
			{
				return(-1);
			}
			Node a;
			a=head;
			head=head.next;
			a.next=null;
			return top;
			
		}
		public static int peak()
		{
			return head.data;
		}
		
		public static void push_bottom(int data)
		{
			
			if(isEmpty())
			{
				Node newnode=new Node(data);
				push(data);
				return;
			}
			
			int q=pop();
			push_bottom(data);
			push(q);
			
			
		}
		public static void reverse()
		{
			if(isEmpty())
			{
				return ;
			}
			int q=pop();
			reverse();
			push_bottom(q);
		}
		public static void main(String args[])
		{
			stackcl s=new stackcl();
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
//			System.out.println(s.peak());
//			while(!isEmpty())
//			{
//				System.out.println(s.peak());
//				s.pop();
//
//			}
		}
	}
}
