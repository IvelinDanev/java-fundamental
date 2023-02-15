package basicSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String truePass = "";
        for (int i = userName.length()-1; i >= 0 ; i--) {
            char curSymb = userName.charAt(i);
            truePass += curSymb;
        }
        boolean is4 = false;
        String inputPass = scanner.nextLine();
        int count = 1;
        while(!truePass.equals(inputPass) && count < 4){
            System.out.println("Incorrect password. Try again.");
            count++;
            inputPass = scanner.nextLine();
        }
        if(truePass.equals(inputPass)){
            System.out.println("User "+userName+" logged in.");
        }else{
            System.out.println("User "+userName+" blocked!");
        }
    }
}
