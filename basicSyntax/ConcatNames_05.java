package basicSyntax;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        String inputThree = scanner.nextLine();
        System.out.println(inputOne+inputThree+inputTwo);
    }
}
