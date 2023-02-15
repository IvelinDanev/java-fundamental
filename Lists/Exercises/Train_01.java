package Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> passengrsInWagon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxcapacityWagon = Integer.parseInt(scanner.nextLine());
        List<String> commands = new ArrayList<>();
        commands = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        while (!commands.contains("end")) {
            if (commands.contains("Add")) {
                passengrsInWagon.add(Integer.parseInt(commands.get(1)));
            } else {
                for (int i = 0; i < passengrsInWagon.size(); i++) {
                    int passtoAdd = Integer.parseInt(commands.get(0)); // int пътници за добавяне
                    if ((maxcapacityWagon - passengrsInWagon.get(i)) >= passtoAdd) {
                        int sumtoAdd = passengrsInWagon.get(i) + passtoAdd;
                        passengrsInWagon.set(i, sumtoAdd);
                        break;
                    }
                }
            }
            commands = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
        System.out.println(passengrsInWagon.toString().replaceAll("[\\[\\],]",""));
    }
}
