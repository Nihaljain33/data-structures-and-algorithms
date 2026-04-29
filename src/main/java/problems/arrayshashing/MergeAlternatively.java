package problems.arrayshashing;

import java.util.Arrays;

public class MergeAlternatively {

    static String mergeAlternately(String word1, String word2) {
        char[] resChars = new char[word1.length() + word2.length() + 1];

        int index = 0;
        for(int i = 0; index < word1.length(); i = i + 2) {
            resChars[i] = word1.charAt(index++);
        }

        index = 0;
        for(int i = 1; index < word2.length(); i = i + 2) {
            resChars[i] = word2.charAt(index++);
        }

        return new String(resChars);
    }

    public static void main(String[] args) {
        String one = "abc";
        String two = "pqrs";
        System.out.println(mergeAlternately(one, two));
    }
}
