package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Scanner
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



    }

    // Get Char Input
    public static char getCharInput() {
        char input = ' ';

        try {
            return sc.nextLine().charAt(0);
        } catch (Exception e) {
            System.err.println("An error has occurred.");
            return input;
        }
    }

    // Get Int input
    public static int getIntInput() {
        int input;

        try {
            return Integer.parseInt(sc.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            return -1;
        }
    }

    // Get Float input
    public static float getFloatInput() {
        float input = 0F;

        try {
            return Float.parseFloat(sc.nextLine());
        } catch (InputMismatchException | NumberFormatException e) {
            return -1;
        }
    }
}
