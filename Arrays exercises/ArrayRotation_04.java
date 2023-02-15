package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rotatedArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotateNumber = Integer.parseInt(scanner.nextLine());
        int firstItem = 0;
        for (int i=0;i < rotateNumber; i++) {//51 47 32 61 21
            firstItem = rotatedArray[0];
            for (int j = 0; j < rotatedArray.length-1; j++) {
                rotatedArray[j] = rotatedArray[j+1];
            }
            rotatedArray[rotatedArray.length - 1] = firstItem;
        }
        for (int Item:rotatedArray) {
            System.out.print(Item+" ");
        }
    }
}
