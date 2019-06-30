/*
 * Program to find next greater element of elements in an array
 * (without using stack)
 * O(n*n) time complexity
 */
public class nge {
	
	static void fn(int arr[]) {
		int next,i,j;
		for(i=0; i<arr.length; ++i) {
			next= -1;
			for(j=i+1; j<arr.length; ++j) {
				if(arr[j] > arr[i]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"--- "+next);
		}
	}
	
	public static void main(String args[]) {
		int ar[]= {12, 13, 5, 10};
		nge.fn(ar);
	}

}
