public class BinaryTree {
    private BinaryTreeNode root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void insertLeft(BinaryTreeNode node) {
        if (root == null) {
            root = node;
        } else {
            BinaryTreeNode temp = root;
            while (temp.getLeftChild() != null) {
                temp = temp.getLeftChild();
            }
            temp.setLeftChild(node);
            node.setParent(temp);
        }
        size++;
    }

    public void insertRight(BinaryTreeNode node) {
        if (root == null) {
            root = node;
        } else {
            BinaryTreeNode temp = root;
            while (temp.getRightChild() != null) {
                temp = temp.getRightChild();
            }
            temp.setRightChild(node);
            node.setParent(temp);
        }
        size++;
    }

    public void deleteLeft() {
        if (root != null) {
            BinaryTreeNode temp = root;
            while (temp.getLeftChild() != null) {
                temp = temp.getLeftChild();
            }
            temp.getParent().setLeftChild(null);
            temp.setParent(null);
            size--;
        }
    }

    public void deleteRight() {
        if (root != null) {
            BinaryTreeNode temp = root;
            while (temp.getRightChild() != null) {
                temp = temp.getRightChild();
            }
            temp.getParent().setRightChild(null);
            temp.setParent(null);
            size--;
        }
    }

    public boolean isLeaf(BinaryTreeNode node) {
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printRight() {
        if (root != null) {
            BinaryTreeNode temp = root;
            while (temp.getRightChild() != null) {
                temp = temp.getRightChild();
            }
            System.out.println(temp);
        }
    }

    public void printLeft() {
        if (root != null) {
            BinaryTreeNode temp = root;
            while (temp.getLeftChild() != null) {
                temp = temp.getLeftChild();
            }
            System.out.println(temp);
        }
    }

}
