package io.github.lizalogvinenko.lesson_7;

public class FillingEmptyArray {

    public static void fillingEmptyArray() {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
    }
}