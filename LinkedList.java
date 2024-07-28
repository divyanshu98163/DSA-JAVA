
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(3,8);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        System.err.println(ll.size);
    
        
    }
}

