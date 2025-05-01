package org.example;

public class Problem2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].startsWith("X+") || operations[i].startsWith("+")) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
