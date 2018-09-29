package com.mrulc.api.view;
import java.io.IOException;

public class HardwareList {
    public static void main(String[] args) throws IOException {
        String file_name = "C:\\Users\\Tyson\\Desktop\\equipment.txt";

        WriteFile data = new WriteFile(file_name, true);
        data.writeToFile("DMBC1 192.168.2.211");
        data.writeToFile("DMBC2 192.168.2.212");
        data.writeToFile("DMBC3 192.168.2.213");
        data.writeToFile("DMBC4 192.168.2.214");

        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            int i;
            for (i = 0; i < aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        }
        catch (IOException e) {
            System.out.println("Error");
        }




    }
}
