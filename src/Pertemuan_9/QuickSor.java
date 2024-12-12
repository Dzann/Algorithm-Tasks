package Pertemuan_9;

import java.util.Arrays;

public class QuickSor {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        
        System.out.println("Pivot: " + pivot + " (array: " + Arrays.toString(array) + ")");

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                // Print the array after each swap
                System.out.println("Swapped: " + array[i] + " and " + array[j] + " -> " + Arrays.toString(array));
            }
        }

        // Swap the pivot element to its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Print the array after moving the pivot
        System.out.println("Moved pivot: " + pivot + " to correct position -> " + Arrays.toString(array));

        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            System.out.println("Array after partitioning: " + Arrays.toString(array));

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}

class Main {
    public static void main(String args[]) {
        int[] data = { 20, 14, 7, 3, 6, 8 };
        System.out.println("Array Yang Belum Di Sortir: ");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        QuickSort.quickSort(data, 0, size - 1);

        System.out.println("Array yang Sudah di Sortir: ");
        System.out.println(Arrays.toString(data));
    }
}