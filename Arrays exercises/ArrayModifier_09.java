package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] modifyArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int firstNumber = modifyArray[firstIndex];
                int secondNumber = modifyArray[secondIndex];
                modifyArray[firstIndex] = secondNumber;
                modifyArray[secondIndex] = firstNumber;
            } else if (command.contains("multiply")) {
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int firstNumber = modifyArray[firstIndex];
                int secondNumber = modifyArray[secondIndex];
                int product = firstNumber * secondNumber;
                modifyArray[firstIndex] = product;
            } else if (command.contains("decrease")) {
                for (int i = 0; i < modifyArray.length; i++) {
                    modifyArray[i]--;
                }
            }
            command = scanner.nextLine();
        }
        for (int j = 0; j < modifyArray.length; j++) {
            int currentNumber = modifyArray[j];
            if (j != modifyArray.length - 1) {
                System.out.print(currentNumber + ", ");
            } else {
                System.out.print(currentNumber);
            }
        }
    }
}
