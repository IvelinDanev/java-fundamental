package objectsClasses.lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factNmbr = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= factNmbr; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
