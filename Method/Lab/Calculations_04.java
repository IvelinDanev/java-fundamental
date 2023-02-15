package Method.Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTxt = scanner.nextLine();
        int frstNmbr = Integer.parseInt(scanner.nextLine());
        int secndNmbr = Integer.parseInt(scanner.nextLine());
        double result = 0;
        switch (inputTxt) {
            case "add":
                doAdd(frstNmbr,secndNmbr);
                break;
            case "multiply":
                doMultiply(frstNmbr,secndNmbr);
                break;
            case "subtract":
                doSubtract(frstNmbr,secndNmbr);
                break;
            case "divide":
                doDivide(frstNmbr,secndNmbr);
                break;
        }
    }
    public static void doAdd(int frstNmbr, int secndNmbr){
        System.out.println(frstNmbr + secndNmbr);
    }
    public static void doMultiply(int frstNmbr, int secndNmbr){
        System.out.println(frstNmbr*secndNmbr);
    }
    public static void doSubtract(int frstNmbr, int secndNmbr){
        System.out.println(frstNmbr-secndNmbr);
    }
    public static void doDivide(int frstNmbr, int secndNmbr){
        System.out.println(frstNmbr/secndNmbr);
    }
}
