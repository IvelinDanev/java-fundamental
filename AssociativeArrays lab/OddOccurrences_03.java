package AssociativeArrays.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStr = scanner.nextLine().split(" ");
        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        for (String item:inputStr) {
            String inpStrLowerCase = item.toLowerCase();
            if(counts.containsKey(inpStrLowerCase)){
                counts.put(inpStrLowerCase,counts.get(inpStrLowerCase)+1);
            }else{
                counts.put(inpStrLowerCase,1);
            }
        }
        ArrayList<String> oddEncounters = new ArrayList<>();
        for (var entry:counts.entrySet()) {
            if(entry.getValue()%2==1){
                oddEncounters.add(entry.getKey());
            }
        }
        System.out.println(oddEncounters.toString().replaceAll("[\\[\\]]",""));
    }
}
