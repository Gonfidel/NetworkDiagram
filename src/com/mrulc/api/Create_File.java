package com.mrulc.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Create_File {

    static File dir = new File("C:\\Users\\Public\\NetworkDiagram\\");
    static File file = new File("C:\\Users\\Public\\NetworkDiagram\\data.txt");

    public static void createFile() throws Exception {
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

    public static void saveConfig(){
        file.delete();
        try {
            PrintWriter writer = new PrintWriter(file);
            for(Hardware h:HardwareList.hardwarelist){
                writer.write(h.getName());
                writer.write("\t");
                writer.write(h.getIp());
                writer.write("\t");
                writer.write(h.getSubNet());
                writer.write("\t");
                writer.write(h.getTypeString());
                writer.write("\n");
            }
             writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error saving config");
        }
    }
}
