/*
 * Program to reverse each word of a sentence
 * 
 * Logic:
 * Divide sentence to arraylist of words and reverse each word
 */
import java.util.*;
public class revList2 {

	public static void main(String[] args) {
		List<String> arr= new ArrayList();
		String s,sw;
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		for(String w: s.split("\\s")) {
			arr.add(w);
		}
		Stack st= new Stack();
		for(int i=0; i<arr.size(); ++i) {
			sw=arr.get(i);
			char ar[]= new char[sw.length()];
			ar=sw.toCharArray();
			
			//or char ar[]= sw.toCharArray();
			
			for(int j=0;j<ar.length; ++j) {
				st.push(ar[j]);
			}
			
			int k=0;
			while(st.size()!=0) {
				ar[k]=(char) st.pop();
				++k;
			}
			
			sw=String.copyValueOf(ar);
			arr.set(i, sw);
			System.out.print(sw+" ");

		}
		
		System.out.println(arr);
	}

}
