package problems.arrayshashing;

import java.util.*;

public class TopKFrequentElements {

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        // Initializing the frequency list
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Counting the frequency
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Adding the count to the index and number to the list

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,2,2,5,5,5,5,5,5,5,5,3,3,3,3,3,100};
        int k = 3;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
