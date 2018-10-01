package com.mrulc.api;

import java.util.ArrayList;
import java.util.List;

public class HardwareList {

    /**
     * MASTER ARRAYLIST
     */
    static List<Hardware> hardwarelist = new ArrayList<>();

    /**
     * SUB ARRAY LISTS
     */
    static List<Hardware> terminals  = new ArrayList<>();
    static List<Hardware> receipt_printers  = new ArrayList<>();
    static List<Hardware> kitchen_screens  = new ArrayList<>();
    static List<Hardware> office_computers  = new ArrayList<>();
    static List<Hardware> office_printers  = new ArrayList<>();
    public static List<Hardware> drive_thru_directors  = new ArrayList<>();
    public static List<Hardware> ocus  = new ArrayList<>();
    public static List<Hardware> phones  = new ArrayList<>();
    public static List<Hardware> chefs  = new ArrayList<>();
    public static List<Hardware> phus  = new ArrayList<>();
    public static List<Hardware> dmb_screens  = new ArrayList<>();
    public static List<Hardware> dmb_controllers  = new ArrayList<>();
    public static List<Hardware> kiosks  = new ArrayList<>();
    public static List<Hardware> verifones  = new ArrayList<>();
    public static List<Hardware> odmb_screens  = new ArrayList<>();
    public static List<Hardware> odmb_controllers  = new ArrayList<>();

    public static void subCatagorize(){
        for(Hardware h:hardwarelist){
            switch(h.getType()){
                case TERMINAL:
                case RECEIPT_PRINTER:
                case KITCHEN_SCREEN:
                case OFFICE_COMPUTER:
                case OFFICE_PRINTER:
                case DRIVE_THRU_DIRECTOR:
                case OCU:
                case PHONE:
                case CHEF:
                case PHU:
                case DMB_SCREEN:
                case DMB_CONTROLLER:
                case KIOSK:
                case VERIFONE:
                case ODMB_SCREEN:
                case ODMB_CONTROLLER:
                default:

            }
        }
    }

}



