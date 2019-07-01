/*
 * Program to find the maximum element in a binary tree
 * 
 * recursively call findmax on left and right subtree, compare b/w root, left and right & determine max 
 */
public class maxele {
	
	Node root;
	
	int FindMax(Node root) {
		int max=Integer.MIN_VALUE;
		if(root != null) {
			int d=root.data;
			int left=FindMax(root.left);
			int right=FindMax(root.right);
			
			if(left>right) {
				max=left;
			}
			else {
				max=right;
			}
			if(d>max) {
				max=d;
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		maxele bt= new maxele();
		bt.root= new Node(1);
		bt.root.left= new Node(52);
		bt.root.right= new Node(3);
		bt.root.left.right = new Node(6); 
	    bt.root.left.right.left = new Node(1); 
	    bt.root.left.right.right = new Node(11); 
	    bt.root.right.right = new Node(9); 
	    bt.root.right.right.left = new Node(124); 

		System.out.printf("Max : "+bt.FindMax(bt.root));
	}
	

}
