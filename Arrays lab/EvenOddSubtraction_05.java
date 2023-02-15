package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input.length; i++) {
            if(input[i]%2==0){
                evenSum += input[i];
            }else{
                oddSum += input[i];
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
