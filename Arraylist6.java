import java.util.*;
public class Arraylist6 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++){
                System.err.print(currentList.get(j)+" ");
            }
            System.err.println(" ");
        }
    }
    
}
