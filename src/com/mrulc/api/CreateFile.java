package com.mrulc.api;

import java.io.PrintWriter;

public class CreateFile {
    public static void createFile()throws Exception{
        PrintWriter writer = new PrintWriter("C:\\Users\\Public\\NetworkDiagram\\data.txt");
        writer.close();
    }
}
