package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Activity14 {
    public static void main(String[] args) {
        try {
            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File already exists in the path");

            }
            File fileUtil = FileUtils.getFile("src/session4/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");

            System.out.println("Data in new File: " + newFileData);
        }
        catch (IOException errMessage){
            System.out.println(errMessage);
        }
    }

}
