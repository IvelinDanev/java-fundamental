package dataTypsVariable.exer;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = Integer.parseInt(scanner.nextLine());
        int peopleCapacity = Integer.parseInt(scanner.nextLine());
        int fullCapacityCourses = peopleNumber / peopleCapacity;
        int partlyCapacityNumber = peopleNumber - fullCapacityCourses;
        int sumCourses = 0;
        if (fullCapacityCourses > 0 && (peopleNumber%peopleCapacity) != 0) {
            sumCourses = fullCapacityCourses + 1;
        } else if (fullCapacityCourses == 0) {
            sumCourses = 1;
        }else{
            sumCourses = fullCapacityCourses;
        }
        System.out.println(sumCourses);
    }
}
