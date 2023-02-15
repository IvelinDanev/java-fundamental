package objectsClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNmbr = new BigInteger(scanner.nextLine());
        BigInteger secondNmbr = new BigInteger(scanner.nextLine());
        BigInteger sum = firstNmbr.add(secondNmbr);
        System.out.println(sum);
    }
}
