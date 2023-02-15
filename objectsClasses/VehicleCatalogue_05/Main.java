package objectsClasses.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        double hpCarSum = 0;
        int countCars = 0;
        double hpTruckSum = 0;
        int countTrucks = 0;
        while(!command.contains("End")) {
            String[] inputedVehicles = command.split("\\s+");
            String typeOfVehicle = inputedVehicles[0];
            if(typeOfVehicle.equals("car")){
                typeOfVehicle = "Car";
            }else{
                typeOfVehicle = "Truck";
            }
            String modelOfVehicle = inputedVehicles[1];
            String colorOfVehicle = inputedVehicles[2];
            int horsepowerOfVehicle = Integer.parseInt(inputedVehicles[3]);
            Vehicle vehicle = new Vehicle(typeOfVehicle,modelOfVehicle,colorOfVehicle,horsepowerOfVehicle);
            vehicleList.add(vehicle);
            if(vehicle.getTypeOfVehicle().equals("Car")){
                hpCarSum += vehicle.getHorsepowerOfVehicle();
                countCars++;
            }else if (vehicle.getTypeOfVehicle().equals("Truck")){
                hpTruckSum += vehicle.getHorsepowerOfVehicle();
                countTrucks++;
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while(!command.contains("Close the Catalogue")){
            for (Vehicle vehicle : vehicleList) {
                if(vehicle.getModelOfVehicle().equals(command)) {
                    System.out.println("Type: " + vehicle.getTypeOfVehicle());
                    System.out.println("Model: " + vehicle.getModelOfVehicle());
                    System.out.println("Color: " + vehicle.getColorOfVehicle());
                    System.out.println("Horsepower: " + vehicle.getHorsepowerOfVehicle());
                }
            }
            command = scanner.nextLine();
        }
        double averHpCars = hpCarSum/countCars;
        if(countCars == 0){
            averHpCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",averHpCars);
        double averHpTrucks = hpTruckSum/countTrucks;
        if(countTrucks == 0){
            averHpTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averHpTrucks);
        //Cars have average horsepower of: 413.33.
        //Trucks have average horsepower of: 250.00.
    }
}
