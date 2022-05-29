class NodeBST {
    int key;
    NodeBST left, right;
    public NodeBST(int data){
        key = data;
        left = right = null;
    }
}
public class BST {
    NodeBST root;
    BST(){
        root = null;
    }
    void postOrder(NodeBST node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }
    void inOrder (NodeBST node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }
    void preOrder (NodeBST node){
        if (node == null){
            return;
        }
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void postOrder_Traversal(){
        postOrder(root);
    }
    void inOrder_Traversal(){
        inOrder(root);
    }
    void preOrder_Traversal(){
        preOrder(root);
    }

    public static void main(String[] args) {
        BST tree =new BST();

        tree.root = new NodeBST(45);
        tree.root.left = new NodeBST(10);
        tree.root.right = new NodeBST(90);
        tree.root.left.left = new NodeBST(7);
        tree.root.left.right = new NodeBST(12);

        System.out.println("PostOrder traversal: ");
        tree.postOrder_Traversal();
        System.out.println("");
        System.out.println("InOrder traversal: ");
        tree.inOrder_Traversal();
        System.out.println("");
        System.out.println("PreOrder traversal: ");
        tree.preOrder_Traversal();
    }
}
