package Lists.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//3 3 6 1
public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i).equals(numbers.get(i+1))){
                double sumequalnumbers = numbers.get(i)+numbers.get(i+1);
                numbers.set(i,sumequalnumbers);
                numbers.remove(i+1);
                i = -1;
            }
        }
        String output = joinElemforPrint(numbers," ");
        System.out.println(output);
    }
    static String joinElemforPrint(List<Double> numbers, String delimiter){
        String output = "";
        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number)+delimiter);
        }
        return output;
    }

}
