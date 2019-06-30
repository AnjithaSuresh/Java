/*
 * Program to implement stack using doubly linked list and get middle element of stack in O(1) time
 * Also to delete middle element
 * 
 * Logic:
 * A class DDL is made with data, prev and next
 * A class mystack with head & mid of DDL type and a count
 * 
 * while pushing, increase the count, and make new node as head of stack, increment count by 1
 * if count is odd, make mid the previous one in list, else mid remains same
 * if 2->1 becomes 3->2->1, then mid becomes 2 from 1
 * 
 * while popping, decrease count, if count become even, make mid as next in list
 * 
 * while deleting mid, decrement cnt, if count becomes even make new mid as next, else mid is prev one.
 */
import java.util.*;
public class StaDDL {
	
	class DDLNode{
		int data;
		DDLNode prev;
		DDLNode next;
		
		DDLNode(int d){
			data=d;
		}
	}
	
	class mystack{
		DDLNode head;
		DDLNode mid;
		int count;
	}
	
	public mystack CreateStack() {
		mystack ms= new mystack();
		ms.count=0;
		return ms;
	}
	
	public void push(mystack ms, int d) {
		
		DDLNode newnode= new DDLNode(d);
		
		newnode.next=ms.head;
		newnode.prev=null;
		
		ms.count+=1;
		
		if(ms.count==1) {
			ms.mid=newnode;
		}
		else {
			ms.head.prev=newnode;
			if((ms.count%2) != 0) {
				ms.mid= ms.mid.prev;
			}
		}
		ms.head=newnode;
	}
	
	public void pop(mystack ms) {
		if(ms.count==0) {
			System.out.println("Empty stack");
		}
		else {
			System.out.println("Deleted item: "+ms.head.data);
			ms.head= ms.head.next;
			
			if(ms.head!=null) {
				ms.head.prev=null;
			}
			ms.count-=1;
			
			if(ms.count%2==0) {
				ms.mid=ms.mid.next;
			}
		}
	}
	
	public void getmid(mystack ms) {
		if(ms.count==0) {
			System.out.println("Empty stack");
		}
		else {
			System.out.println("mid ele is: "+ ms.mid.data);
		}
	}
	
	public void deletemid(mystack ms) {
		if(ms.count==0) {
			System.out.println("Empty stack");
		}
		else {
			System.out.println("Mid deleted is: "+ ms.mid.data);
			if(ms.count==1) {
				ms.head=null;
				ms.mid=null;
				ms.count-=1;
			}
			else {	
			ms.mid.prev.next=ms.mid.next;
			if(ms.mid.next!=null)
			ms.mid.next.prev=ms.mid.prev;
			
			ms.count-=1;
			if(ms.count%2==0) {
				ms.mid=ms.mid.next;
			}
			else {
				ms.mid=ms.mid.prev;
			}
			}
		}
	}
	
	public static void main(String args[]) {
		StaDDL s= new StaDDL();
		mystack ms= s.CreateStack();
		
		s.push(ms, 1);
		s.getmid(ms);
		s.push(ms, 2);
		s.getmid(ms);
		s.push(ms, 3);
		s.getmid(ms);
		s.push(ms, 4);
		s.getmid(ms);
		s.push(ms, 5);
		s.getmid(ms);
	
		s.deletemid(ms);
		s.getmid(ms);
		s.deletemid(ms);
		s.getmid(ms);
		s.deletemid(ms);
		s.getmid(ms);
		s.pop(ms);
		s.getmid(ms);
		s.deletemid(ms);
		
		s.push(ms, 10);
		s.getmid(ms);
		s.push(ms, 11);
		s.push(ms, 12);
		s.getmid(ms);
		s.deletemid(ms);
		s.getmid(ms);
		s.deletemid(ms);
		/*s.pop(ms);
		s.getmid(ms);
		s.pop(ms);
		s.getmid(ms);
		s.pop(ms);
		s.getmid(ms);
		s.pop(ms);
		s.getmid(ms);
		s.pop(ms);
		s.getmid(ms);
		s.pop(ms);
*/
	}

}
