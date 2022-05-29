public class infix {
    Node root;
    public void addNode(int key, String Name){
        Node newNode = new Node(key, Name);
        if (root == null){
            root = newNode;
        }
        else {
            Node mainNode = root;
            Node parent;
            while (true){
                parent = mainNode;

                if(key > mainNode.key){
                    mainNode = mainNode.LeftChild;
                    if (mainNode == null){
                        parent.LeftChild = newNode;
                        return;
                    }
                }
                else {
                    mainNode = mainNode.RightChild;
                    if (mainNode == null){
                        parent.RightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preFixTraversal(Node mainNode){
        if (mainNode!=null){
            System.out.print(mainNode);
            inFixTraversal(mainNode.LeftChild);
            inFixTraversal(mainNode.RightChild);
        }
    }
    public void inFixTraversal(Node mainNode){
        if (mainNode!=null){
            inFixTraversal(mainNode.LeftChild);
            System.out.print(mainNode);
            inFixTraversal(mainNode.RightChild);
        }
    }
    public void postFixTraversal(Node mainNode){
        if (mainNode!=null){
            inFixTraversal(mainNode.LeftChild);
            inFixTraversal(mainNode.RightChild);
            System.out.print(mainNode);
        }
    }

    public static void main(String[] args) {
        infix tree = new infix();
        tree.addNode(50, " Office Worker ");
        tree.addNode(100, " CEO ");
        tree.addNode(80, " CTO ");
        tree.addNode(70, " Secretary ");
        tree.addNode(90, " COO ");
        tree.addNode(40, " Staff ");
        tree.addNode(60, " Manager ");

        System.out.println("preFix Traversal");
        tree.preFixTraversal(tree.root);
        System.out.println("");
        System.out.println("inFix Traversal");
        tree.inFixTraversal(tree.root);
        System.out.println("");
        System.out.println("postFix Traversal");
        tree.postFixTraversal(tree.root);
    }
}
class Node{
    int key;
    String Name;

    Node LeftChild;
    Node RightChild;

    Node (int key, String Name){
        this.key = key;
        this.Name = Name;
    }
    public String toString(){
        return Name + "has a key value of: " + key;
    }
}
