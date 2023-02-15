package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isIndentical = true;
        int writePosition = 0;
        for(int integer:firstArray){
            if( firstArray[writePosition] == secondArray[writePosition] ){
                sum += firstArray[writePosition];
            }else{
                isIndentical = false;
                break;
            }
            writePosition++;
        }
        if(isIndentical){
            System.out.println("Arrays are identical. Sum: "+sum);
        }else{
            System.out.println("Arrays are not identical. Found difference at "+writePosition+" index.");
        }
    }
}
