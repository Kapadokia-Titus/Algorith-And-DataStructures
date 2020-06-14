package stack;

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
 */

public class MyStack {

	public static void main(String [] args) {
		
		//creating an object of Stack
		Stack stack = new Stack(); 
		
		// pushing the data to the stack
		stack.push(23);
		stack.push(25);
		stack.push(27); 
		stack.push(29);
		
		
		System.out.println(stack.pop());
		
		
		System.out.println(stack.pop());
		stack.push(39);
		System.out.println(stack.pop());
		
	}
}
