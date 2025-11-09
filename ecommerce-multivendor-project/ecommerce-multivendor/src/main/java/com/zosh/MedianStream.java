package com.zosh;

import java.util.*;

public class MedianStream {

    // Function to find the running median for each element in the input array
    public static int[] findMedian(int[] arr) {
        int n = arr.length;       // Length of the input array
        int[] output = new int[n]; // Array to store the result (medians)

        // Min-heap for the larger half of the elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Max-heap for the smaller half of the elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Iterate through each element in the input array
        for (int i = 0; i < n; i++) {
            int num = arr[i];  // Current element to be added to the heaps

            // Add the new element to the appropriate heap (maxHeap or minHeap)
            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.add(num);  // Add to maxHeap (smaller half)
            } else {
                minHeap.add(num);  // Add to minHeap (larger half)
            }

            // Balance the heaps so that their sizes differ by at most 1
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());  // Move the root of maxHeap to minHeap
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());  // Move the root of minHeap to maxHeap
            }

            // Calculate the median depending on the number of elements so far
            if (i % 2 == 0) {
                // If the total number of elements is odd, the median is the root of maxHeap
                output[i] = maxHeap.peek();
            } else {
                // If the total number of elements is even, median is the average of roots
                output[i] = (maxHeap.peek() + minHeap.peek()) / 2;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        // Test case 1: A small array with an increasing sequence
        int[] arr1 = {5, 15, 1, 3};
        int[] result1 = findMedian(arr1);
        System.out.println("Test case 1: " + Arrays.toString(result1));  // Expected: [5, 10, 5, 4]

        // Test case 2: A small array with a sorted sequence
        int[] arr2 = {1, 2};
        int[] result2 = findMedian(arr2);
        System.out.println("Test case 2: " + Arrays.toString(result2));  // Expected: [1, 1]

        // Test case 3: Array with repeated elements
        int[] arr3 = {5, 5, 5, 5};
        int[] result3 = findMedian(arr3);
        System.out.println("Test case 3: " + Arrays.toString(result3));  // Expected: [5, 5, 5, 5]

        // Test case 4: Array with large numbers and descending order
        int[] arr4 = {10, 5, 3, 1};
        int[] result4 = findMedian(arr4);
        System.out.println("Test case 4: " + Arrays.toString(result4));  // Expected: [10, 7, 5, 4]

        // Test case 5: Array with odd number of elements
        int[] arr5 = {7, 9, 8, 6, 4};
        int[] result5 = findMedian(arr5);
        System.out.println("Test case 5: " + Arrays.toString(result5));  // Expected: [7, 8, 8, 7, 7]

        // Test case 6: Array with large number of elements
        int[] arr6 = new int[1000000];
        Arrays.fill(arr6, 1); // All elements are 1
        int[] result6 = findMedian(arr6);
        System.out.println("Test case 6 (Large array of 1's): " + result6[0] + ", " + result6[999999]);  // Expected: [1, 1]
    }
}

