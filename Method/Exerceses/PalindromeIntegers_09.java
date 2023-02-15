package Method.Exerceses;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        while(!inputString.equals("END")){
            String[] inputStringArray = inputString.split("");
            String[] turnStringArray = new String[inputString.length()];
            for (int i = 0; i < inputStringArray.length; i++) {
                    turnStringArray[inputStringArray.length-i-1] = inputStringArray[i];
            }
            int inputStringtoInt = Integer.parseInt(inputString);
            String turnString = String.join("",turnStringArray);
            int turnStringtoInt = Integer.parseInt(turnString);
            if(inputStringtoInt == turnStringtoInt){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            inputString = scanner.nextLine();
        }
    }
}
