import java.util.*;
public class simpleStack {
	
	static Stack arr= new Stack();
	
	public static void main(String args[]) {
		int c,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("STACK");
		do {
			System.out.println("Menu\n1.Push\n2.Pop\n3.View top\n4.Exit\n5.Search stack");
			c= sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("Enter num to add:");
				a=sc.nextInt();
				arr.push(a);
				break;
			
			case 2:
				try {
				a=(int) arr.pop();
				System.out.println("Deleted elem: "+ a);
				}
				catch(Exception e) {
					System.out.println("Underflow");
				}
				
				break;
			case 3:
				//printstack();
				try {
				a= (int) arr.peek();
				System.out.println("top is: "+a);
				
				}
				catch(Exception e) {
					System.out.println("Underflow");
				}
				break;
				
			case 5:
				System.out.println("num");
				a=sc.nextInt();
				int t=(int) arr.search(a);
				if(t==-1) {
					System.out.println("Not present");
				}
				else {
					System.out.println("Present at :"+ t);
				}
				break;
			case 6:
				Stack temp=new Stack();
				/*temp=(Stack) arr.clone();
				while(!temp.isEmpty()) {
					System.out.println(temp.peek());
					temp.pop();
				}*/
				Iterator i= arr.iterator();
				while(i.hasNext()) {
					a=(int)i.next();
					System.out.println(a);
				}
				
				break;
				
			}
					
		}while(c!=4);
	}
	
	

}


