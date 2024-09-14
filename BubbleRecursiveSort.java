import java.util.*;

class BubbleRecursiveSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void fun(int[] arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) { // Corrected the loop condition
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        fun(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = c.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (int):");
        for (int i = 0; i < n; i++) {
            arr[i] = c.nextInt();
        }
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        fun(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        c.close();
    }
}
