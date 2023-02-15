package RegularExpressions.Exerc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        String inpTxt = scanner.nextLine();
        String rgx = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<prod>\\w+)>" +
                "[^|$%.]*\\|(?<qntt>\\d+)\\|[^|$%.]*?(?<prc>[0-9]+\\.?[0-9]*)\\$";
        Pattern ptrn = Pattern.compile(rgx);
        while(!inpTxt.equals("end of shift")){
            Matcher mtchr = ptrn.matcher(inpTxt);
            if(mtchr.find()){
                String name = mtchr.group("name");
                String prod = mtchr.group("prod");
                int qntt = Integer.parseInt(mtchr.group("qntt"));
                double totalPrc = qntt*Double.parseDouble(mtchr.group("prc"));
                totalSum += totalPrc;
                System.out.printf("%s: %s - %.2f%n",name,prod,totalPrc);
            }
            inpTxt = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalSum);
    }
}
