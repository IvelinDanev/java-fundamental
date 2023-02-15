package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        for (int i = 0; i < inputString.length/2 ; i++) {
            String changedString = inputString[i];
            inputString[i] = inputString[inputString.length-1-i];
            inputString[inputString.length-1-i] = changedString;
        }
        System.out.println(String.join(" ",inputString));
    }
}
