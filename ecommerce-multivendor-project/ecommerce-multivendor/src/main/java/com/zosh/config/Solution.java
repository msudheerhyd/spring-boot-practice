package com.zosh.config;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 1, 3};
        int n = 2;
        System.out.println(minSum(nums, n));
    }

    private static int minSum(int[] nums, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }
        System.out.println(maxHeap);
        for (int i=0; i<n; i++) {
            int largest = maxHeap.poll();
            int val = largest / 2;
            maxHeap.add(val);
        }

        int ans = 0;
        while (!maxHeap.isEmpty()) {
            ans += maxHeap.poll();
        }

        System.out.println(maxHeap);
        return ans;
    }
}
