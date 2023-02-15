package basicSyntax;

import java.util.Scanner;

public class Towninfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double population = Double.parseDouble(scanner.nextLine());
        short sqArea = Short.parseShort(scanner.nextLine());
        System.out.printf("Town %s has population of %.0f and area %d square km.",city,population,sqArea);
    }
}
