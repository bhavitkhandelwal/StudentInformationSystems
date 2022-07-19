package view;

// size is remaining 
public class linked_list {
	Node head;
	int size;
	class Node{
		String data;
		Node next;
		Node head;
		Node(String data) {
			this.data=data ;
			this.next=null;
			this.head=null;
			
		}
	}
	// add first,last
	public void addFirst(String data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
			
		}
		newNode.next=head;
		head=newNode;
	}
//	add last
	public void addLast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		Node currNode =head;
		while(currNode.next!=null)
		{
			 currNode=currNode.next;
		}
		
		currNode.next=newNode;
	}
	
	public void printList()
	{
		if(head == null)
		{
			System.out.println("list is empty");
		}
		Node currNode = head;
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode=currNode.next;
		} 
		 System.out.println("NULL");
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		head=head.next;
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("the list is empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		Node secondLast=head;
		Node lastNode =head.next;
		while(lastNode.next !=null)
		{
			lastNode =lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	
	public static void main(String argas[])
	{
		linked_list list=new linked_list();
//		list.addFirst("aaa");
		list.addFirst("aab");
		list.addFirst("aab");
		list.printList();
		list.deleteFirst();
		list.printList();
	}
}
