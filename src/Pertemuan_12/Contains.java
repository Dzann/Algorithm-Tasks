package Pertemuan_12;

public class Contains {
    public static boolean Contains(int[]arr, int n, int target){
        if (n == arr.length) {
            return false;
        } else if (arr[n] == target){
            return true;
        }
        return Contains(arr, n + 1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 2;

        boolean result = Contains(arr, 0, target);
        System.out.println("Target Ada di dalam Array : " + result);

    }

}
