package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpTxt = scanner.nextLine().replaceAll(" ","");
        Map<Character,Integer> charintSet = new LinkedHashMap<>();
        for (char set:inpTxt.toCharArray()) {
            if(!charintSet.containsKey(set)){
                charintSet.put(set,1);
            }else{
                charintSet.put(set, charintSet.get(set)+1);
            }
        }
        charintSet.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
