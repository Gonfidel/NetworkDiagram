package com.mrulc.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Read_File{

    private File file = new File("C:\\Users\\Public\\NetworkDiagram\\data.txt");
    private Scanner sc;

    public void readFile() throws FileNotFoundException,UnknownHostException {
        sc = new Scanner(file);
        while (sc.hasNext()) {
            Hardware hardware = new Hardware();
            String name = sc.next();
            String ip = sc.next();
            hardware.setName(name);
            hardware.setIp(ip);
            HardwareList.hardwarelist.add(hardware);
        }
    }




}



