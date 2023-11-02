package fr.algorithmie;

import java.util.Arrays;

public class CalculMoyenne {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Methode 1:");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            double item = array[i];
            sum += item;
        }
        double average1 = sum / array.length;
        System.out.println("\t- La moyenne du tableau est: " + average1);


        System.out.println("Methode 2:");
        double average2 = Arrays.stream(array).average().orElse(0.0);
        System.out.println("\t- La moyenne du tableau est: " + average2);


    }
}


