package Exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckCards_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cardsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(", ");
            if (command[0].equals("Add")) {
                if (cardsList.contains(command[1])) {
                    System.out.println("Card is already in the deck");
                } else {
                    cardsList.add(command[1]);
                    System.out.println("Card successfully added");
                }
            }
            if (command[0].equals("Remove")) {
                if (cardsList.contains(command[1])) {
                    cardsList.remove(command[1]);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }
            }
            if (command[0].equals("Remove At")) {
                int indextoRemove = Integer.parseInt(command[1]);
                if (indextoRemove > 0 && indextoRemove < n) {
                    cardsList.remove(indextoRemove);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Index out of range");
                }
            }
            if (command[0].equals("Insert")) {
                int indextoAdd = Integer.parseInt(command[1]);
                if ((indextoAdd > 0 && indextoAdd < n) &&
                !cardsList.contains(command[2])) {
                    cardsList.add(indextoAdd,command[2]);
                    System.out.println("Card successfully added");
                } else if ((indextoAdd > 0 && indextoAdd < n) &&
                        cardsList.contains(command[2])){
                    System.out.println("Card is already in the deck");
                }else if (indextoAdd < 0 || indextoAdd >= n){
                    System.out.println("Index out of range");
                }
            }
        }
        System.out.println(cardsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
