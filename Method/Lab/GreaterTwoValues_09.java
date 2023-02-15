package Method.Lab;

import java.util.Scanner;

public class GreaterTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpuType = scanner.nextLine();
        switch (inpuType){
            case "int":
                int firstNbr = Integer.parseInt(scanner.next());
                int secondNmbr = Integer.parseInt(scanner.next());
                System.out.println(getMax(firstNbr,secondNmbr));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol,secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText,secondText));
                break;
        }
    }
    public static int getMax(int firstNbr, int secondNmbr){
        if(firstNbr > secondNmbr){
            return firstNbr;
        }else{
            return secondNmbr;
        }
    }
    public static char getMax(char firstSymbol, char secondSymbol){
        if(firstSymbol > secondSymbol){
            return firstSymbol;
        }else{
            return secondSymbol;
        }
    }
    public static String getMax(String firstText, String secondText){
        if(firstText.compareTo(secondText) > 0){
            return firstText;
        }else{
            return secondText;
        }
    }
}
