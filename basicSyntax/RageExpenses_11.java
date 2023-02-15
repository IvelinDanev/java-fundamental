package basicSyntax;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrc = Double.parseDouble(scanner.nextLine());
        double mousePrc = Double.parseDouble(scanner.nextLine());
        double keyboardPrc = Double.parseDouble(scanner.nextLine());
        double displayPrc = Double.parseDouble(scanner.nextLine());
        int headsetsLost = lostGames / 2;
        int mousesLost = lostGames / 3;
        int keyboardsLost = lostGames / 6;
        int displaysLost = lostGames / 12;
        double rageExpenses = headsetPrc * headsetsLost + mousePrc * mousesLost + keyboardPrc * keyboardsLost + displayPrc * displaysLost;
        System.out.printf("Rage expenses: %.2f lv.",rageExpenses);
    }
}
