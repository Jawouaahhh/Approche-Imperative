package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tabNombre = new int[3];
        System.out.println("Veuillez saisir 10 nombres: ");

        for (int i = 1; i <= 3; i++) {
            int num = scanner.nextInt();
            tabNombre[i - 1] = num;
        }

        int maxValeur = tabNombre[0];
        for (int i = 0; i <= tabNombre.length - 1; i++) {
            if (maxValeur < tabNombre[i]) {
                maxValeur = tabNombre[i];
            }

        }
        System.out.println("La valeur entrée la plus grande est: "+maxValeur);

    }

}
