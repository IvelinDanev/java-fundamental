package AssociativeArrays.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> wordSyn = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String wordKey = scanner.nextLine();
            String synValue = scanner.nextLine();
            wordSyn.putIfAbsent(wordKey,new ArrayList<>());
            wordSyn.get(wordKey).add(synValue);
        }
        for (Map.Entry<String, ArrayList<String>> entry: wordSyn.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),
        String.join(", ", entry.getValue()));
        }
    }
}
