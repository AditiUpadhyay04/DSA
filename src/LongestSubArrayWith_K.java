import java.util.HashMap;

public class LongestSubArrayWith_K {
        public int longestSubarray(int[] arr, int k) {

            int n = arr.length;
            int max = 0;

            HashMap<Long , Integer> HMM = new HashMap<>();

            long prefix = 0;

            for(int i = 0; i < n ; i++){
                prefix += arr[i];

                if(prefix == k){
                    max = Math.max(max , i + 1);
                }
                long rem = prefix - k;
                if(HMM.containsKey(rem)){
                    max = Math.max(max , i - HMM.get(rem));

                }
                if(!HMM.containsKey(prefix)){
                    HMM.put(prefix , i);
                }

            }
            return max;

        }

    public static void main(String[] args) {

    }
}


