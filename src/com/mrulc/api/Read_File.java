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
            String name = sc.next();
            String ip = sc.next();
            hardware.setName(name);
            hardware.setIp(ip);
            HardwareList.hardwarelist.add(hardware);
            System.out.println(hardware.toString());
        }
    }




}



