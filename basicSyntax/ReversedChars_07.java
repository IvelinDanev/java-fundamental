package basicSyntax;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = ' ';
        String concatWord = "";
        for (int i = 0; i < 3; i++) {
            String word = scanner.nextLine();
            symbol = word.charAt(0);
            concatWord += symbol;
        }
        System.out.print(concatWord.charAt(2)+" "+concatWord.charAt(1)+" "+concatWord.charAt(0));
    }
}
