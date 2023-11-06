package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

    public static void main(String[] args) {

        afficherLesReglesDuJeu();

        int batonCompte = 21;
        Scanner scanner = new Scanner(System.in);
        boolean joueurActif = true;

        while (batonCompte > 1) {
            if (joueurActif == true) {
                System.out.println("Veuillez choisir un maximum de 3 bâtons: ");
                int joueurPrise = scanner.nextInt();
                while (joueurPrise>3 || joueurPrise<=0 ){
                    System.out.println("Attention c'est 3 bâtons maximum, réessayez: ");
                    joueurPrise = scanner.nextInt();
                }
                batonCompte -= joueurPrise;
                joueurActif = false;
            }
            if (joueurActif == false) {
                int prise = new Random().nextInt(3) + 1;
                System.out.println("L'odinateur a pris: " + prise + " bâtons");
                batonCompte -= prise;
                System.out.println("Il reste " + batonCompte + " bâtons");
                joueurActif = true;
            }
        }

        if (joueurActif == true) {
            System.out.println("Félicitation!\nVous avez gagné");
        }
        if (joueurActif == false) {
            System.out.println("Vous avez perdu");
        }

    }
    public static void afficherLesReglesDuJeu() {

        System.out.println("Jeu Interactif des 21 batons");
        System.out.println("Votre adversaire est l'ordinateur.");
        System.out.println("Celui qui prend le dernier bâton a perdu!");
    }

}


