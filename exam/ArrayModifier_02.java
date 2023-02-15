package midExamPrepair;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String[] cmmnd = scanner.nextLine().split(" ");
        while (!cmmnd[0].equals("end")) {

            switch (cmmnd[0]) {
                    case "swap":
                        int firstIndx = Integer.parseInt(cmmnd[1]);
                        int secndIndx = Integer.parseInt(cmmnd[2]);
                        int firstValue = Integer.parseInt(arr[firstIndx]);
                        int secndValue = Integer.parseInt(arr[secndIndx]);
                        arr[firstIndx] = String.valueOf(secndValue);
                        arr[secndIndx] = String.valueOf(firstValue);
                        break;
                    case "multiply":
                        firstIndx = Integer.parseInt(cmmnd[1]);
                        secndIndx = Integer.parseInt(cmmnd[2]);
                        firstValue = Integer.parseInt(arr[firstIndx]);
                        secndValue = Integer.parseInt(arr[secndIndx]);
                        int product = firstValue * secndValue;
                        arr[firstIndx] = String.valueOf(product);
                        break;
                    case "decrease":
                        for (int i = 0; i < arr.length; i++) {
                            int valuetoDecr = Integer.parseInt(arr[i])-1;
                            arr[i] = String.valueOf(valuetoDecr);
                        }
                        break;
                }
            cmmnd = scanner.nextLine().split(" ");
        }
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]]",
                ""));
    }
}
