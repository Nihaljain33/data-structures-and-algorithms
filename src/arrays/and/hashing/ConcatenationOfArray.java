package arrays.and.hashing;

public class ConcatenationOfArray {
	/**
	 * Concat the array to the length of 2n where the elements repeat for the 2nd space in the array.</br>
	 * </br>
	 * [1]Create a int array with the length of 2n where n is length of input array and create a variable to count</br> 
	 * [2]Iterate over the newly created array</br>
	 * [3]If the count is greater than or equal to length of input array then setting it back to 0</br> 
	 * [4]Add the values of input array to result array.</br>
	 * [5]Return result array</br>
	 * 
	 * Time complexity will be O(2n)</br>
	 * Space complexity will be O(2n)</br>
	 * 
	 * @param nums
	 * @return boolean
	 */
	public int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        int count = 0;
        for(int i = 0; i < res.length; i++) {
            if(count >= nums.length) {
                count = 0;
            }
            res[i] = nums[count];
            count++;
        }
        return res;
    }
}
