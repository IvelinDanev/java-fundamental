package Method.Exerceses;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        System.out.println(vowelsCount(input));

    }
    public static int vowelsCount(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
                    input.charAt(i) == 'o' || input.charAt(i) == 'i' || input.charAt(i) == 'y'
                    || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

}
