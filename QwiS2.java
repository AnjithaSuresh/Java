/*
 * Program to implement queue using stack
 * 
 * 1)
 * Logic:
 * 2 stacks and costly enQ
 * pop from stack1 and push to stack2
 * push new element to stack1
 * pop from stack2 to stack1
 */
import java.util.Stack;
public class QwiS2 {
	static Stack<Integer> s1= new Stack();
	static Stack<Integer> s2= new Stack();
	
	public void enq(int x) {
		while(!s1.empty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.empty()) {
			s1.push(s2.pop());
		}
	}
	
	public int deq() {
		if(s1.empty()) {
			System.out.println("Q empty");
			System.exit(0);
		}
		int x=s1.pop();
		return x;
	}
	
	public static void main(String args[]) {
		QwiS2 q= new QwiS2();
		q.enq(1);
		q.enq(2);
		q.enq(3);
		
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
		
	}

}
