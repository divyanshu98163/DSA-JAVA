public class BST {
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

    public static boolean Search(Node root ,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }

        if(root.data > key){
           return  Search(root.left, key);
        }
        if(root.data < key){
            return Search(root.Right, key);
        }
        return false;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        // inorder(root);
        int key = 5;
        System.err.println(Search(root, key));

        System.err.println();
    }
}
