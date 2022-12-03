
public class Questao4 {
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTreeNode node1 = new BinaryTreeNode(10, "Node 1");
        BinaryTreeNode node2 = new BinaryTreeNode(9, "Node 2");
        BinaryTreeNode node3 = new BinaryTreeNode(2, "Node 3");
        BinaryTreeNode node4 = new BinaryTreeNode(3, "Node 4");
        BinaryTreeNode node5 = new BinaryTreeNode(2, "Node 5");
        BinaryTreeNode node6 = new BinaryTreeNode(1, "Node 6");
        BinaryTreeNode node7 = new BinaryTreeNode(5, "Node 7");
        BinaryTreeNode node8 = new BinaryTreeNode(7, "Node 8");
        BinaryTreeNode node9 = new BinaryTreeNode(8, "Node 9");
        BinaryTreeNode node10 = new BinaryTreeNode(0, "Node 10");

        tree.insertLeft(node1);
        tree.insertLeft(node2);
        tree.insertLeft(node3);
        tree.insertLeft(node4);
        tree.insertLeft(node5);

        tree.insertRight(node6);
        tree.insertRight(node7);
        tree.insertRight(node8);
        tree.insertRight(node9);
        tree.insertRight(node10);
        
     // test methods
        System.out.println("Size: " + tree.getSize());
        System.out.println("Root: " + tree.getRoot());
        System.out.println("Left child: " + tree.getRoot().getLeftChild());
        System.out.println("Right child: " + tree.getRoot().getRightChild());
        
    // pos order method //
        
        System.out.println("---------POS ORDER----------");
        
        posOrder(tree.getRoot());
        
	}
	
	public static void posOrder(BinaryTreeNode node) {
        if (node != null) {
            posOrder(node.getLeftChild());
            posOrder(node.getRightChild());
            System.out.println(node);
        }
	}
}
