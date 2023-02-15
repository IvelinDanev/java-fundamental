package TextProcesing.Exercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        //abv>1>1>2>2asdasd
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rngeValue = 0;
        String expElem = "";
        boolean isToBeDel = false;
        for (int i = 0; i < input.length(); i++) {
            expElem = input.charAt(i) + "";
            if(Character.isDigit(input.charAt(i))){
                rngeValue += Integer.parseInt(expElem);
            }
            if (expElem.equals(">")){
                System.out.print(expElem);
                isToBeDel = true;
            }else if(!isToBeDel){
                System.out.print(expElem);
            }else{
                rngeValue--;
                if(rngeValue == 0){
                    isToBeDel = false;
                }
            }
        }
    }
}
