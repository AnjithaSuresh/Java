/*
 * Program to minimum in stack in O(1) time and lesser space complexity than before
 * 
 * Logic:
 * Unlike previous method no need to push to min stack every time, only push to min stack if new element is lesser than or equal to current element.
 * While popping check if poped out element is curent min element, if so pop from min stack, else dont pop 
 */

import java.util.Stack;
public class MinSta2 extends Stack{
	static Stack<Integer> min= new Stack();
	
	public void push(int x) {
		if(isEmpty()) {
			super.push(x);
			min.push(x);
		}
		else {
			super.push(x);
			int y=min.pop();
			min.push(y);
			if(x<=y) {
				min.push(x);
			}
		}
	}
	
	public Integer pop() {
		if(isEmpty()) {
			System.out.println("Empty");
			System.exit(0);
		}
		else {
			int x=(int) super.pop();
			int y=(int) min.pop();
			if(x!=y) {
				min.push(y);
			}
			return x;
		}
		return 0;
	}
	
	public Integer getMin() {
		int y=min.pop();
		min.push(y);
		return y;
	}
	
	public static void main(String args[]) {
		MinSta st= new MinSta();
		st.push(4);
		System.out.println(st.getMin());

		st.push(3);
		System.out.println(st.getMin());

		st.push(2);
		st.pop();
		st.pop();
		System.out.println(st.getMin());

		st.push(1);
		System.out.println(st.getMin());

		st.push(7);
		System.out.println(st.getMin());
		
		st.push(0);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.getMin());
		

	}
}
