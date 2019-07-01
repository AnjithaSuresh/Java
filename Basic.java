
class Node{
		int data;
		Node left, right;
		
		public Node(int d) {
			data=d;
			left= null;
			right= null;
		}
	}

public class Basic {
	
	Node root;
	
	Basic(){
		root=null;
	}
		
	public static void main(String args[]) {
		
		Basic tree= new Basic();
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
			
		}
	
}
