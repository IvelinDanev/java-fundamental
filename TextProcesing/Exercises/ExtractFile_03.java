package TextProcesing.Exercises;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String fileNameString = input[input.length - 1];
        String[] fileName = fileNameString.split("\\.");
        String name = fileName[0];
        String ext = fileName[1];
        System.out.println("File name: "+name);
        System.out.println("File extension: "+ext);
    }
}
