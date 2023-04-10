package hw_3;

// 1. Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)

import java.util.Random;

public class task_2 {
    static int[] mergeSort(int[] arr) {
        int[] left;
        int[] right;
        int[] result;
        if (arr.length <= 1) return arr;

        int middle = arr.length / 2;

        left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        right = new int[middle];
        for (int i = middle; i < arr.length; i++) {
            right[i-middle] = arr[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        result = new int[arr.length];

        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (j >= right.length || (i < left.length && left[i] > right[j])) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
        }
        return result;
    }

    static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[maxIdx]) maxIdx = j;
            }
            int x = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = x;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 100);
        }

        System.out.println("origin array:");
        printArray(arr);
        
        int[] mergeSorted = mergeSort(arr);

        System.out.println("merge sorted:");
        printArray(mergeSorted);

        int[] selectSorted = selectSort(arr);

        System.out.println("select sorted:");
        printArray(selectSorted);
    }
}