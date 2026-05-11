package problems.arrayshashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {


    public static String encode(String[] strings) {
        StringBuilder sb = new StringBuilder();
        //Appending the string with the length and a delimiter
        for(String s: strings) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String string) {
        List<String> result = new ArrayList<>();
        char[] arr = string.toCharArray();
         for(int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            // Extracting the number of characters in the word.
            while(arr[i] != '#') {
                // Post increment to move to next element.
                sb.append(arr[i++]);
            }
            // Once it encounters the delimiter, breaking the loop and moving to next element.
            i++;

            int numOfChars = Integer.parseInt(sb.toString()); // Number of characters in the word.
            int end =  i + numOfChars; // length of the word will be same as the length index after delimiter + number of chars in word.
            sb = new StringBuilder(); // clearing the String Builder to append the word
            // Adding words to the string builder
            while(i < end) {
                sb.append(arr[i++]);
            }
            // Post increment will move the index past the number of word which was encoded so decrementing again.
            i--;
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] exampleOne = {"eat","tea","tan","ate","nat","bat"};
        String[] exampleTwo = {""};
        String[] exampleThree = {"a"};

        System.out.println(encode(exampleOne));
        System.out.println(encode(exampleTwo));
        System.out.println(encode(exampleThree));

        System.out.println(decode(encode(exampleOne)));
        System.out.println(decode(encode(exampleTwo)));
        System.out.println(decode(encode(exampleThree)));
    }
}