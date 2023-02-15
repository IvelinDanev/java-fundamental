package Method.Lab;

import java.util.Scanner;

public class MultiplyEvensbyOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNmbr = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyResult(inputNmbr));
    }

    public static int getevenSum(int inputNmbr) {
        int evenSum = 0;
        while (inputNmbr != 0) {
            int currentNmbr = inputNmbr % 10;
            if (currentNmbr % 2 == 0) {
                evenSum += currentNmbr;
            }
            inputNmbr /= 10;
        }
        return evenSum;
    }

    public static int getoddSum(int inputNmbr) {
        int oddSum = 0;
        while (inputNmbr != 0) {
            int currentNmbr = inputNmbr % 10;
            if (currentNmbr % 2 != 0) {
                oddSum += currentNmbr;
            }
            inputNmbr /= 10;
        }
        return oddSum;
    }

    public static int multiplyResult(int inputNmbr) {
        int evenSum = getevenSum(inputNmbr);
        int oddSum = getoddSum(inputNmbr);
        return evenSum * oddSum;
    }
}
