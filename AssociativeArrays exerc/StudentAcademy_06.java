package AssociativeArrays.Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studGradMap = new LinkedHashMap<>();
        Map<String, Integer> studEncount = new LinkedHashMap<>();
        Map<String, Double> studAverGrad = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String stName = scanner.nextLine();//име на студент
            double stGrad = Double.parseDouble(scanner.nextLine());// оценка на студента
            if (!studGradMap.containsKey(stName)) {
                studGradMap.put(stName, stGrad);
                studEncount.put(stName,1);
                studAverGrad.put(stName,stGrad);
            } else {
                studEncount.put(stName,studEncount.get(stName)+1);
                double sumGrad = studGradMap.get(stName)+stGrad;
                studGradMap.put(stName, sumGrad);
                studAverGrad.put(stName,sumGrad/studEncount.get(stName));
            }
        }
        /*for (var entry : studGradMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
        for (var entry : studEncount.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }*/
        for (var entry : studAverGrad.entrySet()) {
            if (entry.getValue() >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }
        //System.out.printf("%s -> %.2f%n", entry.getKey(),entry.getValue())
    }
}
