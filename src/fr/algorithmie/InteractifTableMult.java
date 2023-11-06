package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.println("Ecrivez un chiffre compris entre 1 et 10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Table de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }

    }

}
