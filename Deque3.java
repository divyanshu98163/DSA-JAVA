
import java.util.*;
import java.util.LinkedList;

public class Deque3 {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data ){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("peek = "+s.peek());

        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        
    }
}