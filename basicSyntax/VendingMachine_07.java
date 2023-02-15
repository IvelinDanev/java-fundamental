package basicSyntax;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startWord = "";
        double coinsInsert;
        double sum = 0;
        startWord = scanner.nextLine();
        while (!startWord.equals("Start")) {
            coinsInsert = Double.parseDouble(startWord);
            if (coinsInsert == 0.1) {
                sum += coinsInsert;
            } else if (coinsInsert == 0.2) {
                sum += coinsInsert;
            } else if (coinsInsert == 0.5) {
                sum += coinsInsert;
            } else if (coinsInsert == 1) {
                sum += coinsInsert;
            } else if (coinsInsert == 2) {
                sum += coinsInsert;
            } else {
                System.out.printf("Cannot accept %.2f %n", coinsInsert);
            }
            startWord = scanner.nextLine();
        }
        startWord = scanner.nextLine();
        while (!startWord.equals("End")) {
            switch (startWord) {
                case "Nuts":
                    if ( sum >= 2) {
                        sum -= 2;
                        System.out.println("Purchased "+startWord);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if ( sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased "+startWord);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if ( sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased "+startWord);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if ( sum >= 0.8) {
                        sum -= 0.8;
                        System.out.println("Purchased "+startWord);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if ( sum >= 1) {
                        sum -= 1;
                        System.out.println("Purchased "+startWord);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default :
                    System.out.println("Invalid product");
                    break;
            }
            startWord = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
