import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySUm {

        static ArrayList<Integer> subarraySum(int[] arr, int target) {

            int n = arr.length;
            ArrayList<Integer> list = new ArrayList<>();

            HashMap<Long , Integer> hmm = new HashMap<>();

            long prefix = 0;

            for(int i = 0; i < n; i++){
                prefix += arr[i];

                if(prefix == target){
                    list.add(0 + 1);
                    list.add(i + 1);
                    return list;
                }
                long rem = prefix - target;
                if(hmm.containsKey(rem)){
                    list.add(hmm.get(rem) + 2);
                    list.add(i + 1);
                    return list;
                }
                hmm.put(prefix , i);
            }
            list.add(-1);
            return list;
        }

    public static void main(String[] args) {

    }
}


