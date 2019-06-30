/*
 * Program to get minimum(similarly max also can be done) element in stack with O(1) time complexity.
 * 
 * Logic:
 * Maintain another stack 'min' which contains the minimum element at its top.
 * Push to min the new element if new element is less than current top, else push the current top element once again.
 * While poping from stack pop from min stack also
 * 
 * Problem: It has O(n) space complexity
 */

import java.util.Stack;
public class MinSta extends Stack{
	static Stack<Integer> min= new Stack();
	
	public void push(int x) {
		if(super.isEmpty()==true) {
			super.push(x);
			min.push(x);
		}
		else {
			super.push(x);
			int y= min.peek()
					;
			if(x<y) {
				min.push(x);
			}
			else {
				min.push(y);
			}
		}
	}
	
	public Integer pop() {
		if(super.isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		else {
			min.pop();
			int x;
			x=(int)super.pop();
			return x;
		}
		return 0;
	}
	
	public Integer getMin() {
		if(!min.empty()) {
			int x;
			x=min.pop();
			min.push(x);
			return x;
		}
		else {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return 0;
	}
	
	public static void main(String args[]) {
		MinSta st= new MinSta();
		st.push(4);
		System.out.println(st.getMin());

		st.push(3);
		System.out.println(st.getMin());

		st.push(2);
		System.out.println(st.getMin());

		st.push(1);
		System.out.println(st.getMin());

		st.push(7);
		System.out.println(st.getMin());
		
		st.push(0);
		System.out.println(st.getMin());

		
	}
}
