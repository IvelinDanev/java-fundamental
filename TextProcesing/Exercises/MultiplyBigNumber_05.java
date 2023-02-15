package TextProcesing.Exercises;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNmbr = scanner.nextLine().replaceFirst("(^0+(?!$))","");
        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int appendDigit = 0;
        int newDigit = 0;
        int lastDigit = 0;
        int restDigit = 0;
        int currDigit = 0;  //923847238931983192462832102
        //4
        for (int i = inputNmbr.length() - 1; i >= 0; i--) {
            String currChar = inputNmbr.charAt(i) + "";
            currDigit = Integer.parseInt(currChar);
            newDigit = currDigit * number + restDigit;
            lastDigit = newDigit % 10;
            result.append(lastDigit);
            restDigit = newDigit / 10;
            if(i == 0 && restDigit > 0){
                result.append(restDigit);
            }
        }
        result.reverse();
        if(Double.parseDouble(String.valueOf(result)) == 0){
            System.out.println(0);
        }else{
            System.out.println(result);
        }
    }
}
