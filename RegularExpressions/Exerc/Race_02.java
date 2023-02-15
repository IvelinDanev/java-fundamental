package RegularExpressions.Exerc;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inpLst = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        Map<String,Integer> racerAchievMap= new LinkedHashMap<>();
        inpLst.forEach(name -> racerAchievMap.put(name,0));
        String inptTxt = sc.nextLine();
        String rgxNm = "(?<name>[A-Za-z])";
        Pattern ptrnNm = Pattern.compile(rgxNm);
        String rgxDstn = "(?<dist>[0-9])";
        Pattern ptrnDstn = Pattern.compile(rgxDstn);
        while(!inptTxt.equals("end of race")){
            String crrNm = "";
            int crrDst = 0;
            Matcher mtchNm = ptrnNm.matcher(inptTxt);
            Matcher mtchDstn = ptrnDstn.matcher(inptTxt);
            while(mtchNm.find()){
                crrNm += mtchNm.group("name");
            }
            if(inpLst.contains(crrNm)){
                while(mtchDstn.find()){
                    crrDst += Integer.parseInt(mtchDstn.group("dist"));
                }
                racerAchievMap.put(crrNm,racerAchievMap.get(crrNm) + crrDst);
            }
            inptTxt = sc.nextLine();
        }
        List<String> topRacers = racerAchievMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
        //racerAchievMap.entrySet().forEach(item -> System.out.println(item.getKey() + item.getValue()));
        System.out.println("1st place: " + topRacers.get(0));
        System.out.println("2nd place: " + topRacers.get(1));
        System.out.println("3rd place: " + topRacers.get(2));
    }
}
