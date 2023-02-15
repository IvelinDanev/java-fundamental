package TextProcesing.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToRemove = scanner.nextLine();
        String stringToRemoveFrom = scanner.nextLine();
        //ice
        //kicegiciceeb
        while(stringToRemoveFrom.contains(stringToRemove)) {
            String newString;
            newString = stringToRemoveFrom.replaceAll(stringToRemove, "");
            stringToRemoveFrom = newString;
        }
        System.out.println(stringToRemoveFrom);
    }
}
