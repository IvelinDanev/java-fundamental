package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String impTxt = scanner.nextLine();
        String rgx = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<bestBefore>" +
                "[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calrs>[0-9]+)\\1";
        Pattern pttrn = Pattern.compile(rgx);
        Matcher mtchr = pttrn.matcher(impTxt);
        int clrsSum = 0; // calories sum
        StringBuilder outptStrng = new StringBuilder();
        while(mtchr.find()){
            String food = mtchr.group("food");
            String bestBfr = mtchr.group("bestBefore");
            int clrs = Integer.parseInt(mtchr.group("calrs"));
            clrsSum += clrs;
            outptStrng.append(String.format("Item: %s, Best before: %s, " +
                    "Nutrition: %d%n", food, bestBfr, clrs ));
        }
        int days = clrsSum/2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(outptStrng);
    }
}
