package FinalExamPrep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpTxt = scanner.nextLine();
        String inpCommn = scanner.nextLine();
        while (!inpCommn.equals("Generate")) {
            String[] cmmnds = inpCommn.split(">>>");
            int strtIndx = 0;
            int endIndx = 0;
            if (inpCommn.contains("Slice")) {
                    strtIndx = Integer.parseInt(cmmnds[1]);
                    endIndx = Integer.parseInt(cmmnds[2]);
                    String strToRemove = inpTxt.substring(strtIndx, endIndx);
                    inpTxt = inpTxt.replaceFirst(strToRemove, "");
                    System.out.println(inpTxt);
            } else if (inpCommn.contains("Flip")) {
                    strtIndx = Integer.parseInt(cmmnds[2]);
                    endIndx = Integer.parseInt(cmmnds[3]);
                if (cmmnds[1].equals("Upper")) {
                    String strToUP = inpTxt.substring(strtIndx, endIndx);
                    inpTxt = inpTxt.replaceFirst(strToUP, strToUP.toUpperCase());
                    System.out.println(inpTxt);
                } else if (cmmnds[1].equals("Lower")) {
                    String strToDown = inpTxt.substring(strtIndx, endIndx);
                    inpTxt = inpTxt.replaceFirst(strToDown, strToDown.toLowerCase());
                    System.out.println(inpTxt);
                }
            } else if (inpCommn.contains("Contains")) {
                String sbsttrg = cmmnds[1];
                if (inpTxt.contains(sbsttrg)) {
                    System.out.printf("%s contains %s%n", inpTxt, sbsttrg);
                } else {
                    System.out.println("Substring not found!");
                }
            }
            inpCommn = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", inpTxt);
    }
}
