// Реализовать алгоритм пирамидальной сортировки (HeapSort).

package hw_5;

public class task_2 {
    public static void main(String[] args) {
        int [] arr = {1000, 9, 7, 3, 5, 500, 13, 19, -6, -1, 0};
        heapSort(arr);
        System.out.println("HeapSort");

for (int i = 0; i < arr.length; i++)
    System.out.print(arr[i] + " ");
}
  
private static void heapSort(int[] arr) {
    int n = arr.length;
    for (int i = n/2-1; i >=0; i--) 
        heapify(arr, i, n);
    for (int i = n-1; i >=0; i--) {
        int temp = arr[i];
        arr[i] = arr[0];
        arr[0] = temp;

        heapify(arr, 0, i);
    }
}
private static void heapify(int[] arr, int i, int n) {
int l = i*2+1;
int r = i*2+2;
int langest = i;

if (l < n && arr[l]>arr[langest])
    langest = l;
if (r < n && arr[r]>arr[langest])
    langest = r; 
if (i != langest){
    int temp = arr[i];
    arr[i] = arr[langest];
    arr[langest] = temp;

    heapify(arr, langest, n);
}       
}
}


