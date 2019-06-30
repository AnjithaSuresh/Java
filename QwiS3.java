/*
 * Program to implement queue using stack
 * 
 * 3)
 * Logic:
 * Using 1 stack and recursion, costly deQ
 * store in some x popped value, recursivily call deQ to get last elemnt and store in res push back the x and return the res
 */

import java.util.Stack;
public class QwiS3 {
	static Stack<Integer> s1= new Stack();
	
	public void enq(int x) {
		s1.push(x);
	}
	
	public int deq() {
		int x, res;
		if(s1.empty()) {
			System.out.println("Q is empty");
			System.exit(0);
		}
		else if(s1.size()==1) {
			return s1.pop();
		}
		else {
			x= s1.pop();
			
			res=deq();
			
			s1.push(x);
			return res;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		QwiS3 q= new QwiS3();
		q.enq(1);
		q.enq(2);
		q.enq(3);
		
		System.out.println(q.deq());
		System.out.println(q.deq());
		q.enq(4);
		q.enq(5);
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());

	}

}
