package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnterFilename
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String fileName = "";

        System.out.println("Enter file name: ");
        fileName = scanner.nextLine();
        System.out.println("Filename: " + fileName);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))){

            writer.println("Data on file with user inputted name.");
            writer.printf("Appended formatted content: %d %s%n", 42, "example");


        } catch (IOException e) {
            System.out.println("An error occurred while creating the file. ");
            e.printStackTrace();
        }
    }
}
