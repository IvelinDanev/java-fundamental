package Method.Exerceses;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPass = scanner.nextLine();
        boolean firstresult = false;
        boolean secondresult = false;
        boolean thurdresult = false;
        boolean flag1 = false;
        boolean flag2 = false;
        int count = 0;
        if (checkCharsNmbrs(inputPass, firstresult) && checkiflettersanddigitsONLY(flag1, flag2, inputPass, secondresult)
                && checkiftwoDigits(count, inputPass, thurdresult)) {
            System.out.println("Password is valid");
        }
        if (!checkCharsNmbrs(inputPass, firstresult)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkiflettersanddigitsONLY(flag1, flag2, inputPass, secondresult)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkiftwoDigits(count, inputPass, thurdresult)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean checkCharsNmbrs(String inputPass, boolean firstresult) {
        if (inputPass.length() >= 6 && inputPass.length() <= 10) {
            firstresult = true;
        }
        return firstresult;
    }

    public static boolean checkiflettersanddigitsONLY(boolean flag1, boolean flag2, String inputPass, boolean secondresult) {
        for (int i = 0; i < inputPass.length(); i++) {
            inputPass = inputPass.toUpperCase();
            if (inputPass.charAt(i) >= 48 && inputPass.charAt(i) <= 57) {
                secondresult = true;
            } else if (inputPass.charAt(i) >= 65 && inputPass.charAt(i) <= 90) {
                secondresult = true;
            }else{
                secondresult = false;
                break;
            }
        }
        return secondresult;
    }

    public static boolean checkiftwoDigits(int count, String inputPass, boolean thurdresult) {
        for (int i = 0; i < inputPass.length(); i++) {
            if (inputPass.charAt(i) >= 48 && inputPass.charAt(i) <= 57) {
                count++;
            }
            if (count >= 2) {
                thurdresult = true;
            }
        }
        return thurdresult;
    }
}