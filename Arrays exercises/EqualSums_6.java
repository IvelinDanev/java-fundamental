package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //1 2 3 3
        int rightSum = 0;
        int leftSum = 0;
        boolean isequalSum = true;
        if(numbers.length != 1){
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    rightSum += numbers[j];
                }
                for (int k = 0; k < i; k++) {
                    leftSum += numbers[k];
                }
                if (leftSum == rightSum) {
                    System.out.print(i + " ");
                    isequalSum = false;
                }
                rightSum = 0;
                leftSum = 0;
            }
            if(isequalSum){
                System.out.print("no");
            }
        }else{
            System.out.print(0);
        }
    }
}
