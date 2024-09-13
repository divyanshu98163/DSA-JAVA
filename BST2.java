


public class BST2 {
    static class Node{
        int data;
        Node left;
        Node Right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root ,int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data>val){

           root.left= insert(root.left, val);
        }
        else {

            root.Right = insert(root.Right, val);
        }
        return  root;
    }
    public static void inorder(Node root){
        if(root == null ){
            return;
        }
        inorder(root.left);

        System.out.print(root.data+" ");

        inorder(root.Right);
    }

    public static void printInrange(Node root,int k1,int k2){
        if(root== null){
            return;
        }
        
        if(root.data >= k1 && root.data <= k2){
            printInrange(root.left, k1, k2);
            System.err.print(root.data +" ");
            printInrange(root.Right, k1, k2);
        }
        else if(root.data< k1){
            printInrange(root.left, k1, k2);
        }
        else{
            printInrange(root.left, k1, k2);

        }
    }

    

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.err.println("");

        printInrange(root, 5, 12);

    }
}
