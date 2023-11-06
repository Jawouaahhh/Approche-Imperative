package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Si vous trouvez le nombre magique, vous avez gagné!\nVeuillez choisir un nombre entre 1 et 100: ");
        int userChoice = scanner.nextInt();
        int counter = 1;

        while (userChoice != randomNumber) {
            if (userChoice > randomNumber) {
                System.out.println("Vous êtes au dessus, veuillez saisir un  nouveau numéro: ");
                userChoice = scanner.nextInt();
            } else if (userChoice < randomNumber) {
                System.out.println("Vous êtes en dessous, veuillez saisir un  nouveau numéro: ");
                userChoice = scanner.nextInt();
            }
            counter++;
        }
        System.out.println("Bravo vous avez trouvé en "+counter+ " coups le numéro magique: " + randomNumber);
    }
}
