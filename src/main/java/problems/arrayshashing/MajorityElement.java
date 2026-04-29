package problems.arrayshashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxValue = 0;
        for(Map.Entry<Integer, Integer> keyValue:  frequency.entrySet()) {
            maxValue = Math.max(maxValue, keyValue.getValue());
            if(maxValue == keyValue.getValue()) {
                max = keyValue.getKey();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,4};

        int majority = majorityElement(nums);

        System.out.println(majority);
    }
}
