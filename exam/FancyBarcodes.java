package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx ="@#+[A-Z](?<brcdNm>[A-Za-z0-9]{4,})[A-Z]@#+";
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(rgx);
        for (int i = 0; i < n ; i++) {
            StringBuilder barCdStr = new StringBuilder();
            String barCod = scanner.nextLine();
            Matcher matcher = pattern.matcher(barCod);
            if(matcher.find()){
                String toCheck = matcher.group("brcdNm");
                for (int j = 0; j < toCheck.length(); j++) {
                    char crrChr = toCheck.charAt(j);
                    if(Character.isDigit(crrChr)){
                        barCdStr.append(crrChr);
                    }
                }
                if(barCdStr.length() == 0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s%n", barCdStr);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
