package com.mrulc.api;

import java.util.ArrayList;
import java.util.List;

public class HardwareList {

    /**
     * MASTER ARRAYLIST
     */
    public static List<Hardware> hardwarelist = new ArrayList<>();

    /**
     * SUB ARRAY LISTS
     */
    public static List<Hardware> terminals  = new ArrayList<>();
    public static List<Hardware> receipt_printers  = new ArrayList<>();
    public static List<Hardware> kitchen_screens  = new ArrayList<>();
    public static List<Hardware> office_computers  = new ArrayList<>();
    public static List<Hardware> office_printers  = new ArrayList<>();
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
                    terminals.add(h);
                case RECEIPT_PRINTER:
                    receipt_printers.add(h);
                case KITCHEN_SCREEN:
                    kitchen_screens.add(h);
                case OFFICE_COMPUTER:
                    office_computers.add(h);
                case OFFICE_PRINTER:
                    office_printers.add(h);
                case DRIVE_THRU_DIRECTOR:
                    drive_thru_directors.add(h);
                case OCU:
                    ocus.add(h);
                case PHONE:
                    phones.add(h);
                case CHEF:
                    chefs.add(h);
                case PHU:
                    phus.add(h);
                case DMB_SCREEN:
                    dmb_screens.add(h);
                case DMB_CONTROLLER:
                    dmb_controllers.add(h);
                case KIOSK:
                    kiosks.add(h);
                case VERIFONE:
                    verifones.add(h);
                case ODMB_SCREEN:
                    odmb_screens.add(h);
                case ODMB_CONTROLLER:
                    odmb_controllers.add(h);
                default:
                    System.out.println("Hardware "+h.getName()+" does not containt a hardware type.");

            }
        }
    }

}



