package dev.dev.randomWithRepeat;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(6);
//        System.out.println(Arrays.toString(firstArray));

//        Sortowanie
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println("--------------------------");

//        Kopiowanie tablic
        int[] secondArray = getRandomArray(10);
        System.out.println(Arrays.toString(secondArray));
        Arrays.sort(secondArray);
        System.out.println("Sorted: "+ Arrays.toString(secondArray));

        int[] thirdArray = Arrays.copyOf(secondArray, 5);
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("--------------------------");
        int[] extendedArray = Arrays.copyOf(secondArray, 20);
        System.out.println(Arrays.toString(extendedArray));

        Arrays.sort(extendedArray);
        System.out.println("Now sorted: " + Arrays.toString(extendedArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); // zakres liczb wartość bound-1 np 100 - zakres 0-99
        }
        return newInt;
    }
}
