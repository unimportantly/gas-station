package Vehicules;

import java.util.Scanner;

public class InputInt {

    public static int inputInt(String message) {
        // imprime le message specifique a chaque fonction
        System.out.println(message);
        // Un scanner permet de detecter l'input de l'utilisateur
        Scanner scan = new Scanner(System.in);
        // On recupere son input
        return scan.nextInt();
    }
    public static double inputDouble(String message) {
        // imprime le message specifique a chaque fonction
        System.out.println(message);
        // Un scanner permet de detecter l'input de l'utilisateur
        Scanner scan = new Scanner(System.in);
        // On recupere son input
        return scan.nextDouble();
    }
}
