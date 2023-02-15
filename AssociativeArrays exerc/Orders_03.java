package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> prodPrice = new LinkedHashMap<>();
        Map<String, Integer> prodQuant = new LinkedHashMap<>();
        Map<String, Double> prodSum = new LinkedHashMap<>();
        double price = 0;
        int quantity = 0;
        String input = scanner.nextLine();
        while(!input.equals("buy")){
            String product = input.split("\\s+")[0];
            double inputPrice = Double.parseDouble(input.split("\\s+")[1]);
            int inputQuant = Integer.parseInt(input.split("\\s+")[2]);
            if(prodPrice.containsKey(product)){
                prodPrice.put(product,inputPrice);
                prodQuant.put(product,prodQuant.get(product) + inputQuant);
                prodSum.put(product,(inputPrice*prodQuant.get(product)));
            }else{
                prodPrice.put(product,inputPrice);
                prodQuant.put(product,inputQuant);
                prodSum.put(product,inputPrice*inputQuant);
            }
            input = scanner.nextLine();
        }
        prodSum.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}
