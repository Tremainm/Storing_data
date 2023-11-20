package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "File13.txt";

        File myFile = new File(fileName);


        try {
            FileWriter myFile2 = new FileWriter(fileName);

                System.out.println("Writing data to file.");
                myFile2.write("This is new data that i have typed.");
                myFile2.close();

                System.out.println("File length: " + myFile.length());

        }
        catch (IOException e){
            System.out.println("An error occurred while creating the file. ");
            e.printStackTrace();
        }
    }
}