/*
 * Program to get minimum from stack in O(1) time and O(1) space complexity.
 * 
 * Logic:
 * Instead of using a min stack, we use a variable minele to store minimum element.
 * While pushing, if new ele is less than the minele, instead of pushing the new ele 'x' we push '2x-minele'and make x the new minele,
 * this is done so as to store the previous minele value in case this element is popped out.
 * While popping if the popped out element, y is less than minele, then minele is original value of x, and new minele= 2*minele-y
 */

import java.util.Stack;
public class MinSta3{
	Stack<Integer> st= new Stack();
	Integer minele;
	
	void push(int x) {
		if(st.isEmpty()) {
			minele=x;
			st.push(x);
		}
		else if(x<minele) {
			st.push((2*x-minele));
			minele=x;
		}
		else {
			st.push(x);
		}
	}
	
	public void pop() {
		if(st.isEmpty()) {
			System.out.println("Empty stack");
			System.exit(0);
		}
		int t=st.pop();
		if(t<minele) {
			System.out.println(minele);
			minele=2*minele-t;
		}
		else {
			System.out.println(t);
		}
	}
	
	void peek() {
		if(st.isEmpty()) {
			System.out.println("Empty");
			System.exit(0);
		}
		
		int t=st.pop();
		st.push(t);
		
		if(t<minele) {
			System.out.println(minele);
		}
		else {
			System.out.println(t);
		}
	}
	
	void getmin() {
		if(st.isEmpty()) {
			System.out.println("Empty");
			System.exit(0);
		}
		
		System.out.println(minele);
	}
	
	public static void main(String args[]) {
		MinSta3 s= new MinSta3();
		s.push(2);
		s.peek();
		s.push(3);
		s.push(1);
		s.getmin();
		s.push(0);
		s.peek();
		s.getmin();
		s.pop();
		s.getmin();
		s.pop();
		s.getmin();
		s.pop();
		
		
		MinSta3 st= new MinSta3();
		st.push(9);
		st.push(10);
		st.push(8);
		st.getmin();
		s.getmin();
		
		/*s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		s.pop();*/
	}

}
