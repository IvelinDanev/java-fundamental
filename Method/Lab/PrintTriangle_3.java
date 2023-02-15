package Method.Lab;

import java.util.Scanner;

public class PrintTriangle_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            /*for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();*/
            printLine(1,i);
        }
        for (int i = 1; i < n; i++) {
            /*for (int j = 1; j <= n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();*/
            printLine(1,n-i);
        }
    }
    public static void printLine(int start, int end){
        for (int j = start; j <= end; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
