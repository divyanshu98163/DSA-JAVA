import java.util.ArrayList;
public class ContanerWater {

    public static int ContanWter(ArrayList<Integer> hight){
        int maxWater =0;
        for(int i= 0; i<hight.size(); i++){
            for(int j= i+1; j<hight.size(); j++){
                int Height = Math.min(hight.get(i), hight.get(j));
                int Breath = j-i;
                int current = Height*Breath;
                maxWater= Math.max(maxWater, current);
                
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.err.println(ContanWter(hight)+" ");
        
    }
}
