public class BinaryTree1 {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // HEIGHT 

    public static int Height(Node root){
        if(root == null){
            return 0;     
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh)+1;
    }

    // count 

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount+1;
    }

    // sum 

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum+root.data;
    }
    // diameter -> approcah 1st  tc = O(n)

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDim = diameter(root.left);
        int rightDim = diameter(root.right);
        int lh = Height(root.left);
        int rh = Height(root.right);

        int selfDim = lh+rh+1;
        return Math.max(selfDim, Math.max(leftDim, rightDim));
    }

    // diameter ->approach 2 /// O(n)
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam =diam;
            this.ht= ht;
        }
    }
    public static Info diameter2(Node root){ 
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1); 
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return  new Info(diam, ht);
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height  "+Height(root));

        System.out.println("count "+count(root));

        System.out.println("sum "+sum(root));

        System.err.println("dimeter "+diameter2(root).diam);
    }
}
