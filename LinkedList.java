
import com.sun.security.auth.module.LdapLoginModule;
import java.nio.file.Watchable;
import java.util.*;

public class LinkedList {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next= null;


        }
    }
    public static node head;
    public static node tail;
    public static int size;


    //add first 
    public void addFirst(int data){
        node newNode = new node(data);
        size++;

        if(head ==null){
            head=tail=newNode;
            return;
        }

        newNode.next= head;

        head = newNode;
    }

    // add last 
    public void addLast(int data){
        node newNode = new node(data);
        size++;

        if(head ==null){
            head=tail=newNode;
            return;
        }

        
        tail.next = newNode;
        tail = newNode;
        
    }

    // print 
    public void print(){
        if(head == null ){
            System.err.println("Linked list is Empty ");
            return;
        }
        node temp = head;
        while(temp != null){
            System.err.print(temp.data+"->");
            temp = temp.next;
        }
        System.err.println();

    }
    // add mid 
    public void add(int idx,int data){

        if(idx==0){
            addFirst(data);
            return;
        }
        node newNode = new node(data);
        size++;
        node temp=head;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next =temp.next;
        temp.next= newNode;


    }

    // remove first 
    public int removeFirst(){
        if(size ==0){
            System.err.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val =head.data;
            head =tail =null;
            size =0;
            return val;
        }

        int val = head.data;
        head =head.next;
        size--;
        return val;
    }
    // remove last 
    public int removeLast(){
        if(size ==0){
            System.err.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val =head.data;
            head =tail =null;
            size =0;
            return val;
        }
        node prev = head;
        for(int i =0; i<size-2; i++){
            prev =prev.next;

        }
        int val =prev.next.data;
        prev.next = null;
        tail =prev;
        size--;
        return val;

    }
    public int Iterative(int key ){
        node temp =head;
        int i=0;
        while(temp!=null){
            if(temp.data ==key){
                return  i;
            }
        }
        return -1;
    }

    // Search (recursive)
    public int helper(node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int reSearch(int key){
        return helper(head, key);
    }


    // revarse a linked list 

    public void revrse(){
        node prev =null;
        node curr = tail =head ;
        node next;

        while(curr!=null){
            next =curr.next;
            curr.next =prev;
            prev =curr;
            curr = next;
        }
        head =prev;
    }



    // Find and remove nth node from end 

    public void deleteNth(int n){
        node temp =head;
        size =0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n==size){
            head =head.next;
            return;
        }
        int i =1;
        int iTofind =size-1;
        node prev =head;
        while(i<iTofind){
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }

    // cheak if likedlist palindrome

    //slow -fast approach

    public node midFind(node head){
        node slow =head;
        node fast =head;

        while(fast!=null && fast.next!= null){
            slow = slow.next; //+1
            fast = fast.next; //+2

        }
        return slow;
    }

    public boolean cheakPalindrom(){
        if(head== null || head.next ==null){
            return true;
        }

        // 1st midfind 
        node mid = midFind(head);

        // revese 2nd hailf 
        node curr = mid;
        node prev = null;
        while(curr != null){
            node next =curr.next;
            curr.next =prev;
            prev =curr;
            curr = next;
        }
        node right = prev;
        node left = head;

        //cheak if equal 
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;


    }
    // Detect a lopp /cycle in ll
    public  static boolean isCycle(){
        node slow =head;
        node fast = head;

        while (fast != null && fast.next!=null) {
            slow= slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // remove a loop/cycle in ll

    public static void removeCycle(){
        //detect cycle 
        node slow = head;
        node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        // find meeting ponit
        slow = head;
        node prev = null;
        while (slow != fast ){
            prev=fast;
            slow= slow.next;
            fast = fast.next;
        }

        // remove cycle 
        prev.next =null;
    }
// merge Sort On a linked list 
    private node getmid(node head){
        node slow = head;
        node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private node Merge(node head1,node head2){
        node mergedll = new node(-1);
        node temp = mergedll;
        while(head1!= null && head2!= null){
           if(head1.data<=head2.data){
             temp.next=head1;
             head1 =head1.next;
             temp =temp.next;
           } else{
             temp.next=head2;
             head2 =head2.next;
             temp =temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1 =head1.next;
            temp =temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2 =head2.next;
            temp =temp.next;
        }

        }
        return mergedll.next;

    }
    public node mergedSort(node head){
        if(head== null || head.next==null){
            return head;
        }
        // find mid 
        node mid = getmid(head);

        //left And Righr=t ms

        node rightHead=mid.next;
        mid.next=null;
        node newLeft =mergedSort(head);
        node newRight = mergedSort(rightHead);

        // merge 
        return Merge(newLeft, newRight);

    }

    public void zigzag(){
        // find mid 
        node slow =head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            
        }
        node mid = slow;
        //reverse 2nd half
        node curr = mid.next;
        mid .next =null;
        node prev = null ;
        node next;
        while (curr!=null){
            next=curr.next;
            curr.next =prev;
            prev = curr;
            curr =next;
        }
        node left =head;
        node right= prev;
        node nextL,nextR;
         

        //alt merge - zig-zag merge '
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            
            left=nextL;
            right=nextR;
        }
        
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        
        // ll.addLast(1);
        // ll.addLast(4);
        // ll.add(3,8);
        
        // // ll.removeFirst();
        // // ll.print();
        // // ll.removeLast();
        // // ll.print();

        // // System.err.println(ll.size);
        // // System.err.println(ll.reSearch(4));
        // // System.err.println(ll.reSearch(10));
        // ll.print();
        // // ll.revrse();
        
        
        // // ll.deleteNth(3);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(1);
        // ll.print();

        // System.err.println("cheak palindrom = "+ll.cheakPalindrom());
    
        // // Detect a lopp /cycle in ll

        // head= new node(1);
        // node temp =new node(2);
        // head.next = temp;
        // head.next.next = new node(4);
        // head.next.next.next=temp;

        // System.err.println("loop is cycle :- "+isCycle());
        // removeCycle();
        // System.err.println("loop is cycle remove  :- "+isCycle()); 
        // ll.print();

        // //merge sort 
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();
        // ll.head= ll.mergedSort(ll.head);
        // ll.print();

        //zigzag 

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.zigzag();
        ll.print();
    }
}

