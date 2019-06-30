import java.util.LinkedList;
import java.util.Queue;

/*
 * Program to implement a stack using a single queue
 */
public class StaQue2 {
	Queue<Integer> q= new LinkedList();
	
	void push(int x) {
		int s= q.size();
		int u;
		q.add(x);
		for(int i=0; i<s; ++i) {
			u=q.remove();
			q.add(u);
		}
	}
	
	void pop() {
		if(q.isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println(q.remove());
		}
		
	}
	
	public static void main(String args[]) {
		StaQue2 s= new StaQue2();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}
