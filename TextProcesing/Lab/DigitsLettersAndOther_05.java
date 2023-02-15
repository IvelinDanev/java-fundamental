package TextProcesing.Lab;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder resultDig = new StringBuilder();
        StringBuilder resultLett = new StringBuilder();
        StringBuilder resultSymb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char checkIT = input.charAt(i);
            if (Character.isDigit(checkIT)) {
                resultDig.append(checkIT);
            } else if (Character.isLetter(checkIT)) {
                resultLett.append(checkIT);
            } else {;
                resultSymb.append(checkIT);
            }
        }
        System.out.println(resultDig);
        System.out.println(resultLett);
        System.out.println(resultSymb);
    }
}
