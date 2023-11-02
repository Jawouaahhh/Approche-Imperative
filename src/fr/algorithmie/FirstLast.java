package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {

        int[] array = {3, 6, 3, 4, 5, 3};

        boolean control = array.length >= 1 && (array[array.length - 1] == array[0]);
        System.out.println("Les conditions sont-elles vérifiées?: " + control);
    }

}
