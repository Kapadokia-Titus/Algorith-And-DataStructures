package stack;

//stack uses a LIFO - last in first out 
public class Stack {
	
//	we will be implementing the stack algorithm here
	
	// basic declarations
	 private int[] object; 
	 private int top; 
	 private int bottom; 
	 private int stackSize; 
	 
	 
	 //performing basic initialisations in the constructor method
	 // default values are given to different variables as shown below
	 public Stack() {
		 stackSize = 1;
		 top = -1; 
		 object = new int [stackSize]; 
	 }
	 
	 //	push method
	 public void push(int item) {
		 
		 if(top <=stackSize - 1) {
			 resize();
			 object[++top] = item; 
		 }
	 }
	 
	 //pop method	
	 public Integer pop() {
		 if(top<0) {
			 return null; 
		 }
		 else {
			 return object[top--]; 
		 }
	 }
	 
	 //resize method
	 public void resize() {
		 int [] temp  = object; 
		 stackSize *=2; 
		 object = new int[stackSize];
		 
		 for(int i=0; i<=top; i++) {
			 object[i]= temp[i]; 
		 }
	 }

}
