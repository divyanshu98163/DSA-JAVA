import java.util.*;
import java.util.LinkedList;

public class Queue6 {
    public static void Reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
    }

    public static void main(String arg[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        Reverse(q);
        while(!q.isEmpty()){
        System.err.println(q.remove());

        }
        
    }    
}
