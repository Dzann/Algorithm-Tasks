package Pertemuan_12;

public class FindMax {
    public static int findMax(int[] arr, int n, int max) {
        if (n == 0) {
            return max;
        } else if (arr[n] > max) {
            max = arr[n];
        } else if (n > 0) {
            findMax(arr, n -1 , max);
        }
       return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int max = 0;

        int result = findMax(arr, arr.length - 1, max);
        System.out.println("Nilai Tertinggi : " + result);
    }
}
