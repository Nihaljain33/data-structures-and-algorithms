package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            // arr.length - i - 1 because to stop the compare of already sorted last element.
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,6,9,10,2,14,18};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
