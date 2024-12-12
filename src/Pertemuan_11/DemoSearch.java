package Pertemuan_11;

public class DemoSearch {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int exponentialSearch(int[] arr, int target) {
        // Jika elemen pertama adalah target
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        return binarySearch(arr, i / 2, Math.min(i, arr.length - 1), target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 10;

        int result = exponentialSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
