package RegularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String inpTxt = scanner.nextLine();
        List<String> datesList = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(inpTxt);
        while(dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}
