package dataTypsVariable.exer;

import java.util.Scanner;

public class PrintPartASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charUP = Integer.parseInt(scanner.nextLine());
        int charDown = Integer.parseInt(scanner.nextLine());
        for (int i = charUP; i <= charDown; i++) {
            System.out.print((char)i+" ");
        }
    }
}
