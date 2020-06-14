package queue;

public class MyQueue {
	
	public static void main(String [] args) {
		Queue queue = new Queue(); 
		queue.push(20);
		queue.push(21);
		queue.push(22);
		queue.push(23);
		queue.push(24);
	
		/**
		 * the main thing in queue is that it is a first come, first served basis 
		 * the first item to be pushed in the queue will be the first one to be poped out
		 */
		System.out.println(queue.pop()); 
		System.out.println(queue.pop()); 
		System.out.println(queue.pop()); 
		System.out.println(queue.pop()); 
		System.out.println(queue.pop()); 
		System.out.println(queue.pop()); 
		
	}
	
	
	

}
