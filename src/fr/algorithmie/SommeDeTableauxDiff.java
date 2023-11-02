package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int[] arraySum = new int[16];

        for (int i = 0; i <= 7; i++) {
            int item1 = array1[i];
            int item2 = array2[i];
            arraySum[i] = item1 + item2;
        }

        for (int i = 8; i < 16; i++) {

            arraySum[i] = array1[i];

        }

        System.out.println(Arrays.toString(arraySum));
    }
}
