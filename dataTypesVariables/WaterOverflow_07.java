package dataTypsVariable.exer;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputsNumber = Integer.parseInt(scanner.nextLine());
        int currentLitters = 0;
        int newtLitters = 0;
        int counter = 0;
        do {
            counter++;
            newtLitters = Integer.parseInt(scanner.nextLine());
            if (currentLitters + newtLitters <= 255) {
                currentLitters += newtLitters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }while (counter < inputsNumber);
        System.out.println(currentLitters);
    }
}
