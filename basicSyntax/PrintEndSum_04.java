package basicSyntax;

import java.util.Scanner;

public class PrintEndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumb = Integer.parseInt(scanner.nextLine());
        int endNumb = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = startNumb; i <= endNumb; i++) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
