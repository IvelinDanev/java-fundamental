package Method.Exerceses;

import java.util.Scanner;

public class AddandSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstinputNmbr = Integer.parseInt(scanner.nextLine());
        int secondinputNmbr = Integer.parseInt(scanner.nextLine());
        int thirdinputNmbr = Integer.parseInt(scanner.nextLine());
        System.out.println(subtracktSumwithThirdNmbr(sumFirstandTwo(firstinputNmbr,secondinputNmbr),thirdinputNmbr));
    }
    public static int sumFirstandTwo(int firstinputNmbr,int secondinputNmbr) {
        return firstinputNmbr + secondinputNmbr;
    }
        public static int subtracktSumwithThirdNmbr(int sumFirstandTwo,int thirdinputNmbr){
        return sumFirstandTwo - thirdinputNmbr;
    }

}
