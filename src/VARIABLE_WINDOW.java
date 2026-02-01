public class VARIABLE_WINDOW {

    public static int longestSubaaraySum(int[] a, long k) {
        int n = a.length;
        long sum = 0;
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < n) {
            sum += a[j];

            if (sum < k) {
                j++;
            } else if (sum == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (sum > k) {
                    sum -= a[i];
                    i++;
                }
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
                j++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
