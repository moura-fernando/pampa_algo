
public class BinaryMain {

	public static void main(String[] args) {
		
		//Creating a binaryTree (array) with 9 nodes
		BinaryTreeArray binaryTree = new BinaryTreeArray(9);
		binaryTree.insert("N1");
		binaryTree.insert("N2");
		binaryTree.insert("N3");
		binaryTree.insert("N4");
		binaryTree.insert("N5");
		binaryTree.insert("N6");
		binaryTree.insert("N7");
		binaryTree.insert("N8");
		binaryTree.insert("N9");
		System.out.println();
		
		
		//Types of traversal thru Tree
		System.out.println("PreOrder Traversal");
		//PreOrder Traversal
		binaryTree.preOrder(1); //1 is the root node
		System.out.println();
		
		//InOrder Traversal
		System.out.println("\n"+"In Order Traversal");
		binaryTree.inOrder(1);
		System.out.println();
		
		System.out.println("\n"+"Post Order Traversal");
		//PostOrder Traversal
		binaryTree.postOrder(1);
		System.out.println();
		
		System.out.println("\n"+"Level Order Traversal");
		//LevelOrder Traversal
		binaryTree.levelOrder();
		System.out.println();
		
		System.out.println("\n"+"Search node 7");
		binaryTree.search("N7");
		System.out.println();
		
		System.out.println("\n"+"Delete Node 2");
		//Delete Node
		binaryTree.delete("N2");
		//Confirming Deleting
		binaryTree.inOrder(1);
	}

}
