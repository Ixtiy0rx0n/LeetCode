package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (nums[i]+nums[i1]==target){
                    return new int[]{i,i1};
                }
            }
        }
        return null;
    }
}