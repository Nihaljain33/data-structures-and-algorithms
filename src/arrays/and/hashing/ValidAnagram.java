package arrays.and.hashing;

public class ValidAnagram {
	/**
	 * Checks if the array has duplicate element in them.</br>
	 * </br>
	 * [1]Return false if the length of the input strings are not same</br> 
	 * [2]Create a new int array of length 26</br>
	 * [3]Iterate over the length of the input arrays, since both length will be same</br> 
	 * [4]Add the value of count of the character from string 1 at the index starting from a at 0 till z at 26</br>
	 * [5]Remove the value of count of the character from string 2 at the index starting from a at 0 till z at 26</br>
	 * By adding and removing the counts of the char counts will result in an array containing only 0 elements if the strings are anagram</br>
	 * [6]Iterate over the int array created and return false if it contains value more than 0 and return true by default</br>
	 * 
	 * @param nums
	 * @return boolean
	 */
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
            return false;
        }
        int[] alphabets = new int[26];
        for(int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }
        for(int i: alphabets) {
            if(i != 0) {
                return false;
            }
        }
        return true;
	}
}
