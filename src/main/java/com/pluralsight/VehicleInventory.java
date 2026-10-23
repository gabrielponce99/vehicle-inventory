package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        Scanner scanner = new Scanner(System.in);

        int command = 0;
        while (command != 6) {
            System.out.println("What do you want to do?\n");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit\n");
            System.out.println("Enter your command:");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles(vehicles);
                    break;
                case 2:
                    searchMake(vehicles, scanner);
                    break;
            }
        }

    }

    public static void listAllVehicles (Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchMake (Vehicle[] vehicles, Scanner scanner) {
        System.out.println("Enter a make/model: ");
        String model = scanner.nextLine();

        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getMakeModel().equalsIgnoreCase(model)) {
                System.out.println(vehicle);
            }
        }
    }


}




