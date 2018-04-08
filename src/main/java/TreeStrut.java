import java.util.Stack;

public class TreeStrut {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree();
        tree.deep();
    }


    static class Node{
        public Node left;
        public Node right;
        public int data;
    }

    static class Tree {
        public Node root;

        public Tree() {
            root = new Node();
            root.data = 100;

            Node node1 = new Node();
            node1.data = 1;
            Node node2 = new Node();
            node2.data = 2;
            Node node3 = new Node();
            node3.data = 3;
            Node node4 = new Node();
            node4.data = 4;
            Node node5 = new Node();
            node5.data = 5;
            Node node6 = new Node();
            node6.data = 6;
            Node node7 = new Node();
            node7.data = 7;
            Node node8 = new Node();
            node8.data = 8;
            root.left = node1;
            root.right = node2;
            node1.left = node3;
            node1.right = node4;
            node2.left = node5;
            node2.right = node6;
            node3.right = node7;
            node4.left = node8;

        }

        public void deep() {
            Stack stack = new Stack();
            stack.push(root);
            Node current = root;
            while (!stack.empty()) {
                current = (Node) stack.pop();
                print(current);
                if (hasRightChild(current)) {
                    stack.push(current.right);
                }
                if (hasLeftChild(current)) {
                    stack.push(current.left);
                }
            }
        }

        public void print(Node node) {
            System.out.print(node.data + ",");
        }

        public boolean isLeaf(Node node) {
            if (node.left == null && node.right == null) {
                return true;
            }
            return false;
        }

        public boolean hasLeftChild(Node node) {
            if (node.left != null) {
                return true;
            }
            return false;
        }

        public boolean hasRightChild(Node node) {
            if (node.right != null) {
                return true;
            }
            return false;
        }

        public void addNode(Node newNode) {
            if (root == null) {
                root = newNode;
            }
            Node parent = root;
            Node leftChild = root.left;
            Node rightChild = root.right;
            Node leff = null;
            if (parent.data < newNode.data) {
                while (parent.left == null && parent.right == null) {

                }
            }
        }
    }
}
