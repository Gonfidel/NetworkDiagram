package com.mrulc.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void createFile() throws Exception {
        File file = new File("C:\\Users\\Public\\NetworkDiagram\\data.txt");

        try {
            Scanner sc = new Scanner(file);
            if (sc.hasNext()) {
                System.out.println("File already exists, no action performed");
            }
        } catch (FileNotFoundException e) {
            PrintWriter writer = new PrintWriter(file);
            writer.close();
        } catch (Exception e) {
            System.out.println("Severe error");
        }
    }
}
