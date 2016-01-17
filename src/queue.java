import java.util.Scanner;


interface queue_inteface
{
	void insert (int x);
	int delete ();	
}



public class queue implements queue_inteface
{
	int queue_array[] = new int[20];
	int front = 0;
	int rear = 0;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 3 numbers to insert into the queue..");
		int x = sc.nextInt();
		queue q1 = new queue();
		q1.insert (x);
		
		
		x = sc.nextInt();
		q1.insert (x);
		
		
		x = sc.nextInt();
		q1.insert (x);

		
		System.out.println("Queu contains : ");
		q1.display();
		
		System.out.println("Deleting 2 elements from queue..");
		int y = q1.delete();
		System.out.println("Deleted element is "+y);

		
		y = q1.delete();
		System.out.println("Deleted element is "+y);
		
		System.out.println("Queue Contains..");
		q1.display();	}

	@Override
	public void insert(int x) {
		queue_array[rear++] = x;		 
		
	}

	@Override
	public int delete() {
		
		return queue_array[front++];
		 
	}
	
	public void display()
	{
		for (int i = front; i < rear; ++i)
			System.out.println(queue_array[i]);
		
	}

}
