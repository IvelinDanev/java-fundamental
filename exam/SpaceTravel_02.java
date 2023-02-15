package Exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listCmnds = Arrays.stream(scanner.nextLine().split("\\|\\|")).collect(Collectors.toList());
        int startFuel = Integer.parseInt(scanner.nextLine());
        int startAmunit = Integer.parseInt(scanner.nextLine());
        boolean isFailed = false;
        for (int i = 0; i < listCmnds.size(); i++) {
            String[] arrayCmmnds = listCmnds.get(i).split(" ");
            switch (arrayCmmnds[0]) {
                case "Travel":
                    int distance = Integer.parseInt(arrayCmmnds[1]);
                    int fuelConsmd = distance;
                    if(!isFailed) {
                        if ((startFuel - distance) >= 0) {
                            System.out.printf("The spaceship travelled %d light-years.\n", distance);
                            startFuel = startFuel - fuelConsmd;
                        } else {
                            System.out.println("Mission failed.");
                            isFailed = true;
                        }
                    }
                    break;
                case "Enemy":
                    int armour = Integer.parseInt(arrayCmmnds[1]);
                    if (startAmunit >= armour && !isFailed) {
                        System.out.printf("An enemy with %d armour is defeated.\n", armour);
                        startAmunit = startAmunit - armour;
                    } else {
                        int runFuel = armour * 2;
                        if (startFuel >= runFuel) {
                            System.out.printf("An enemy with %d armour is outmaneuvered.\n", armour);
                            startFuel = startFuel - runFuel;
                        } else {
                            System.out.println("Mission failed.");
                            isFailed = true;
                        }
                    }
                    break;
                case "Repair":
                    if (!isFailed) {
                        int fuelAdded = Integer.parseInt(arrayCmmnds[1]);
                        int amunAdded = Integer.parseInt(arrayCmmnds[1]);
                        startFuel = startFuel + fuelAdded;
                        startAmunit = startAmunit + 2 * amunAdded;
                        System.out.printf("Ammunitions added: %d.\n", 2 * amunAdded);
                        System.out.printf("Fuel added: %d.\n", fuelAdded);
                    }
                    break;
                case "Titan":
                    if (isFailed) {
                        break;
                    } else {
                        System.out.println("You have reached Titan, all passengers are safe.");
                    }
                    break;
            }
        }
    }
}
