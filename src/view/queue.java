package view;

public class queue {
	
	static class queue1{
		static int arr[];
		static int size;
		static int rear=-1;
		
		queue1(int n)
		{
			arr=new int[n];
			this.size=n;
		}
		public static boolean isEmpty()
		{
			return rear==-1;
		}
		
		public static void add(int data)
		{
			if(rear==size-1)
			{
				System.out.println("full queue");
				return;
			}
			rear=rear+1;
			arr[rear]=data;
		}
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}
			int front =arr[0];
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
			
		}
		public static int peek()
		{
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return arr[0];
		}
	}
	
	public static void main(String args[])
	{
		queue1 q=new queue1(5);
		q.add(12);
		q.add(13);
		q.add(15);
		q.add(12);
		q.add(18);
		
		while(!q.isEmpty())
		{
			int a=q.peek();
			System.out.println(a);
			q.remove();
		}
		
		
		
	}
	
}
