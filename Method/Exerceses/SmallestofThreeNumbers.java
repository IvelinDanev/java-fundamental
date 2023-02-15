package Method.Exerceses;

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNmbr = Integer.parseInt(scanner.nextLine());
        int secondNmbr = Integer.parseInt(scanner.nextLine());
        int thurdNmbr = Integer.parseInt(scanner.nextLine());
        System.out.println(smallstNmbr(firstNmbr,secondNmbr,thurdNmbr));
    }
    public static int smallstNmbr(int firstNmbr, int secondNmbr, int thurdNmbr) {
        if(firstNmbr < secondNmbr && firstNmbr < thurdNmbr){
            return firstNmbr;
        }else if(secondNmbr < firstNmbr && secondNmbr < thurdNmbr){
            return secondNmbr;
        }else{
            return thurdNmbr;
        }
    }
}
