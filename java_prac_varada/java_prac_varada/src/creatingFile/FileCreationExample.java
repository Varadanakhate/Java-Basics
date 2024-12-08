package creatingFile;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\innakv00\\OneDrive - Ingram Micro\\Desktop\\myfile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            if (fileCreated) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ioe) {
            System.out.println("An error occurred while creating the file.");
            ioe.printStackTrace();  // This will print the stack trace for debugging
        }
    }
}
