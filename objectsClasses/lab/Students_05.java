package objectsClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student{
        private String firstName;
        private String lastName;
        private String age;
        private String homeTown;
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
        public String getHomeTown() {
            return this.homeTown;
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
            Student currStudent = new Student(firstName, lastName, age, homeTown);
            studentList.add(currStudent);
            commands = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();
        for (Student item:studentList) {
            if(item.getHomeTown().equals(homeTown)){
                //"{firstName} {lastName} is {age} years old".
                System.out.printf("%s %s is %s years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }
        }
    }
}
