package RegularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTxt = scanner.nextLine();
        List<String> phoneList = new ArrayList<>();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputTxt);
        while(matcher.find()){
            phoneList.add(matcher.group());
        }
        System.out.println(String.join(", ",phoneList));
    }
}
