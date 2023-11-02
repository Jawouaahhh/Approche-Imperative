package fr.algorithmie;

public class FirstLast6 {

    public static void main(String[] args) {

        int[] array = {6, 2, 3, 4, 5, 6};

        boolean control = array.length >= 1 && (array[array.length - 1] == 6 || array[0] == 6);
        System.out.println("Les conditions sont-elles vérifiées?: " + control);
    }

}
