package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbLst = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> bombLst = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbLst);
        int bombNmbr = bombLst.get(0);
        int bombIndx = numbLst.indexOf(bombNmbr);
        int bombRnge = bombLst.get(1);
        int sum = 0;
        while(numbLst.contains(bombNmbr)){
            int right = Math.min(bombIndx+bombRnge,numbLst.size()-1);
            int left = Math.max(0,bombIndx - bombRnge);
            for (int i = right; i >= left ; i--) {
                numbLst.remove(i);
            }
        }
        sum = numbLst.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(numbLst.toString());
    }
}
