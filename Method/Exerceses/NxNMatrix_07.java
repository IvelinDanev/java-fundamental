package Method.Exerceses;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        nnMatrix(n);
    }
    public static void nnMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = n;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
