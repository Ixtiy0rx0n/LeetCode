package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem2942 {
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet", "code"}, 'e'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }
}
