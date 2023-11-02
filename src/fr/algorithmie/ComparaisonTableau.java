package fr.algorithmie;

public class ComparaisonTableau {

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int count = 0;

        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Le nombre d'éléments en commun est : " + count);
    }
}

