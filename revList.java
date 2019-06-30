/*
 * Program to reverse a list using stack
 * 
 * Logic:
 * Remove from arr and psuh it to stack, pop from stack and add to arr
 *  
 */
import java.util.*;
public class revList {
	public static void main(String args[]) {
		List arr= new ArrayList();
		for(int i=1; i<6; ++i) {
			arr.add(i);
		}
		
		System.out.println("Array is: "+ arr);
		
		Stack st= new Stack();
		
		while(arr.size()!=0) {
			st.push(arr.remove(0));
		}
		
		while(st.size()!=0) {
			arr.add(st.pop());
		}
		
		System.out.println("Array is: "+ arr+"\n");
		
		String s="Anjitha";
		char[] ne= new char[s.length()];
		ne= s.toCharArray();
		System.out.println(ne);
		
		for(int i=0; i<ne.length; ++i) {
			st.push(ne[i]);
		}
		
		int j=0;
		while(st.size()!=0) {
			ne[j]=(char)st.pop();
			++j;
			//System.out.print(st.pop());
		}
		System.out.println(ne);
		List<String> arls= new ArrayList();
		arls.add("abcd");
		arls.add("efgh");
		arls.add("ijkl");
		System.out.println("\n"+arls);
		String sw;
		for(int i=0; i<arls.size(); ++i) {
			sw=arls.get(i);
			char[] nl= new char[sw.length()];
			nl= sw.toCharArray();
			
			for(int i1=0; i1<nl.length; ++i1) {
				st.push(nl[i1]);
			}
			
			int k=0;
			while(st.size()!=0) {
				nl[k]= (char) st.pop();
				++k;
			}
			
			sw= String.copyValueOf(nl);
			//System.out.println(nl);
			arls.set(i, sw);
		}
		System.out.println(arls);

		
	}

}