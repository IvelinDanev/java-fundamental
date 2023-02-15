package Arrays.exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = new String[2 * n];
        String[] currentInput = new String[2];
        for (int i = 0; i < input.length; i += 2) {
            int j = 0;
            currentInput = scanner.nextLine().split(" ");
            input[i] = currentInput[j];
            input[i + 1] = currentInput[j + 1];
        }
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        int k = 0;
        for (int l = 0; l < input.length; l+=2) {
            if (k % 2 == 0) {
                firstArray[k] = input[l];       // 0 4
                secondArray[k] = input[l+1];                              // 1 5
            } else {
                secondArray[k] = input[l];// 2 6
                firstArray[k] = input[l+1];// 3 7
            }
            k++;
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
