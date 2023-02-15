package dataTypsVariable.exer;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thurdNumber = Integer.parseInt(scanner.nextLine());
        int fourNumber = Integer.parseInt(scanner.nextLine());
        int result = ((firstNumber + secondNumber) / thurdNumber) * fourNumber;
        System.out.println(result);
    }
}
