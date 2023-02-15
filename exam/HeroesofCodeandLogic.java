package FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesofCodeandLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hP = new LinkedHashMap<>();  // hit points map
        Map<String, Integer> mP = new LinkedHashMap<>(); // mana points map
        int cntHero = Integer.parseInt(scanner.nextLine()); //Hero's number
        for(int i = 1; i <= cntHero; i++){ // loop for hero's data
            String heroDtStrng = scanner.nextLine();
            String[] heroDt = heroDtStrng.split("\\s+"); // hero's data
            String heroNm = heroDt[0]; // hero's name
            int hp = Integer.parseInt(heroDt[1]); // hit points
            int mp = Integer.parseInt(heroDt[2]); // mana points
            if(hp <= 100){
                hP.put(heroNm, hp);
            }
            if(hp <= 200){
                mP.put(heroNm, mp);
            }
        }
        String cmmnd = scanner.nextLine();
        while(!cmmnd.equals("End")){
            if(cmmnd.contains("CastSpell")){ // cast spell
                String heroNm = cmmnd.split("\\s+-\\s+")[1]; // hero
                int mpNdd = Integer.parseInt(cmmnd.split("\\s+-\\s+")[2]); // hero's mana points needed
                String splNm = cmmnd.split("\\s+-\\s+")[3]; // hero's spellname
                int heroCrrMp = mP.get(heroNm); // hero's curren mana points
                if(heroCrrMp >= mpNdd){ // we do the spell
                    int mpLft = heroCrrMp - mpNdd; // mana points left after the spell
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroNm, splNm, mpLft);
                    mP.put(heroNm,mpLft);
                }else{ // we can't do the spell
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroNm, splNm);
                }
            }else if(cmmnd.contains("TakeDamage")){ // take damage
                String heroNm = cmmnd.split("\\s+-\\s+")[1]; // hero's name
                int dmg = Integer.parseInt(cmmnd.split("\\s+-\\s+")[2]); // points taken away
                String attkr = cmmnd.split("\\s+-\\s+")[3]; // attaker name
                int heroCrrHp = hP.get(heroNm);
                heroCrrHp -= dmg; // decrease hero's mana points
                if(heroCrrHp > 0){ // hero is still allive
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroNm, dmg, attkr, heroCrrHp);
                    hP.put(heroNm,heroCrrHp);
                }else{
                    System.out.printf("%s has been killed by %s!%n", heroNm, attkr);
                    hP.remove(heroNm);
                    mP.remove(heroNm);
                }
            }else if(cmmnd.contains("Recharge")) { // command Recharge has been given
                String heroNm = cmmnd.split("\\s+-\\s+")[1]; // hero's name
                int rchrgMP = Integer.parseInt(cmmnd.split("\\s+-\\s+")[2]); // mana points to restore
                int heroCrrMp = mP.get(heroNm); // get current mana points
                heroCrrMp += rchrgMP;
                if(heroCrrMp > 200){
                    heroCrrMp = 200;
                }
                int incrdMp = heroCrrMp - mP.get(heroNm); // real restored mana point (to the limit of 200)
                System.out.printf("%s recharged for %d MP!%n", heroNm, incrdMp );
                mP.put(heroNm, heroCrrMp);
            }else if(cmmnd.contains("Heal")) { // command to restore hit points has been given
                String heroNm = cmmnd.split("\\s+-\\s+")[1]; // hero's name
                int rchrgHP = Integer.parseInt(cmmnd.split("\\s+-\\s+")[2]); // hit points to restore
                int heroCrrHp = hP.get(heroNm);
                heroCrrHp += rchrgHP;
                if(heroCrrHp > 100){
                    heroCrrHp = 100;
                }
                int incrdHp = heroCrrHp - hP.get(heroNm);
                System.out.printf("%s healed for %d HP!%n", heroNm, incrdHp);
                hP.put(heroNm, heroCrrHp);
            }
            cmmnd = scanner.nextLine();
        }
        hP.entrySet().forEach(entry -> {
            String heroNm = entry.getKey();
            System.out.println(heroNm);
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + mP.get(heroNm));
        });
    }
}
