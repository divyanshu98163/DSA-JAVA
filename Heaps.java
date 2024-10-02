import java.util.*;
public class Heaps {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add the last Index
            arr.add(data);
            int x =arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)< arr.get(par)){
                int temp =arr.get(x);
                arr.add(x, arr.get(par));
                arr.add(par, temp);

                x=par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx =i;
            if(left<arr.size()&& arr.get(minIdx) > arr.get(left)){
                minIdx =left;
            }
            if(right<arr.size()&& arr.get(minIdx) > arr.get(right)){
                minIdx =right;
            }
            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }


        public int remove(){

            int data = arr.get(0);

            // step 1 swap first &last 
            int temp = arr. get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2 delete last 
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
     heap h = new heap();
     h.add(3);
     h.add(4);
     h.add(1);
     h.add(5);
        
     while(!h.isEmpty()){
        System.err.println(h.peek());
        h.remove();
     }
    }
}
