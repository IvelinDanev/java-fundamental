package FinalRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emploees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx = "(?<name>([A-Z][a-z]{2,} [A-Z][a-z]{2,}))#+(?<jobT>([A-Z][A-Za-z]+(&[A-Z][A-Za-z]+)?(&[A-Z][A-Za-z]+)?))\\d{2}(?<comp>([A-Z][A-Za-z0-9]+ ((Ltd.)|(JSC)?)))";
        int nbrInp = Integer.parseInt(scanner.nextLine());
        Pattern pttrn = Pattern.compile(rgx);
        for (int i = 0; i < nbrInp; i++) {
            String inpToChk = scanner.nextLine();
            Matcher mtch = pttrn.matcher(inpToChk);
            if(mtch.find()){
                String name = mtch.group("name");
                String jobT = mtch.group("jobT").replace("&"," ");
                String comp = mtch.group("comp");
                System.out.printf("%s is %s at %s%n", name, jobT, comp);
            }
        }
    }
}
