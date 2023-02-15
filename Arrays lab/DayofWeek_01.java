package Arrays.lab;

import java.util.Scanner;

public class DayofWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] daysofWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday","Sunday" };
        if(n >= 1 && n <= 7){
            System.out.println(daysofWeek[n-1]);
        }else{
            System.out.println("Invalid Day!");
        }
    }
}
