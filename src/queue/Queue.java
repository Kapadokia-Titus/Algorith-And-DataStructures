package queue; 

/**
 * This code is Opensourced and is to be used as a learning refference for algorithm and Data structure
 * Module. It is publicly available from my github repo and it can be freely manipulated and contributed to. 
 * It aims to give a Complete Defined path for java development codes with relevant links 
 * to other java resources to help the learner to transition from zero to production using java language.
 * 
 * Any issues regarding the code should be submitted at the issues's column in the github repo.Information 
 * is transformative when shared
 * @author Kapadokia Titus
 *
 * Queue - unlike stack - uses FIFO - first in fist out
 */
public class Queue {
	
	//inits
	private int[] object; 
	private int front; 
	private int rear; 
	private int queueSize; 
	
	public Queue() {
		
		queueSize = 1; 
		object = new int[queueSize]; 
		front = -1; 
		rear = -1; 
	}
	
	public void push(int data) {
		if((front+1)<= (queueSize-1)) {
			resize(); 
			object[++front] = data; 
		}
	}

	public Integer pop() {
		if(front>rear) {
			return object[++rear];
		}else {
			return null; 
		}
			
	}
	
	public boolean isEmpty() {
		return front<=rear; 
	}
	private void resize() {
		int [] temp = object; 
		queueSize *=2; 
		object= new int[queueSize];
		
		for (int i =0; i<=front; i++) {
			object[i] = temp[i]; 
		}
	}
}
