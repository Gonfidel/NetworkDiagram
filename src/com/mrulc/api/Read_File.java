package com.mrulc.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Read_File{
    public static void readFile() throws FileNotFoundException,UnknownHostException {
        File file = new File("C:\\Users\\Public\\NetworkDiagram\\data.txt");
        Scanner sc;
        sc = new Scanner(file);
        while (sc.hasNext()) {
            Hardware hardware = new Hardware();
            hardware.setName(sc.next());
            hardware.setIp(sc.next());
            hardware.setSubNet(sc.next());
            HardwareList.hardwarelist.add(hardware);
            System.out.println(hardware.toString());
        }
    }




}



