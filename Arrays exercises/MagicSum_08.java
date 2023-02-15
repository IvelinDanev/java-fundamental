package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] givenNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        //1 7 6 2 19 23
        //8
        for (int i = 0; i < givenNumbers.length; i++) {
            for (int j = i+1; j < givenNumbers.length ; j++) {
                sum = givenNumbers[i] + givenNumbers[j];
                if( sum == n){
                    System.out.println(givenNumbers[i]+" "+givenNumbers[j]);
                }
            }
        }
    }
}
