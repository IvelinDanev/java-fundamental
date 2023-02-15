package basicSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String day = scanner.nextLine();
        double groupPrice;

        /*
        	Friday	Saturday	Sunday
Students	8.45	9.80	10.46
Business	10.90	15.60	16
Regular	15	20	22.50
•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%

         */
        switch (day) {
            case "Friday":
                switch (peopleType) {
                    case "Students":
                        groupPrice = numb * 8.45;
                        if (numb >= 30 ) {
                            groupPrice *= 0.85;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Business":
                        groupPrice = numb * 10.9;
                        if (numb >= 100) {
                            groupPrice -= 10 * 10.9;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Regular":
                        groupPrice = numb * 15;
                        if (numb >= 10 && numb <= 20) {
                            groupPrice *= 0.95;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                }
                break;
            case "Saturday":
                switch (peopleType) {
                    case "Students":
                        groupPrice = numb * 9.8;
                        if (numb >= 30 ) {
                            groupPrice *= 0.85;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Business":
                        groupPrice = numb * 15.6;
                        if (numb >= 100) {
                            groupPrice -= 10 * 15.6;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Regular":
                        groupPrice = numb * 20;
                        if (numb >= 10 && numb <= 20) {
                            groupPrice *= 0.95;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                }
                break;
            case "Sunday":
                switch (peopleType) {
                    case "Students":
                        groupPrice = numb * 10.46;
                        if (numb >= 30 ) {
                            groupPrice *= 0.85;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Business":
                        groupPrice = numb * 16;
                        if (numb >= 100) {
                            groupPrice -= 10 * 16;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                    case "Regular":
                        groupPrice = numb * 22.5;
                        if (numb >= 10 && numb <= 20) {
                            groupPrice *= 0.95;
                        }
                        System.out.printf("Total price: %.2f", groupPrice);
                        break;
                }
                break;
        }
    }
}

