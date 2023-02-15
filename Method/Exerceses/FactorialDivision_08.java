package Method.Exerceses;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNmbr = Integer.parseInt(scanner.nextLine());
        int secondNmbr = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",getDivision(getfirstFactoriel(firstNmbr),
                getsecondFactoriel(secondNmbr)));
    }
    public static long getfirstFactoriel(int firstNmbr){
        long firstFactoriel = 1;
        for (int i = 1; i <= firstNmbr; i++) {
            firstFactoriel *= i;
        }
        return firstFactoriel;
    }
    public static long getsecondFactoriel(int secondNmbr){
        long secondFactoriel = 1;
        for (int i = 1; i <= secondNmbr; i++) {
            secondFactoriel *= i;
        }
        return secondFactoriel;
    }
    public static double getDivision(long getfirstFactoriel,long getsecondFactoriel){
        return 1.0*getfirstFactoriel/getsecondFactoriel;
    }
}
