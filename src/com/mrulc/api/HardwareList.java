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
                    break;
                case RECEIPT_PRINTER:
                    receipt_printers.add(h);
                    break;
                case KITCHEN_SCREEN:
                    kitchen_screens.add(h);
                    break;
                case OFFICE_COMPUTER:
                    office_computers.add(h);
                    break;
                case OFFICE_PRINTER:
                    office_printers.add(h);
                    break;
                case DRIVE_THRU_DIRECTOR:
                    drive_thru_directors.add(h);
                    break;
                case OCU:
                    ocus.add(h);
                    break;
                case PHONE:
                    phones.add(h);
                    break;
                case CHEF:
                    chefs.add(h);
                    break;
                case PHU:
                    phus.add(h);
                    break;
                case DMB_SCREEN:
                    dmb_screens.add(h);
                    break;
                case DMB_CONTROLLER:
                    dmb_controllers.add(h);
                    break;
                case KIOSK:
                    kiosks.add(h);
                    break;
                case VERIFONE:
                    verifones.add(h);
                    break;
                case ODMB_SCREEN:
                    odmb_screens.add(h);
                    break;
                case ODMB_CONTROLLER:
                    odmb_controllers.add(h);
                    break;
                default:
                    System.out.println("Hardware "+h.getName()+" does not containt a hardware type.");

            }
        }
    }
    public static void resetSubLists(){
        receipt_printers.clear();
        kitchen_screens.clear();
        office_computers.clear();
        office_printers.clear();
        drive_thru_directors.clear();
        ocus.clear();
        phones.clear();
        chefs.clear();
        phus.clear();
        dmb_screens.clear();
        dmb_controllers.clear();
        kiosks.clear();
        verifones.clear();
        odmb_screens.clear();
        odmb_controllers.clear();

    }


}



