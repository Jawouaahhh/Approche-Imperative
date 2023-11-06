package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        int[] tableau = new int[5];
        int nombreElements = 0;
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        while (true) {
            afficherMenu();
            userChoice = scanner.nextInt();

            switch (userChoice) {

                case 1:
                    if (nombreElements == tableau.length) {
                        tableau = agrandirTableau(tableau);
                    }
                    System.out.println("Entrez un nombre: ");
                    userChoice = scanner.nextInt();
                    tableau[nombreElements] = userChoice;
                    nombreElements++;
                    break;

                case 2:
                    System.out.println("Les nombres existants sont: ");
                    for (int i = 0; i < tableau.length ; i++) {
                        System.out.println(tableau[i]);
                    }
                    break;

                default:
                    System.out.println("Veuillez selectionner 1 et 2");
                    break;
            }
        }
    }

    public static void afficherMenu() {
        System.out.println("Menu:");
        System.out.println(" 1. Option 1: Taper un nombre");
        System.out.println(" 2. Option 2: Afficher les nombres existants");
        System.out.println("Selectionnez une option (tapez 1 ou 2): ");
    }

    public static int[] agrandirTableau(int[] tableau) {
        int nouvelleTaille = tableau.length * 2;
        return Arrays.copyOf(tableau, nouvelleTaille);
    }

}




