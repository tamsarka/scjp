package BST;

public class BinarySearchTree {
	Node rootElement;

	private Node insertInBST(Node root, int newVal) {
		if (root == null) {
			root = new Node();
			root.setValue(newVal);
			System.out.println("inserted .."+newVal);
			return root;
		}

		if (root.getValue() > newVal) {
			root.setLeft(insertInBST(root.getLeft(), newVal));
		} else {
			root.setRight(insertInBST(root.getRight(), newVal));
		}
		
		System.out.println("Inserted .."+newVal + "  : "+root.getValue());
		return root;
	}

	private Node searchNode(Node root, int val) {
		if(root.getValue() == val) {
			return root;
		}
		if (root.getValue() > val) {
			searchNode(root.getLeft(), val);
		} else {
			searchNode(root.getRight(), val);
		}

		return null;
	}
	
	// This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(this.rootElement); 
    } 
  
    // A utility function to do PRINT traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.getValue()); 
            inorderRec(root.right); 
        } 
    } 
    
    
    
    
    public static void main(String[] args) {
    	int[] intArr = {80,12,35,21,23,41,14};
    	BinarySearchTree tree = new BinarySearchTree();
    	for(int i: intArr) {
    		tree.rootElement = tree.insertInBST(tree.rootElement, i);
    	}
    	tree.inorder();
	}
}
