/*
 * Program to implement k stacks in an array[n]
 * 
 * Logic:
 * Using 2 extra arrays top[k] to store the 'index' of all top elements of stack and next[n] to store the 'index' of next element
 * and also to store the next free element. A free variable to store the index of free slot in arr[]
 * 
 * While pushing
 * the top of that stack shld point to new element's index, which will be the current value of free
 * and the next of new element will contain the previous tops index
 * 
 * While popping
 * the element in top[sn]'s index is popped out, new top will be the next in the stack, and free the current index which has
 * been popped out
 */
public class kSta {
	int arr[];
	int next[];
	int top[];
	int free;
	int n,k;
	
	kSta(int n1, int k1) {
		n=n1;
		k=k1;
		
		arr=new int[n];
		next=new int[n];
		top= new int[k];
		
		for(int i=0;i<k;++i) {
			top[i]=-1;
		}
		free=0;
		for(int i=0; i<n-1; ++i) {
			next[i]=i+1;
		}
		next[n-1]=-1;
	}
	
	boolean isFull() {
		return (free==-1);
	}
	
	void push(int d, int sn) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else {
			int i=free;
			free= next[i];
			
			next[i]=top[sn];
			top[sn]=i;
			
			arr[i]=d;
		}
	}
	
	void pop(int sn) {
		if(top[sn]==-1) {
			System.out.println("Underflow");
		}
		else {
			int i=top[sn];
			top[sn]=next[i];
			
			next[i]=free;
			free=i;
			
			System.out.println("Deleted item: "+arr[i]);
		}
	}
	
	void view(int sn) {
		if(top[sn]==-1) {
			System.out.println("Empty");
		}
		else {
			int i=top[sn];
			while(i!=-1) {
				System.out.println(arr[i]);
				i=next[i];
			}
		}
	}
	
	public static void main(String args[]) {
		kSta s= new kSta(7, 3);
		s.push(20, 0);
		s.push(21, 0);
		s.push(30, 1);
		s.push(31, 1);
		s.push(22, 0);
		s.view(0);
		s.view(1);
		s.pop(0);
		s.pop(0);
		s.push(32, 1);
		s.view(1);
		s.pop(1);
		s.pop(1);
	}
	

}
