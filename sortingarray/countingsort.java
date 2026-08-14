import java.util.*;

public class countingsort {

    public static void printarra(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void counringar(int arr[]) {

        int largest = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create count array
        int count[] = new int[largest + 1];

        // Count frequency of every element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Put elements back into original array
        int j = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 1, 3, 7};

        counringar(arr);
        printarra(arr);
    }
}