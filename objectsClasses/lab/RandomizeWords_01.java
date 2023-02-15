package objectsClasses.lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Welcome to SoftUni and have fun learning programming*/
public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int i = 0; i < inputArr.length; i++) {
            int j = rnd.nextInt(inputArr.length);
            String swapWord = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = swapWord;
        }
        System.out.println(String.join(System.lineSeparator(),inputArr));
    }
}
