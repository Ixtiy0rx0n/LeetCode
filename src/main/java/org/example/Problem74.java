package org.example;

import java.util.Arrays;

public class Problem74 {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1},{3}}, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .anyMatch(num -> num == target);
    }
}
