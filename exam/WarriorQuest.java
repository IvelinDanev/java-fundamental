package FinalRetake;

import java.util.Scanner;

public class WarriorQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String skill = scanner.nextLine();
        String cmmnds = scanner.nextLine();
        while (!cmmnds.contains("For Azeroth")) {
            String[] cmmndsArr = cmmnds.split("\\s+");
            switch (cmmndsArr[0]) {
                case "GladiatorStance":
                    skill = skill.toUpperCase();
                    System.out.println(skill);
                    break;
                case "DefensiveStance":
                    skill = skill.toLowerCase();
                    System.out.println(skill);
                    break;
                case "Dispel":
                    int indx = Integer.parseInt(cmmndsArr[1]);
                    char[] skillChrArr = skill.toCharArray();
                    if (0 < indx && indx < skillChrArr.length) {
                        char chrToRplsWth = cmmndsArr[2].charAt(0);
                        char chrToRplc = skill.charAt(indx);
                        skill = skill.replace(chrToRplc, chrToRplsWth);
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak");
                        break;
                    }
                    break;
                case "Target":
                    if(cmmndsArr[1].equals("Change")) {
                        if (skill.contains(cmmndsArr[3])){
                            skill = skill.replace(cmmndsArr[2],cmmndsArr[3]);
                            System.out.println(skill);
                        }else{
                            System.out.println(skill);
                            break;
                        }
                    }else if(cmmndsArr[1].equals("Remove")) {
                        if (skill.contains(cmmndsArr[2])){
                            skill = skill.replace(cmmndsArr[2],"");
                            System.out.println(skill);
                        }else{
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
                    break;
            }
            cmmnds = scanner.nextLine();
        }
    }
}
