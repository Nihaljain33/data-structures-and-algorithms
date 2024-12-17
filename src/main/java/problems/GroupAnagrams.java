package problems;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for( String s: strs ){
            char[] valArr = s.toCharArray();
            Arrays.sort(valArr);
            String key = new String(valArr);

            ArrayList<String> ll = map.getOrDefault(key, new ArrayList<String>());
            ll.add(s);
            map.put(key, ll);
        }

        List<List<String>> ans = new ArrayList<>();
        for( Map.Entry<String, ArrayList<String>> entry: map.entrySet() ){
            ans.add(entry.getValue());
        }

        return ans;
    }

   public static void main(String[] args) {
        String[] exampleOne = {"eat","tea","tan","ate","nat","bat"};
        String[] exampleTwo = {""};
        String[] exampleThree = {"a"};
        System.out.println(groupAnagrams(exampleOne));
        System.out.println(groupAnagrams(exampleTwo));
        System.out.println(groupAnagrams(exampleThree));
   }
}
