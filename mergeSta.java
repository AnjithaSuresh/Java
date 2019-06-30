
public class mergeSta {
	
	class DLLNode{
		int data;
		DLLNode next;
		DLLNode prev;
		
		DLLNode(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	
	class mystack{
		DLLNode top;
		DLLNode end;
		int count;
		
	}
	
	mystack Createmystack() {
		mystack ms= new mystack();
		ms.count=0;
		return ms;
	}
	
	void push(mystack ms, int d) {
		DLLNode newnode= new DLLNode(d);
		
		newnode.next=ms.top;
		ms.count+=1;
		
		if(ms.count==1) {
			ms.end=newnode;
		}
		else {
			ms.top.prev=newnode;
		}
		ms.top=newnode;
	}
	
	void pop(mystack ms) {
		if(ms.count==0) {
			System.out.println("Empty stack");
		}
		else {
			System.out.println("Deleted : "+ ms.top.data);
			if(ms.count==1) {
				ms.top=null;
				ms.end=null;
				ms.count=0;
			}
			else {
				ms.top=ms.top.next;
				ms.top.prev=null;
				ms.count-=1;
			}
		}
	}
	
	mystack merge(mystack m1, mystack m2) {
		if(m1.count==0) {
			m1=m2;
		}
		else if(m2.count==0) {
			return m1;
		}
		else {
			//System.out.println("m1 end: "+m1.end.data+" m2 top: "+m2.top.data);
			m1.end.next=m2.top;
			m2.top.prev=m1.end;
			
			m1.end=m2.end;
			m1.count=m1.count+m2.count;
			//System.out.println("end: "+m1.end.data);
		}
		return m1;
	}
	
	public static void main(String args[]) {
		mergeSta s=new mergeSta();
		mystack m1=s.Createmystack();
		mystack m2= s.Createmystack();
		
		s.push(m1, 20);
		s.push(m1, 21);
		s.push(m1, 22);
	
		
		s.push(m2, 30);
		s.push(m2, 31);
		s.push(m2, 32);
		s.pop(m2);
		s.pop(m2);
		s.pop(m2);
	
		m1=s.merge(m1, m2);
		
		
		s.pop(m1);
		s.pop(m1);
		s.pop(m1);
		s.pop(m1);
		s.pop(m1);
	}

}
