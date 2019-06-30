/*
 * Program to sort stack using recursion
 */
import java.util.Stack;
public class sort {
	
	Stack<Integer> s= new Stack();
	
	void insert(int x) {
		if(s.isEmpty() || x>s.peek()) {
			s.push(x);
		}
		else {
			int a=s.pop();
			insert(x);
			s.push(a);
		}
	}
	
	void sort() {
		if(!s.isEmpty()) {
			int x= s.pop();
			sort();
			insert(x);
		}
	}
	
	public static void main(String args[]) {
		sort n= new sort();
		n.s.push(1);
		n.s.push(-1);
		n.s.push(30);
		n.s.push(13);
		n.s.push(10);
		//System.out.println(n.s);
		n.sort();
		//System.out.println(n.s);
		while(!n.s.isEmpty()) {
			System.out.print(n.s.peek()+" ");
			n.s.pop();
		}
	}

}
