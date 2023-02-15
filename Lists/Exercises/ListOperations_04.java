package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> operationList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int index = 0;
        List<String> commndsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!commndsList.contains("End")) {
            commndsList.removeAll(Arrays.asList("", null));
            if (commndsList.contains("Add")) {
                operationList.add(Integer.parseInt(commndsList.get(1)));
            } else if (commndsList.contains("Remove")) {
                index = Integer.parseInt(commndsList.get(1));
                if (isValidIndex(index, operationList)) {
                    operationList.remove(Integer.parseInt(commndsList.get(1)));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commndsList.contains("Shift")) {
                if (commndsList.contains("right")) {
                    for (int i = 0; i < Integer.parseInt(commndsList.get(2)); i++) {
                        int lastNmbr = operationList.get(operationList.size() - 1);
                        operationList.remove(operationList.size() - 1);
                        operationList.add(0, lastNmbr);
                    }
                } else if (commndsList.contains("left")) {
                    for (int i = 0; i < Integer.parseInt(commndsList.get(2)); i++) {
                        int frstNmbr = operationList.get(0);
                        operationList.remove(0);
                        operationList.add(frstNmbr);
                    }
                }
            } else if (commndsList.contains("Insert")) {
                index = Integer.parseInt(commndsList.get(2));
                if (isValidIndex(index, operationList)) {
                    operationList.add(Integer.parseInt(commndsList.get(2)), Integer.parseInt(commndsList.get(1)));// •	Insert {number} {index
                }else{
                    System.out.println("Invalid index");
                }
            }
            commndsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        operationList.forEach(e -> System.out.print(e + " "));
    }

    public static boolean isValidIndex(int index, List<Integer> operationList) {
        return index >= 0 && index <= operationList.size() - 1;
    }
}
