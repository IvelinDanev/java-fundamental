package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> commList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while(!commList.contains("end")){
            if(commList.contains("Delete")) {
                for (int i = 0; i < intList.size(); i++) {
                    intList.remove(Integer.valueOf(commList.get(1)));
                }
            }else if(commList.contains("Insert")){
                    intList.add(Integer.parseInt(commList.get(2)),Integer.parseInt(commList.get(1)));
            }
            commList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        intList.forEach(element -> System.out.print(element + " "));
    }
}
