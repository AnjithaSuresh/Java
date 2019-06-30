/*
 * Program to implement a Queue using stack
 * 
 * There are 3 methods
 * 1. Making enqueue costly
 * 2. Making dequeue costly(better than 1)
 * 3. Dequeue and only 1 stack with recursive approach
 * 
 * 2)
 * Logic:
 * Using 2 stacks and making dequeue costly
 * while deQ
 * if stack2 is empty: pop from stack1 and push to stack2, then pop from stack2.
 * else just pop from stack2
 * 
 */

import java.util.Stack;
public class QwithStack {

	static Stack<Integer> s1= new Stack();
	static Stack<Integer> s2= new Stack();
	
	public static void enQ(int x) {
		s1.push(x);
	}
	
	public static int deQ() {
		int x;
		if(s1.empty() && s2.empty()) {
			System.out.println("q is empty");
			System.exit(0);
		}
		else if(s2.empty()) {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
			x=s2.pop();
			return x;
		}
		else {
			x=s2.pop();
			return x;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		//QwithStack q= new QwithStack();
		enQ(1);
		enQ(2);
		enQ(3);
		
		System.out.println(deQ());
		System.out.println(deQ());
		
		enQ(4);
		enQ(5);
		System.out.println(deQ());
		System.out.println(deQ());
		System.out.println(deQ());
		System.out.println(deQ());

	}
}
