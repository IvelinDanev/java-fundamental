package Arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSeqEqualElem_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 2 1 1 2 3 3 2 2 2 1
        int [] chkdArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < chkdArray.length; i++) {
            if(chkdArray[i] == chkdArray[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if(length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(chkdArray[i] + " ");
        }


    }
}
