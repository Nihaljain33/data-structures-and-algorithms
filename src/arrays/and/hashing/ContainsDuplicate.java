package arrays.and.hashing;

import java.util.HashSet;

public class ContainsDuplicate {
	/**
	 * Checks if the array has duplicate element in them.</br>
	 * </br>
	 * [1]Create a HashSet of the input type</br> 
	 * [2]Iterate over the input array</br>
	 * [3]If the array element is already present in the hash then returning true</br> 
	 * [4]Else add the element to the hashset created.</br>
	 * [5]Returning false by default</br>
	 * 
	 * @param nums
	 * @return boolean
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hash = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			if (hash.contains(nums[i])) {
				return true;
			}
			hash.add(nums[i]);
		}
		return false;
	}
}
