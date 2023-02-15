package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> basicMaterList = new LinkedHashMap<>();
        basicMaterList.put("shards", 0);
        basicMaterList.put("fragments", 0);
        basicMaterList.put("motes", 0);
        Map<String, Integer> junkMaterList = new LinkedHashMap<>();
        boolean isWin = false;
        String input = scanner.nextLine().toLowerCase();
        while (!isWin) {
            String[] inputArr = input.split("\\s+");
            for (int i = 0; i < inputArr.length - 1; i += 2) {
                String material = inputArr[i + 1].toLowerCase();
                int newMatQuant = Integer.parseInt(inputArr[i]); // новоподадено количество на получения материал
                if (material.equals("shards") || material.equals("fragments")
                        || material.equals("motes")) {
                    basicMaterList.put(material, basicMaterList.get(material) + newMatQuant);
                    if (basicMaterList.get(material) >= 250) {
                        String output = "";
                        if(material.equals("shards")){
                            output = "Shadowmourne";
                        }else if(material.equals("fragments")){
                            output = "Valanyr";
                        }else{
                            output = "Dragonwrath";
                        }
                        System.out.println(output + " obtained!");
                        isWin = true;
                        basicMaterList.put(material, basicMaterList.get(material) - 250);
                        break;
                    }
                } else {
                    if (!junkMaterList.containsKey(material)) {
                        junkMaterList.put(material, newMatQuant);
                    } else {
                        junkMaterList.put(material, junkMaterList.get(material) + newMatQuant);
                    }
                }
            }
            if(isWin){
                break;
            }else {
                input = scanner.nextLine().toLowerCase();
            }
        }
        basicMaterList.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMaterList.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
