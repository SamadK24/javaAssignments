package com.array.test;

import java.util.Scanner;

public class PeakElementInArray {
    public static int findPeakElement(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            boolean isLeftSmaller = (i == 0) || (arr[i - 1] < arr[i]);
            boolean isRightSmaller = (i == size - 1) || (arr[i] > arr[i + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int elements = scanner.nextInt();

        int[] numbers = new int[elements];
        System.out.println("Enter " + elements + " elements:");
        for (int i = 0; i < elements; i++) {
            numbers[i] = scanner.nextInt();
        }

        int peakIndex = findPeakElement(numbers);
        System.out.println("The peak is at index: " + peakIndex);

        scanner.close();
    }
}
