public class BST1 {
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

    
    public static Node delete(Node root,int val){
        if(root.data <val){
            root.Right = delete(root.Right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else {
            // case 1 leaf node 
            if(root.left == null && root.Right == null){
                return null;
            }
            // case 2  Single Chlild 
            if(root.left == null){
                return root.Right;
            }
            else if(root.Right == null){
                return root.left;
            }

            // case 3 both children 
            Node IS = findInorderSuccs(root.Right);
            root.data= IS.data;
            root.Right = delete(root.Right, IS.data);

        }
        return root;
    }
    public static Node findInorderSuccs(Node root){
        while(root.left !=null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        

        System.err.println();
        // case 1 
        root = delete(root, 1);
        System.err.println("");
        
        inorder(root);
        // case 2
        root = delete(root, 10);
        System.err.println("");
        inorder(root);
        // case 3
        root = delete(root, 5);
        System.err.println("");
        inorder(root);
    }
}
