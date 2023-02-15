package dataTypsVariable.exer;

import java.util.Scanner;

public class SumofChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charscope = Integer.parseInt(scanner.nextLine());
        char inputChar = ' ';
        int sumofChars = 0;
        for (int i = 1; i <= charscope; i++) {
            inputChar = scanner.nextLine().charAt(0);
            sumofChars+=(int)inputChar;
        }
        System.out.println("The sum equals: " + sumofChars);
    }
}
