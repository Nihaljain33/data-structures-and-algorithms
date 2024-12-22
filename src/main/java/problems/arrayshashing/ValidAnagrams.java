package problems.arrayshashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {

    static boolean isValidAnagramOne(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] charsCount = new int[27];
        for(int i = 0; i < s.length(); i++) {
            charsCount[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) {
            charsCount[t.charAt(i) - 'a']--;
        }
        for(int count: charsCount) {
            if(count == 0) return false;
        }
        return true;
    }

    static boolean isValidAnagramTwo(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            if(!charCountMap.containsKey(t.charAt(i))) return false;
            charCountMap.put(t.charAt(i), charCountMap.get(t.charAt(i)) - 1);
            if(charCountMap.get(t.charAt(i)) == 0) {
                charCountMap.remove(t.charAt(i));
            }
        }
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        String s = "ant";
        String t = "tan";

        System.out.println(isValidAnagramOne(s, t));
        System.out.println(isValidAnagramTwo(s, t));
    }
}
