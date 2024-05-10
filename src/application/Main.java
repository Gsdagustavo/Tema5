package application;

import entities.Worker;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Scanner
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Worker> workerArrayList = new ArrayList<>();

    public static void main(String[] args) {

        boolean exit = false;

        // Main Loop
        while (!exit) {

            showMenu();
            int userChoice = getIntInput();

            // Switch case using the user input
            switch (userChoice) {
                case 1:
                    registerWorker();
                    break;
                case 2:
                    showWorkers();
                    break;
                case 3:
                    deleteWorker();
                     break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.err.println("Invalid input.");
            }
        }
    }

    // Register a new worker
    public static void registerWorker() {

    }

    // Show all current workers
    public static void showWorkers() {
        int index = 0;

        // Foreach loop for iterating through all instances of worker in the workerArrayList
        for (Worker worker : workerArrayList) {
            System.out.println((index + 1) + "#:\n" + worker.toString());
        }
    }

    // Delete a worker by CPF
    public static void deleteWorker() {

    }

    // Show choice menu
    public static void showMenu() {
        System.out.print("[1] Register a worker\n[2] Show workers data\n[3] Delete a worker by CPF\n[4] Exit\n--> ");
    }

    // Get Char input
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
