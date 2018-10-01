package com.mrulc.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Create_File {
    public static void createFile() throws Exception {
        File dir = new File("C:\\Users\\Public\\NetworkDiagram\\");
        File file = new File("C:\\Users\\Public\\NetworkDiagram\\data.txt");




        try {
            Scanner sc = new Scanner(file);
            if (sc.hasNext()) {
                System.out.println("File already exists, no action performed");
            }
        } catch (FileNotFoundException e) {
            try {
                dir.mkdir();
                System.out.println("Directory created");
            } catch (Exception e1) {
                System.out.println("Error creating directory");
            }
            PrintWriter writer = new PrintWriter(file);
            writer.write("ManagerTerminal ");
            writer.write("192.168.1.80 ");
            writer.write("SICOM ");
            writer.write("TERMINAL\n");
            writer.close();
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println("Severe error");
        }
    }
}
