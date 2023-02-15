package FinalExamPrep;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpTxt = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            if (command.equals("TakeOdd")) {
                inpTxt = getOddChars(inpTxt);
                System.out.println(inpTxt);
            } else if (command.contains("Cut")) {
                int indx = Integer.parseInt(command.split("\\s+")[1]);
                int lngth = Integer.parseInt(command.split("\\s+")[2]);
                String cutString = inpTxt.substring(indx, indx + lngth);
                inpTxt = inpTxt.replaceFirst(cutString, "");
                System.out.println(inpTxt);
            } else if (command.contains("Substitute")) {
                String sbstrng = command.split("\\s+")[1];
                String sbstit = command.split("\\s+")[2];
                if (inpTxt.contains(sbstrng)) {
                    inpTxt = inpTxt.replaceAll(sbstrng, sbstit);
                    System.out.println(inpTxt);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + inpTxt);
    }

    private static String getOddChars(String inpTxt) {
        StringBuilder newPassw = new StringBuilder();
        for (int i = 1; i <= inpTxt.length() - 1; i += 2) {
            char currPas = inpTxt.charAt(i);
            newPassw.append(currPas);
        }
        return newPassw.toString();
    }
}

