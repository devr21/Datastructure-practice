package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	Node root;
	public LevelOrderTraversal() {
		root = null;
	}
	
	/*public static void main(String[] args) {
		
		LevelOrderTraversal t = new LevelOrderTraversal();
		t.root = t.newNode(1);
		t.root.left = t.newNode(12);
		t.root.right = t.newNode(3523);
		t.root.left.right = t.newNode(213);
		t.root.left.left = t.newNode(757);
		
		System.out.println("Level Order Traversal");
		t.printLevelOrder();
	}
	
	public void printLevelOrder(){
		
		//System.out.println("root "+root.data);
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp = q.poll();
			q.add(temp.left);
			q.add(temp.right);
			System.out.println(temp.data);
		}
		
	}*/

	public Node newNode(int val){
		return new Node(val);
	}
	
}
