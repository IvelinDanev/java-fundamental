package objectsClasses.Students_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputLines = scanner.nextLine().split("\\s+");
            String firstName = inputLines[0];
            String lastName = inputLines[1];
            double grade = Double.parseDouble(inputLines[2]);
            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student: studentList) {
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getLastName(),student.getGrade());
        }
    }
}
