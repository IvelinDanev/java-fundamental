package Method.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNmbr = Double.parseDouble(scanner.nextLine());
        double secondNmbr = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(doPowerofnumber(firstNmbr,secondNmbr)));
    }
    public static double doPowerofnumber(double firstNmbr, double secondNmbr){
        double result = 1;
        for (int i = 0; i < secondNmbr; i++) {
            result *= firstNmbr;
        }
        return result;
    }
}
