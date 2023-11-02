package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {

        int[] array = {3, 67, 20, 19, 48, 55};
        int lastItem = array[array.length-1];

        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastItem;
        System.out.println(Arrays.toString(array));
    }
}
