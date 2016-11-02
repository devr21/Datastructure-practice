package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root ;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.root = new Node(1);
		t.root.setLeft(new Node(12));
		t.root.setRight(new Node(32));
		t.root.getRight().setRight(new Node(365));
		t.root.getLeft().setLeft(new Node(123));
		System.out.println("Level Order Traversal");
		
		t.printLevelOrder();
		System.out.println("height of tree: "+t.height(t.root));
		System.out.println("printing level 2");
		t.printGivenLevel(t.root,2);
		
		System.out.println("preorder"); 
		t.preorder(t.root);
		System.out.println("inorder"); 
		t.inorder(t.root);
		System.out.println("postorder"); 
		t.postorder(t.root);
		
		System.out.println("diameter "+t.diameter(t.root));
		
	}
	
	public int diameter(Node root){
		
		if(root == null)
			return 0;
		int lh = height(root.getLeft());
		int rh = height(root.getRight());
		
		int ld = diameter(root.getLeft());
		int rd = diameter(root.getRight());
		
		return Math.max(lh+rh+1,Math.max(ld,rd));
		
	}
	
	public void postorder(Node root){
		
		if(root == null)
			return;
		
		postorder(root.getLeft());
		
		postorder(root.getRight());
		System.out.println(root.getData());
	}
	
	public void inorder(Node root){
		
		if(root == null)
			return;
		
		inorder(root.getLeft());
		System.out.println(root.getData());
		inorder(root.getRight());
		
	}
	
	public void preorder(Node root){
		
		if(root == null)
			return;
		System.out.println(root.getData());
		preorder(root.getLeft());
		preorder(root.getRight());
		
	}
	
	public void printGivenLevel(Node root,int level){
		if(root == null)
			return;
		if(level == 1)
			System.out.println(root.getData());
		else if(level > 1){
			printGivenLevel(root.getLeft(),level-1);
			printGivenLevel(root.getRight(),level-1);
		}
	}
	
	public int height(Node root){
		
		if(root == null)
			return 0;
		else{
		
			int lh = height(root.getLeft());
			int rh = height(root.getRight());
			
			if(lh > rh)
				return lh+1;
			else
				return rh+1;
		}
		
		
	}
	
	public void printLevelOrder(){
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()){
			/*if(q.peek() == null)
				continue;*/
			Node temp = q.poll();
			System.out.println(temp.getData());
			if(temp.getLeft() != null)
			q.add(temp.getLeft());
			if(temp.getRight() != null)
			q.add(temp.getRight());
			
		}
		
	}
	
}
