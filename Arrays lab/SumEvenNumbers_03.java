package Arrays.lab;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0){
                evenSum += numbers[i];
            }
        }
        System.out.println(evenSum);
    }
}
