/*
 * Program to implement stack using queue
 * 
 * Logic:
 * costly enQ, 2 queues
 * add to q2 new ele, remove from q1 and add to q2 all elements, swap q1 and q2
 */
import java.util.LinkedList;
import java.util.Queue;
public class StaQue {
	Queue<Integer> q1= new LinkedList();
	Queue<Integer> q2= new LinkedList();
	
	int si;
	
	void push(int x) {
		si++;
		if(q1.isEmpty()) {
			q1.add(x);
		}
		else {
			q2.add(x);
			
			while(q1.size()!=0) {
				q2.add(q1.remove());
			}
			
			Queue t= q1;
			q1=q2;
			q2=t;
		}
	}
	
	void pop() {
		if(q1.size()==0) {
			System.out.println("Empty stack");
		}
		else {
			System.out.println(q1.remove());
			si--;
		}
	}
	
	public static void main(String args[]) {
		StaQue s= new StaQue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}
