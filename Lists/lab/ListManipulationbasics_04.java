package Lists.lab;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationbasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] commands = scanner.nextLine().split(" ");
        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commands[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commands[2]),Integer.parseInt(commands[1]));
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
