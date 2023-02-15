package TextProcesing.Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder concRepString = new StringBuilder();
        String[] input = scanner.nextLine().split(" ");
        for (String word: input) {
            for (int i = 0; i < word.length(); i++) {
                concRepString.append(word);
            }
        }
        System.out.println(concRepString);

    }
}

