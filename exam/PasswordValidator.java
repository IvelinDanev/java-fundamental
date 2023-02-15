package FinalExam;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpTxt = scanner.nextLine();
        String commands = scanner.nextLine();
        //String password = "";
        while (!commands.contains("Complete")) {
            String cmmnd = commands.split(" ")[0]; // command
            String parOne = ""; // subcommand or param 1
            String parTwo = ""; // param 2
            switch (cmmnd) {
                case "Make":
                    parOne = commands.split(" ")[1]; // subcommand or param 1
                    parTwo = commands.split(" ")[2]; // param 2
                    int indxToRepl = Integer.parseInt(parTwo);
                    char charToRepl = inpTxt.charAt(indxToRepl);
                    if (parOne.equals("Upper")) {
                        char replChar = Character.toUpperCase(charToRepl);
                        inpTxt = inpTxt.replace(charToRepl, replChar);
                        System.out.println(inpTxt);
                        //password = inpTxt;
                    } else if (parOne.equals("Lower")) {
                        char replChar = Character.toLowerCase(charToRepl);
                        inpTxt = inpTxt.replace(charToRepl, replChar);
                        System.out.println(inpTxt);
                        //password = inpTxt;
                    }
                    break;
                case "Insert":
                    parOne = commands.split(" ")[1]; // subcommand or param 1
                    parTwo = commands.split(" ")[2]; // param 2
                    char charToPlace = parTwo.charAt(0);
                    int indxToPut = Integer.parseInt(parOne);
                    if (indxToPut >= 0 && indxToPut < inpTxt.length()) {
                        String firstSubst = inpTxt.substring(0, indxToPut);
                        String lastSubst = inpTxt.substring(indxToPut, inpTxt.length());
                        inpTxt = firstSubst + charToPlace + lastSubst;
                        System.out.println(inpTxt);
                        //password = inpTxt;
                    }
                    break;
                case "Replace":
                    parOne = commands.split(" ")[1]; // subcommand or param 1
                    parTwo = commands.split(" ")[2]; // param 2
                    char givenChar = parOne.charAt(0);
                    char newChar = (char) ((int) givenChar + Integer.parseInt(parTwo));
                    if (inpTxt.contains(givenChar + "")) {
                        String replace = givenChar + "";
                        String replacement = newChar + "";
                        inpTxt = inpTxt.replace(replace, replacement);
                        System.out.println(inpTxt);
                        //password = inpTxt;
                    }
                    break;

                case "Validation":
                    boolean isLowerCase = false;
                    boolean isUpperCase = false;
                    boolean isDigit = false;
                    boolean isLetter = false;
                    boolean isWhitespace = false;
                    boolean isOther = false;
                    if (inpTxt.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    for (int i = 0; i < inpTxt.length(); i++) {
                        char checkChar = inpTxt.charAt(i);
                        //System.out.println("Password must consist only of letters, digits and _!");
                        if (Character.isDigit(checkChar)) {
                            isDigit = true;
                        } else if (Character.isLetter(checkChar)) {
                            isLetter = true;
                            if(Character.isUpperCase(checkChar)){
                                isUpperCase = true;
                            }else{
                                isLowerCase = true;
                            }
                        } else if (Character.isWhitespace(checkChar)) {
                            isWhitespace = true;
                        } else {
                            isOther = true;
                        }
                    }
                    if (isOther) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }
                    if(isUpperCase && !isLowerCase){
                        System.out.println("Password must consist at least one lowercase letter!");
                    }else if(!isUpperCase && isLowerCase){
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if (!isDigit) {
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;
            }
            //inpTxt = password;
            commands = scanner.nextLine();
        }
    }
}






