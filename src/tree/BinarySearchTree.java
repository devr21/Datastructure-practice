package tree;

public class BinarySearchTree {

	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
/*	public Node newNode(int val){
		
		Node temp = new Node(val);
		temp.
	}
	*/
	public static void main(String[] args) {
		
		BinarySearchTree t = new BinarySearchTree();
		
		t.root = t.insert(t.root,50);
		t.insert(t.root, 30);
		t.insert(t.root, 20);
		t.insert(t.root, 40);
		t.insert(t.root, 70);
		t.insert(t.root, 60);
		t.insert(t.root, 80);
		
		t.inorder(t.root);
		
		System.out.println(t.search(t.root,50));
	}
	
	public Node search(Node node,int key){
		if(node == null || key == node.getData())
			return node;
		if(node.getData() < key)
			return insert(node.getRight(),key);
			
			
		return insert(node.getLeft(),key);
	}
	
	private void inorder(Node root) {
		if(root == null)
			return;
		
		inorder(root.getLeft());
		System.out.println(root.getData());
		inorder(root.getRight());
	}

	public Node insert(Node node,int val){
		
		if(node == null)
			return new Node(val);
		
		if(val < node.getData())
			node.setLeft(insert(node.getLeft(),val));
		else 
			node.setRight(insert(node.getRight(),val));
		return node;
	}
	
}
