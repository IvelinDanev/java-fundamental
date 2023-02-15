package Method.Exerceses;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result="";
        System.out.println(middleSymbols(result,input));
    }
    public static String middleSymbols(String result,String input){
        int halfinput = input.length()/2;
        if (input.length()%2 == 0){
            result = input.charAt(halfinput-1)+""+input.charAt(halfinput);
        }else{
            result = String.valueOf(input.charAt(halfinput));
        }
        return result;
    }
}
