package Method.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNmbr = Double.parseDouble(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        double secondNmbr = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(operationsResult(firstNmbr,sign,secondNmbr)));
    }

    public static double operationsResult(double firstNmbr, char sign, double secondNmbr) {
        double result = 0;
        switch (sign) {
            case '/':
                result = firstNmbr / secondNmbr;
                break;
            case '*':
                result = firstNmbr * secondNmbr;
                break;
            case '+':
                result = firstNmbr + secondNmbr;
                break;
            case '-':
                result = firstNmbr - secondNmbr;
                break;
        }
        return result;
    }
}
