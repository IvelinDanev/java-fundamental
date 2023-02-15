package TextProcesing.Exercises;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        for (String item:input) {
            if(item.length() >= 3 && item.length() <= 16){
                boolean isValidChar = false;
                for (int i = 0; i < item.length(); i++) {
                    char currChar = item.charAt(i);
                    if(!Character.isLetter(currChar) && !Character.isDigit(currChar) &&
                            currChar != '-' && currChar != '_'){
                        isValidChar = true;
                        break;
                    }
                }
                if(!isValidChar){
                    System.out.println(item);
                }
            }
        }
    }
}
