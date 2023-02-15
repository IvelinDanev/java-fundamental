package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> frstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> scndDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        while (frstDeck.size() > 0 && scndDeck.size() > 0) {
            int i = 0;
            int crrnCardFirstDeck = frstDeck.get(i);
            int crrnCardScndDeck = scndDeck.get(i);
            frstDeck.remove(i);
            scndDeck.remove(i);
            if (crrnCardFirstDeck > crrnCardScndDeck) {
                frstDeck.add(crrnCardFirstDeck);
                frstDeck.add(crrnCardScndDeck);
            } else if (crrnCardScndDeck > crrnCardFirstDeck) {
                scndDeck.add(crrnCardScndDeck);
                scndDeck.add(crrnCardFirstDeck);
                i++;
            }
        }
        if (scndDeck.size() == 0) {
            System.out.println("First player wins! Sum: " + getCardsSum(frstDeck));
        } else{
            System.out.println("Second player wins! Sum: " + getCardsSum(scndDeck));
        }
    }
    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}