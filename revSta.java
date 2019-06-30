/*
 * Program to reverse a stack using recursion, without for while... etc
 * 
 * Logic:
 * for a stack like 
 * 1 -->top
 * 2
 * 3
 * 4 
 * 
 * take elements in reverse order and add to bottom of stack
 * 4
 * 
 * 4
 * 3
 * 
 * ...
 * 
 * Time complexity: O(n*n)
 */
import java.util.Stack;
public class revSta {
	
	Stack<Integer> s= new Stack();
	
	void insertbottom(int x) {
		if(s.isEmpty()) {
			s.push(x);
		}
		else {
			int a=s.pop();
			insertbottom(x);
			s.push(a);
		}
	}
	
	void reverse() {
		if(!s.isEmpty()) {
			int x=s.peek();
			s.pop();
			
			reverse();
			insertbottom(x);
		}
	}
	
	public static void main(String args[]) {
		revSta st= new revSta();
		st.s.push(1);
		st.s.push(2);
		st.s.push(3);
		st.s.push(4);
		System.out.println(st.s);
		st.reverse();
		System.out.println(st.s);
	}

}
