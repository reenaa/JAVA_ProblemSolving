import java.util.LinkedList; 
import java.util.Queue; 

public class ClsQueue {
	// Java orogram to demonstrate working of Queue 
	// interface in Java 
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i<5; i++)
			q.add(i+1);
		
		System.out.println("Elements of q = "+q);
		
		//int removedItem = q.remove();
		//System.out.println("Removed Item = "+removedItem);
		int polledItem = q.poll();
		System.out.print("After q.poll() ="+polledItem);
		
		//To view the head of queue
		int headOFQueue = q.peek();
		System.out.println("Head of Queue ="+headOFQueue);
		
	 //bool t = q.offer(5)
			// System.out.println(t);
		
	}

}
