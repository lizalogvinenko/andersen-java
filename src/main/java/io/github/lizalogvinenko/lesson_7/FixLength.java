package io.github.lizalogvinenko.lesson_7;

import java.util.Arrays;

public class FixLength {

    public static void fixLength(int len, int initialValue) {

        int[] elements = new int[len];

        for (int i = 0; i < len; i++) {
            Arrays.fill(elements, initialValue);
        }
    }
}