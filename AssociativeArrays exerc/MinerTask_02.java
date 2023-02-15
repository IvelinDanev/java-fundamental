package AssociativeArrays.Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> items = new LinkedHashMap<>();
        String key = scanner.nextLine();
        while (!key.equals("stop")){
            int value = Integer.parseInt(scanner.nextLine());
            if(items.containsKey(key)){
                items.put(key,items.get(key)+value);
            }else{
                items.put(key, value);
            }
            key = scanner.nextLine();
        }
        items.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
