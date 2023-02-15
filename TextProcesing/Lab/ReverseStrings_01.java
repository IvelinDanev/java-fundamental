package TextProcesing.Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        helLo = oLleh
        Softuni = inutfoS
        bottle = elttob
         */
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String tupni = ""; // reversed input
            for (int i = input.length()-1; i >= 0 ; i--) {
                tupni += input.charAt(i);
            }
            System.out.printf("%s = %s%n",input,tupni);
            input = scanner.nextLine();
        }
    }
}
