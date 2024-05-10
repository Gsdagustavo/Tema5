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
        // Name
        System.out.print("Enter the worker's name: ");
        String name = sc.nextLine();

        // CPF
        System.out.print("Enter the worker's CPF: ");
        String cpf = sc.nextLine();

        // Worked Hours
        System.out.print("Enter the worker's worked hours: ");
        int workedHours = getIntInput();

        while (workedHours < 0) {
            System.err.print("Invalid input, try again: ");
            workedHours = getIntInput();
        }

        // Turn
        System.out.print("Enter the worker's turn [M / V / N]: ");
        char turn = getCharInput();

        // Category
        System.out.print("Enter the worker's category [O / G]: ");
        char category = getCharInput();

        while (category != 'O' || category != 'G') {
            System.err.print("Invalid input, try again: ");
            category = getCharInput();
        }

        // income per hour
        System.out.print("Enter the income per hour value: ");
        float incomePerHour = getFloatInput();

        while (incomePerHour < 0) {
            System.err.print("Invalid input, try again: ");
            incomePerHour = getFloatInput();
        }

        workerArrayList.add(new Worker(cpf, name, workedHours, turn, category, incomePerHour));
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
        System.out.print("Enter the worker's CPF to be removed: ");
        String cpf = sc.nextLine();

        for (Worker worker : workerArrayList) {
            if (worker.getCpf().equals(cpf)) {
                workerArrayList.remove(worker);
                return;
            }
        }

        System.err.println("There are no workers with the CPF " + cpf);
    }

    // Show choice menu
    public static void showMenu() {
        System.out.print("[1] Register a worker\n[2] Show workers data\n[3] Delete a worker by CPF\n[4] Exit\n--> ");
    }

    // Get Char input
    public static char getCharInput() {
        return sc.nextLine().toUpperCase().charAt(0);
    }

    // Get Int input
    public static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (InputMismatchException e) {
                System.err.println("Invalid input, try again: ");
            }
        }
    }

    // Get Float input
    public static float getFloatInput() {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Invalid input, try again: ");
            }
        }
    }
}
