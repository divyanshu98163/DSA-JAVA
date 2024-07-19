import java.util.*;
public class Arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(7);

        // assending order 
        Collections.sort(list);
        System.err.println("Sorted Array list assending order "+list);

        //decending Order

        Collections.sort(list,Collections.reverseOrder());
        System.err.println("Sorted Array list decending order "+list);

    }
}    
