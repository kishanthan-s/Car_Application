package org.example;

import ch.qos.logback.core.util.SystemInfo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int operation;
        do {
            display();
            Scanner myObj = new Scanner(System.in);
            operation = myObj.nextInt();
            process(operation);

        } while (operation != 0);
    }

    private static void display() {
        System.out.println("1. Register Car Details");
        System.out.println("2. Delete  Car");
        System.out.println("3. Insert Round Details");
        System.out.println("4. Find Out Winners");
        System.out.println("5. Search a Car");
        System.out.print("Select one: ");
    }

    private static void process(int operation) {
        switch (operation) {
            case 1:
                System.out.println("Welcome to Register Car Details");
                registercar();
                break;
            case 2:
                System.out.println("Welcome to Delete a Car");
                deletecar();
                break;
            case 3:
                System.out.println("Welcome to Insert Round Details");
                insertrounddetails();
                break;
            case 4:
                System.out.println("Welcome to Find Out Winners");
                FindWinner();
                break;
            case 5:
                System.out.println("Welcome to Search a Car");
                SearchCar();
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }

    public static void registercar() {
        System.out.println("Enter Car Details");
        Car car = new Car();
        Scanner register = new Scanner(System.in);

        System.out.print("Enter the Car Number: ");
        car.setUnique_number(register.nextInt());

        // Consume the newline character left in the buffer
        register.nextLine();

        System.out.print("Enter the Car Brand: ");
        car.setBrand(register.nextLine());

        System.out.print("Enter the Car Sponsor: ");
        car.setSponsor(register.nextLine());

        System.out.println("Driver Details");

        System.out.print("Enter Driver Name: ");
        String driverName = register.nextLine();

        System.out.print("Enter Driver NIC: ");
        String driverNIC = register.nextLine();

        System.out.print("Enter Driver Age: ");
        int driverAge = register.nextInt();

        // Create a new Driver object with provided details
        Driver driver = new Driver(driverName, driverNIC, driverAge);

        // Set the driver details for the car
        car.setDriver_details(driver);

        saving(car);
        QuickStart quickStart = new QuickStart();
        quickStart.connect(car);

    }


    private static void saving(Car args) {

        try {
            FileWriter fileWriter = new FileWriter("Car_Details.txt", true);
            fileWriter.write(args.toString() + "\n");
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void deletecar() {
        System.out.println("Enter the car number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        QuickStart quickStart = new QuickStart();
        quickStart.deletecar(num);


    }

    private static void insertrounddetails() {

        System.out.println("Enter Round Details");

        InsertRoundDetails insertDetails = new InsertRoundDetails();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the round: ");

        insertDetails.setRound_num(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Enter the car number: ");

        insertDetails.setCar_number(scanner.nextLine());

        System.out.print("Enter the car Model: ");

        insertDetails.setModel(scanner.nextLine());

        System.out.print("Enter the Winning Place: ");

        insertDetails.setWinning_place(scanner.nextLine());


    }

    public static void FindWinner(){
        System.out.println("These are the winners");
    }

    public static void SearchCar(){
        System.out.print("Enter the car number: ");
        Scanner scanner=new Scanner(System.in);
        String carnum= scanner.nextLine();
    }


}