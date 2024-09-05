
import java.util.*;
import java.util.LinkedList;

public class Queue4 {

    
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>(); 
       q.add(1);
       q.add(2);
       q.add(3);
       

       while(!q.isEmpty()){
        System.err.println(q.peek());
        q.remove();
       }
    }
}
