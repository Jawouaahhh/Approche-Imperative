package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Les entiers supérieurs à 3 sont: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }


        System.out.println("Les entiers pairs de la liste sont: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }


        System.out.println("Les valeurs des index pairs sont: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }


        System.out.println("Les entiers impairs de la liste sont: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }


    }


}
