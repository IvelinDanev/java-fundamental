package midExamPrepair;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodQty = Double.parseDouble(scanner.nextLine())*1000;
        double hayQty = Double.parseDouble(scanner.nextLine())*1000;
        double coverQty = Double.parseDouble(scanner.nextLine())*1000;
        double pigsWeight = Double.parseDouble(scanner.nextLine())*1000;
        double fullfoodQty = foodQty;
        double fullhayQty = hayQty;
        double fullcoverQty = coverQty;
        boolean isDepleted = false;

            for (int i = 1; i <= 30; i++) {
                foodQty -= 300;
                if (i % 2 == 0) {
                    hayQty = hayQty - (0.05 * foodQty);
                }
                if (i % 3 == 0) {
                    coverQty = coverQty -(pigsWeight*1.0 / 3);
                }
                if (foodQty <= 0 || hayQty <= 0 || coverQty <= 0){
                    isDepleted = true;
                    break;
                }
            }


        if(foodQty > 0 && hayQty > 0 && coverQty > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, " +
                    "Hay: %.2f, Cover: %.2f.", foodQty/1000,hayQty/1000,coverQty/1000);
        }else{
            System.out.println("Merry must go to the pet store!");
        }
    }
}
