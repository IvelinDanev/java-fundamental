package Method.Exerceses;

import java.util.Scanner;

public class CharactersinRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstChar = scanner.nextLine().charAt(0);
        int secondChar = scanner.nextLine().charAt(0);
        int swap = 0;
        charsINRange(firstChar,secondChar,swap);
    }
    public static void charsINRange(int firstChar, int secondChar, int swap){
        if(secondChar < firstChar){
            swap = secondChar;
            secondChar = firstChar;
            firstChar = swap;
        }
        for (int i = firstChar+1; i < secondChar; i++) {
            System.out.print((char)i + " ");
        }
    }
}
