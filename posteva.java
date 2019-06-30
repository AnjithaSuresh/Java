/*
 * Program to evaluate a postfix expression
 */
import java.util.Stack;
public class posteva {
	
	int eval(String exp) {
		Stack<Integer> s= new Stack();
		
		char c;
		for(int i=0; i<exp.length(); ++i) {
			c= exp.charAt(i);
			
			if(Character.isDigit(c)) {
				s.push(c- '0');
			}
			else {
				int val1= s.pop();
				int val2= s.pop();
				
				switch(c) {
				case '+':
					s.push(val2+val1);
					break;
					
				case '-':
					s.push(val2-val1);
					break;
					
				case '*':
					s.push(val2*val1);
					break;
				
				case '/':
					s.push(val2/val1);
					break;
				}
			}
		}
		return s.pop();
	}
	
	public static void main(String args[]) {
		posteva p= new posteva();
		int res= p.eval("231*+9-");
		System.out.println(res);
	}

}
