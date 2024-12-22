package problems.arrayshashing;

import java.util.HashSet;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hash = new HashSet<>();
        for(int i: nums) {
            if(hash.contains(nums[i])) {
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] exampleOne = {1, 2, 3, 4, 5};
        int[] exampleTwo = {1, 1, 3, 4};
        int[] exampleThree = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};

        System.out.println(containsDuplicate(exampleOne));
        System.out.println(containsDuplicate(exampleTwo));
        System.out.println(containsDuplicate(exampleThree));
    }
}
