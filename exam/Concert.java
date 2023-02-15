package FinalRetake;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        Map<String, List<String>> bandMembMap = new LinkedHashMap<>();
        Map<String, Integer> bandTimeMap = new LinkedHashMap<>();
        String inpCom = scanner.nextLine();
        while (!inpCom.contains("Start!")) {
            String[] commands = inpCom.split("; ");
            String command = commands[0];
            String bandName = commands[1];
            String bandMembrs = commands[2];
            String[] bandMembrArr = bandMembrs.split(", ");
            if (command.equals("Add")) {
                if (!bandMembMap.containsKey(bandName)) {
                    List<String> bandMemLst = Arrays.stream(bandMembrArr).collect(Collectors.toList());
                    bandMembMap.put(bandName, bandMemLst);
                } else {
                    List<String> bandMemLst = bandMembMap.get(bandName);
                    for (int i = 0; i < bandMembrArr.length; i++) {
                        if (!bandMemLst.contains(bandMembrArr[i])) {
                            bandMemLst.add(bandMembrArr[i]);
                        }
                    }
                }
            } else if (command.equals("Play")) {
                int bandTime = Integer.parseInt(commands[2]);
                totalTime += bandTime;
                if (!bandTimeMap.containsKey(bandName)) {
                    bandTimeMap.put(bandName, bandTime);
                } else {
                    bandTime += bandTimeMap.get(bandName);
                    bandTimeMap.put(bandName, bandTime);
                }
            }
            inpCom = scanner.nextLine();
        }
        System.out.println("Total time: "+totalTime);
        bandTimeMap.entrySet().forEach(e-> System.out.printf("%s -> %d\n",e.getKey(),e.getValue()));
        bandMembMap.entrySet().forEach(e-> {System.out.println(e.getKey());
            e.getValue().forEach(item->System.out.printf("=> %s\n",item));});
            //for (int i = 0; i < e.getValue().size(); i++) {
                //System.out.printf("=> %s\n",e.getValue().get(i));
            //};});

    }
}
