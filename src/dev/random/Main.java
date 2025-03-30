package dev.random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getUniqueRandomArray(6);
        System.out.println(Arrays.toString(firstArray));
        // sortowanie
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
    }

    private static int[] getUniqueRandomArray(int len) {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < len) {
            uniqueNumbers.add(random.nextInt(100)); // losujemy liczby 0-99
        }

        // Konwersja Set na tablicę
        int[] result = new int[len];
        int i = 0;
        for (int num : uniqueNumbers) {
            result[i++] = num;
        }

        return result;
    }
}
