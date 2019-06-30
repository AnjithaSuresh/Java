/*
 * Program to evaluate a postfix exp(considering the case of more than single digit numbers)
 * 
 * Calculate the full number in case of digit and push to stack
 * If not digit, pop2 values from stack and do the operation and push the result back in to the stack
 * Finally when the exp is over the result will remain in stack.
 */
import java.util.Stack;
public class posteva2 {
	
	int eval(String exp) {
		Stack<Integer> s=new Stack();
		
		for(int i=0; i<exp.length(); ++i) {
			char c= exp.charAt(i);
			
			if(c== ' ') {
				continue;
			}
			else {
				if(Character.isDigit(c)) {
					int n=0;
					while(Character.isDigit(c)) {
						n=n*10+ (int)c-'0';
						++i;
						c= exp.charAt(i);
					}
					--i;
					s.push(n);
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
		}
		return s.pop();
	}
	
	public static void main(String args[]) {
		posteva2 p= new posteva2();
		int res= p.eval("100 200 +2/5*7+");
		System.out.println(res);
	}


}
