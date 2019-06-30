/*
 * Program to implement 2 stack in a single array
 * 
 * Logic:
 * Begin one from index 0 and other from back
 * Overflow condition: top1=top2-1
 */
import java.util.*;
public class TwoSta {
	int arr[];
	int size;
	int top1, top2;
	
	TwoSta(int n){
		size=n;
		arr= new int[n];
		top1=-1;
		top2=size;
	}
	
	void push1(int x) {
		if(top1==top2-1) {
			System.out.println("Overflow");
		}
		else {
			++top1;
			arr[top1]=x;
		}
	}
	
	void push2(int x) {
		if(top1==top2-1) {
			System.out.println("Overflow");
		}
		else {
			--top2;
			arr[top2]=x;
		}
	}
	
	void pop1() {
		if(top1==-1) {
			System.out.println("Empty stack1");
		}
		else {
			System.out.println(arr[top1]);
			--top1;
		}
	}
	
	void pop2() {
		if(top2==size) {
			System.out.println("Empty stack2");
		}
		else {
			System.out.println(arr[top2]);
			++top2;
		}
	}
	
	public static void main(String args[]) {
		TwoSta st= new TwoSta(6);
		st.push1(1);
		st.push1(2);
		st.push1(3);
		st.push2(4);
		st.push2(5);
		st.push2(6);

		st.pop1();
		st.pop1();
		st.pop1();
		st.pop1();
		st.push2(7);
		st.pop2();
		st.pop2();
		st.pop2();
		st.pop2();
	}

}
