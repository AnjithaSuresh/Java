/*
 * Checking if expression contain balanced number of parenthesis
 * 
 * If opening parenthesis come, push to stack
 * If its a closing parenthesis, 
 * first check if stack is empty, then not balanced
 * then check if corresponding opening param is found at top of stack, if not -> not balanced
 * at last after going through the full exp, check if the stack is empty or not, if not empty -> not balanced 
 */
import java.util.Stack;
public class balPar {
	
	void checkbal(String exp) {
		Stack <Character> s= new Stack();
		
		for(int i=0; i<exp.length(); ++i) {
			char c= exp.charAt(i);
			
			if(c=='(' || c=='{' || c=='[') {
				s.push(c);
			}
			else if(c==')' || c=='}' || c==']') {
				if(s.isEmpty()) {
					System.out.println("Not balanced");
					System.exit(0);
				}
				else {
					char ch= s.pop();
					if((ch== '(' && c != ')') || (ch == '{' && c != '}') || (ch == '[' && c != ']')) {
						System.out.println("Not balanced");
						System.exit(0);
					}
				}				
			}
			
		}
		
		if(!s.isEmpty()) {
			System.out.println("Not balanced");
		}
		else {
			System.out.println("balanced");
		}
	}
	
	public static void main(String args[]) {
		balPar p= new balPar();
		String exp="{(a+b)+[c+g]}5654";
		p.checkbal(exp);
	}

}
