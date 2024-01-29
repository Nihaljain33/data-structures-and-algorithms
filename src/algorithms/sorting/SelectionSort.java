package algorithms.sorting;


public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxValueIndex = getMaxValueIndex(arr, 0, lastIndex);
            swap(arr, lastIndex, maxValueIndex);
         }
    }

    private static void swap(int[] arr, int lastIndex, int maxValueIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxValueIndex];
        arr[maxValueIndex] = temp;
    }

    private static int getMaxValueIndex(int[] arr,int start, int lastIndex) {
        int max = start;
        for(int i = 0; i <= lastIndex; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
