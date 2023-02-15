package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <= numbers.length - 1; i++) { //1 4 3 2
            if (i == numbers.length - 1) { // ако елемента е последен се отпечатва
                System.out.print(numbers[i] + " ");
                break;
            }
            boolean isBigger = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

