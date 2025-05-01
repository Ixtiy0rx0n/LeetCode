package org.example;

public class Problem3110 {
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }

    public static int scoreOfString(String s) {
        int result = 0;
        for (int i = 0; i < s.length()-1; i++) {
            result+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return result;
    }
}
