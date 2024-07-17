import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(7);

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.err.println();
    }
}
