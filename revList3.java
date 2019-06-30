/*
 * Program to reverse a string using stack and stringbuffer
 * 
 * Logic:
 * Same as prev
 */
import java.util.*;
public class revList3 {
	static void rev(StringBuffer s) {
		Stack<Character> st= new Stack();
		for(int i=0; i<s.length(); ++i) {
			st.push(s.charAt(i));
		}
		int j=0;
		while(!st.isEmpty()) {
			s.setCharAt(j, st.pop());
			++j;
		}
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		s.append(sc.next());
		
		revList3.rev(s);
	}

}
