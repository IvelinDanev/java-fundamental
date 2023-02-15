package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;


public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsNumber = Integer.parseInt(scanner.nextLine());
        int[] peoplesInWagon = new int[wagonsNumber];
        int totalPeople = 0;
        for (int i = 0; i < wagonsNumber; i++) {
            peoplesInWagon[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int peoplePrint:peoplesInWagon) {
            System.out.print(peoplePrint+" ");
        }
        totalPeople = Arrays.stream(peoplesInWagon).sum();
        System.out.println();
        System.out.println(totalPeople);
    }
}
