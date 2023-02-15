package objectsClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {
        static class Student{
            private String firstName;
            private String lastName;
            private String age;
            private String homeTown;
            Student() {
                this.firstName = null;
                this.lastName = null;
                this.age = null;
                this.homeTown = null;
            }
            public Student(String firstName, String lastName, String age, String homeTown) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.homeTown = homeTown;
            }
            public String getFirstName() {
                return this.firstName;
            }
            public String getLastName() {
                return this.lastName;
            }
            public String getAge() {
                return this.age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getHomeTown() {
                return this.homeTown;
            }

            public void setHomeTown(String homeTown) {
                this.homeTown = homeTown;
            }
            @Override
            public String toString() {
                return String.format("%s %s is %s years old%n",
                        this.getFirstName(),
                        this.getLastName(),
                        this.getAge());
            }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String commands = scanner.nextLine();
        while (!commands.equals("end")){
            String[] inputList = commands.split("\\s+");
            String firstName = inputList[0];
            String lastName = inputList[1];
            String age = inputList[2];
            String homeTown = inputList[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            int existingIndex = findStudentsIndex(studentList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentList.get(existingIndex).setAge(student.getAge());
                studentList.get(existingIndex).setHomeTown(student.getHomeTown());
            } else {
                studentList.add(student);
            }
            commands = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getHomeTown().equals(homeTown)) {
                System.out.print(s);
            }
        }
    }
    static public int findStudentsIndex(List<Student> studentList, String firstName, String  lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
}
