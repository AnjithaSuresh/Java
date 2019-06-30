/*
 * Converting infix expression to postfix expression
 * 
 * Logic:
 * take each character one by one from the exp, if the char is an operand then add to result string
 * if char is a '(' push to stack
 * if char is a ')' pop from stack and addto result until a '(' is reached or stack becomes empty.
 * if char is anything else (+,-,...) while precedense of this char is less than prec of char in stack
 * pop from stack and add to result
 * add the char to stack
 * 
 * After going through all char in exp empty the stack to result
 * 
 */
import java.util.Stack;

public class InToPo {
	
	int prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		
		case '*':
		case '/':
			return 2;
			
		case '^':
			return 3;
		}
		return -1;
	}
	
	String intopost(String exp) {
		
		String result= new String("");
		Stack<Character> s= new Stack();
		
		for(int i=0; i<exp.length(); ++i) {
			char c= exp.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result+=c;
			}
			else {
				if(c=='(') {
					s.push(c);
				}
				else if(c==')') {
					while(!s.isEmpty() && s.peek()!='(') {
						result+=s.pop();
					}
					if(s.isEmpty() || s.peek() != '(') {
						System.out.println("Invalid expression");
						System.exit(0);
					}
					else {
						s.pop();
					}
				}
				else {
					while(!s.isEmpty() && prec(s.peek())>= prec(c)) {
						result+=s.pop();
					}
					s.push(c);
				}
			}
		}
		while(!s.isEmpty()) {
			result+=s.pop();
		}
		return result;
	}
	
	public static void main(String arg[]) {
		String exp= "a+b*(c^d-e)^(f+g*h)-i";
		InToPo i= new InToPo();
		System.out.println(i.intopost(exp));
	}
}
