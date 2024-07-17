import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.err.println(list);

        // get element 
        int element = list.get(2);
        System.err.println(element);

        // Remove
        int element2 =list.remove(2);

        System.err.println(list);

        // set element 
        list.set(3, 8);
        System.err.println(list);

        // contain element

       
        System.err.println(list.contains(1));
        
        System.err.println(list.contains(22));
    }
}
