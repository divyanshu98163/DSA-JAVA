
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

    public void addFirst(int data){
        node newNode = new node(data);

        if(head ==null){
            head=tail=newNode;
            return;
        }

        newNode.next= head;

        head = newNode;
    }
    public void addLast(int data){
        node newNode = new node(data);

        if(head ==null){
            head=tail=newNode;
            return;
        }

        
        tail.next = newNode;
        tail = newNode;
        
    }
    public void print(){
        if(head == null ){
            System.err.println("Linked list is Empty ");
            return;
        }
        node temp = head;
        while(temp != null){
            System.err.print(temp.data+"");
            temp = temp.next;
        }
        System.err.println();

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    
        
    }
}

