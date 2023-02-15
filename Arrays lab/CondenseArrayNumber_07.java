package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[inputArray.length - 1];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray.length == 1){
                break;
            }
            if (i == inputArray.length - 1) {
                int[] newcondensed = new int[condensed.length - 1];
                i = - 1;
                inputArray = condensed;
                condensed = newcondensed;
            }else{
                condensed[i] = inputArray[i] + inputArray[i + 1];
            }
        }
        System.out.println(inputArray[0]);
    }
}
