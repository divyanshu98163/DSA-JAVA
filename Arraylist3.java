import java.util.*;

public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(2);
        list.add(8);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<list.size(); i++){
            if(max < list.get(i)){
                max =list.get(i);
            }
        }

        System.out.println("Maximum element = "+max);
    }
}
