package basicSyntax;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ownMoney = Double.parseDouble(scanner.nextLine());
        int studCount = Integer.parseInt(scanner.nextLine());
        double singlSaberPrice = Double.parseDouble(scanner.nextLine());
        double singlRobPrice = Double.parseDouble(scanner.nextLine());
        double singlBelts = Double.parseDouble(scanner.nextLine());
        int freeBelts = 0;
        freeBelts = studCount/6;
        double needSum = singlSaberPrice * (studCount + Math.ceil(studCount * 0.1)) + singlRobPrice * studCount + singlBelts * (studCount - freeBelts);
        if(needSum <= ownMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", needSum);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", (needSum - ownMoney));
        }

    }
}
