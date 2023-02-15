package dataTypsVariable.exer;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        String kegModel = " ";
        String biggerKegModel = " ";
        double kegRadius = 0;
        int kegHight = 0;
        double kegVolume = 0;
        double biggerKegVolume = 0;
        for (int i = 0; i < inputNumber; i++) {
            kegModel = scanner.nextLine();
            kegRadius = Double.parseDouble(scanner.nextLine());
            kegHight = Integer.parseInt(scanner.nextLine());
            kegVolume = Math.PI*Math.pow(kegRadius,2)*kegHight;
            if (kegVolume > biggerKegVolume){
                biggerKegVolume = kegVolume;
                biggerKegModel = kegModel;
            }
        }
        System.out.println(biggerKegModel);
    }
}
