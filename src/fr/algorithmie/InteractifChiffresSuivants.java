package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez tapez un nombre: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            num += 1;
            System.out.println(num);
        }

    }
}
