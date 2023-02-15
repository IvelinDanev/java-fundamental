package TextProcesing.Lab;

import java.util.Locale;
import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String textToEdit = scanner.nextLine();
        String newText;
        for (int i = 0; i < input.length; i++) {
            String badword = input[i];
            String asteriks = badword.replaceAll(".", "*");
            while (textToEdit.contains(badword)) {
                newText = textToEdit.replaceAll(badword, asteriks);
                textToEdit = newText;
            }
        }
        System.out.println(textToEdit);
    }
}
