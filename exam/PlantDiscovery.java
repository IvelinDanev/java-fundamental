package FinalExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class PlantDiscovery<fori> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsMap = new LinkedHashMap<>(); // map for type and rarity
        String plantNm = "";
        int plantRrty = 0;
        int plantRtng = 0;
        for (int i = 0; i < n; i++) {
            String inpTxt = scanner.nextLine();
            plantNm = inpTxt.split("<->")[0];
            plantRrty = Integer.parseInt(inpTxt.split("<->")[1]);
            plantsMap.put(plantNm, plantRrty);
        }
        Map<String, List<Integer>> plantsMpList = new LinkedHashMap<>(); // map for type and rating
        String inpTxt = scanner.nextLine();
        double averRtng = 0;
        while (!inpTxt.equals("Exhibition")) {
            String command = inpTxt.split(": ")[0];
            String cmmndArg = inpTxt.split(": ")[1];
            plantNm = cmmndArg.split(" - ")[0];
            plantRrty = Integer.parseInt(cmmndArg.split(" - ")[1]);
            plantRtng = Integer.parseInt(cmmndArg.split(" - ")[1]);
            switch (command) {
                case "Rate":
                    plantsMpList.putIfAbsent(plantNm,new ArrayList<>());
                    plantsMpList.get(plantNm).add(plantRtng);
                    break;
                case "Update":
                    plantsMap.put(plantNm,plantRrty);
                    break;
                case "Reset":
                    plantsMpList.get(plantNm).clear();
                break;
            }
            inpTxt = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

    }
}
