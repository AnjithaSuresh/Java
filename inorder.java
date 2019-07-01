/*
 * Program to do inorder traversal without using recursion
 */
import java.util.Stack;
public class inorder {
	Node root;
	
	void inor() {
		Stack<Node> s= new Stack();
		Node curr=root;
		
		while(true) {
			
			while(curr!=null) {
				s.push(curr);
				curr=curr.left;
			}
			
			if(s.isEmpty()) {
				break;
			}
			curr=s.pop();
			System.out.print(curr.data+ " ");
			curr=curr.right;
		}
	}
	
	public static void main(String args[]) {
		inorder bt= new inorder();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right= new Node(3);
		bt.root.left.left= new Node(4);
		bt.root.left.right= new Node(5);
		bt.root.right.left=new Node(6);
		bt.inor();
	}

}
