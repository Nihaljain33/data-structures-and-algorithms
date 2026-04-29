package algorithms.sorting;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String str = "HappyNewYear";

        str.toCharArray();
        System.out.println(str);
        int[] arr = {1,5,6,9,10,2,14,18};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
