package com.hotel.io;

import java.io.*;

public class FileOperations {


    public static void createFolder(String folderName) {

        File file = new File(folderName);

        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Folder Created");
        }
    }


    public static void writeFile(String fileName, String data) {

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write(data);

            System.out.println("Data Written Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFile(String fileName) {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}