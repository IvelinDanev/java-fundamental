package RegularExpressions.Exerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furnLst = new ArrayList<>();
        double totalPrc = 0;
        String rgx = ">>(?<furn>[A-Za-z]+)<<(?<prc>\\d+.?\\d*)!(?<qty>\\d+)";
        Pattern pttrn = Pattern.compile(rgx);
        String input = scanner.nextLine();
        while(!input.equals("Purchase")){
            Matcher mtch = pttrn.matcher(input);
            if(mtch.find()){
                String frnNm = mtch.group("furn");
                double prc = Double.parseDouble(mtch.group("prc"));
                int qty = Integer.parseInt(mtch.group("qty"));
                furnLst.add(frnNm);
                double crrnFntrPrc = qty*prc;
                totalPrc += crrnFntrPrc;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnLst.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrc);
    }
}
