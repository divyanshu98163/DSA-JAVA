public class Queue3 {
    static class Node{
        int data;
        Node next;

        Node(int data ) {
            this.data =data;
            this.next = null;
        }

        
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null&& tail == null;
        }

        

        // add 
        public static void add(int data){
            Node newNode = new Node(data);
            if(head== null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }
        //remove 

        public static int remove(){
            if(isEmpty()){
                System.err.println("Queue is empty");
                return -1;
            }
            
            int front = head.data;

            // single element 
            if(head == tail){
                head = tail = null;
            }
            else{
                head =head.next;
            }
            return front;

        }
        public static int peek(){
            if(isEmpty()){
                System.err.println("Empty Queue ");
                return -1;
            }
            return head.data;
        }


        
    }
    public static void main(String[] args) {
       Queue q= new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
       System.err.println(q.remove());
       q.add(4);
       System.err.println(q.remove());
       q.add(5);

       while(!q.isEmpty()){
        System.err.println(q.peek());
        q.remove();
       }
    }
}
