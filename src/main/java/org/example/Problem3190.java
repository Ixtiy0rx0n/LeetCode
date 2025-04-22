package org.example;

public class Problem3190 {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }
    public static int  minimumOperations(int[] nums) {
       int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i]%3==0)){
                nums[i]++;
                result++;
            }
        }
        return result;
    }
}
