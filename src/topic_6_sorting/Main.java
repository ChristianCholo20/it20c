import topic_6_sorting.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Choose a sorting algorithm
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Selection Sort");
        int choice = scanner.nextInt();

        // Timer to measure sorting time
        long startTime = System.nanoTime();

        switch (choice) {
            case 1:
                BubbleSort.sort(arr);
                break;
            case 2:
                InsertionSort.sort(arr);
                break;
            case 3:
                MergeSort.sort(arr);
                break;
            case 4:
                QuickSort.sort(arr);
                break;
            case 5:
                SelectionSort.sort(arr);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime; // in nanoseconds

        // Output sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Output time taken
        System.out.println("Sorting took " + duration + " nanoseconds.");
    }
}
