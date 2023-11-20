package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "File13.txt";

        File myFile = new File(fileName);


        try {
            FileWriter myFile2 = new FileWriter(fileName, true);

                System.out.println("Writing data to file.");
                myFile2.write("after i added boolean statement.");
                myFile2.close();

                System.out.println("File length: " + myFile.length());

        }
        catch (IOException e){
            System.out.println("An error occurred while creating the file. ");
            e.printStackTrace();
        }
    }
}