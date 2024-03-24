package Start_java;

import java.util.HashMap;
import java.util.Map;

public class Pair_sum_k {
     public static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();


        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : arr) {
            int complement = k - num;
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            if (complement == num) {
                count--;
            }
        }


        return count / 2;

    }

    public static void main(String[] args) {
        int arr[]={1,5,7,1};
        int n=4;
        int k=6;
        System.out.println(getPairsCount(arr,n,k));
    }
}
