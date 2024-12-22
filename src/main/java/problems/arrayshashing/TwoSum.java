package problems.arrayshashing;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(hash.containsKey(diff)) {
                int[] result = {hash.get(diff), i};
                return result;
            }
            hash.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 9};
        int target = 9;

        System.out.println(twoSum(nums, target));
    }
}
