package algorithms;

public class BinarySearch {

        // return the index
        // return -1 if it does not exist
        static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            if(arr.length != 0 && arr[start] < arr[end]) {
                while(start <= end) {
                    // find the middle element
                    // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                    int mid = start + (end - start) / 2;

                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    } else {
                        // Index found
                        return mid;
                    }
                }
                return -1;
            } else {
                while (start <= end) {
                    // find the middle element
                    int mid = start + (end - start) / 2;

                    if (target < arr[mid]) {
                        start = mid - 1;
                    } else if (target > arr[mid]) {
                        end = mid + 1;
                    } else {
                        // Index found
                        return mid;
                    }
                }
                return -1;
            }
        }
}
