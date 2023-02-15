package basicSyntax;

import java.util.Scanner;

public class Age_01 {
    /*•	0-2 – baby;
•	3-13 – child;
•	14-19 – teenager;
•	20-65 – adult;
•	>=66 – elder;
•	All the values are inclusive./*

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if(age <= 2 && age >= 0){
            System.out.println("baby");
        }else if(age > 2 && age < 14) {
            System.out.println("child");
        }else if(age >= 14 && age <= 19) {
            System.out.println("teenager");
        }else if(age > 19 && age < 66) {
            System.out.println("adult");
        }else{
            System.out.println("elder");
        }

    }

}
