

public class BST3 {
    static class Node{
        int data;
        Node left;
        Node Right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node CreateMirror(Node root){
        if(root == null){
            return null;
        }
        Node lefts = CreateMirror(root.left);
        Node Rights = CreateMirror(root.Right);

        root.left =Rights;
        root.Right = lefts;
        return root;
    }
    public static void preOrder(Node root){
        if(root== null){
            return;
        }
        System.err.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.Right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.Right =new Node(10);
        root.left.left =new Node(3);
        root.left.Right = new Node(6);
        root.Right.Right = new Node(11);

        CreateMirror(root);
        preOrder(root);

        
    }
}
