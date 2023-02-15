package Exam.Mid;

import java.util.Scanner;

public class CookingMasters_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int studentNmbr = Integer.parseInt(scanner.nextLine());
        double packflourPrce = Double.parseDouble(scanner.nextLine());
        double singleggPrce = Double.parseDouble(scanner.nextLine());
        double singlapronPrce = Double.parseDouble(scanner.nextLine());

        double needpackPrice = singlapronPrce*(studentNmbr + Math.ceil(studentNmbr*0.2)) + singleggPrce*10*studentNmbr
                +packflourPrce*(studentNmbr - (studentNmbr/5));
        double moneyDiffrence = needpackPrice - budget;
        if(needpackPrice<=budget){
            System.out.printf("Items purchased for %.2f$.",needpackPrice);
        }else{
            System.out.printf("%.2f$ more needed.",moneyDiffrence);
        }
    }
}
