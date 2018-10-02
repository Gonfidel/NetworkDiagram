package com.mrulc.api;

import javafx.beans.property.SimpleStringProperty;

import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hardware {

    private SimpleStringProperty Name;
    private SimpleStringProperty Ip;
    private SimpleStringProperty SubNet;
    private HardwareType type;


/* *****************************************************************
                           CONSTRUCTOR
 ***************************************************************** */

    public Hardware(){

    }
    public Hardware(String name, String ip, String subNet){
         this.Name = new SimpleStringProperty(name);
         this.Ip = new SimpleStringProperty(ip);
         this.SubNet = new SimpleStringProperty(subNet);
         this.type = HardwareType.DEFAULT;
    }
    public Hardware(String name, String ip, String subNet,HardwareType type){
        this.Name = new SimpleStringProperty(name);
        this.Ip = new SimpleStringProperty(ip);
        this.SubNet = new SimpleStringProperty(subNet);
        this.type = type;
    }
    public Hardware(String name, String ip, String subNet,String type){
        this.Name = new SimpleStringProperty(name);
        this.Ip = new SimpleStringProperty(ip);
        this.SubNet = new SimpleStringProperty(subNet);

        switch(type){
        case "TERMINAL":
        this.type = HardwareType.TERMINAL;
        break;
        case "RECEIPT_PRINTER":
        this.type = HardwareType.RECEIPT_PRINTER;
        break;
        case "KITCHEN_SCREEN":
        this.type = HardwareType.KITCHEN_SCREEN;
        break;
        case "OFFICE_COMPUTER":
        this.type = HardwareType.OFFICE_COMPUTER;
        break;
        case "OFFICE_PRINTER":
        this.type = HardwareType.OFFICE_PRINTER;
        break;
        case "DRIVE_THRU_DIRECTOR":
        this.type = HardwareType.DRIVE_THRU_DIRECTOR;
        break;
        case "OCU":
        this.type = HardwareType.OCU;
        break;
        case "PHONE":
        this.type = HardwareType.PHONE;
        break;
        case "CHEF":
        this.type = HardwareType.CHEF;
        break;
        case "PHU":
        this.type = HardwareType.PHU;
        break;
        case "DMB_SCREEN":
        this.type = HardwareType.DMB_SCREEN;
        break;
        case "DMB_CONTROLLER":
        this.type = HardwareType.DMB_CONTROLLER;
        break;
        case "KIOSK":
        this.type = HardwareType.KIOSK;
        break;
        case "VERIFONE":
        this.type = HardwareType.VERIFONE;
        break;
        case "ODMB_SCREEN":
        this.type = HardwareType.ODMB_SCREEN;
        break;
        case "ODMB_CONTROLLER":
        this.type = HardwareType.ODMB_CONTROLLER;
        break;
        default:
        this.type = HardwareType.DEFAULT;
        break;
    }
    }
/* ***************************************************************
|                         METHODS                                |
******************************************************************/
    public void setName(String name) {
        this.Name = new SimpleStringProperty(name);
}
    public void setIp(String ip) { this.Ip = new SimpleStringProperty(ip);    }
    public void setSubNet(String subNet){
        this.SubNet = new SimpleStringProperty(subNet);
    }

    public String getName() {
        return Name.get();
    }
    public String getIp() {
        return Ip.get();
    }
    public String getSubNet() {
        return SubNet.get();
    }
    public SimpleStringProperty getPropertyName() {
        return Name;
    }
    public SimpleStringProperty getPropertyIp() {
        return Ip;
    }
    public SimpleStringProperty getPropertySubNet() {
        return SubNet;
    }

    public void setTypeString(String input) {
        System.out.println(input);
        switch(input){
            case "TERMINAL":
                this.type = HardwareType.TERMINAL;
                break;
            case "RECEIPT_PRINTER":
                this.type = HardwareType.RECEIPT_PRINTER;
                break;
            case "KITCHEN_SCREEN":
                this.type = HardwareType.KITCHEN_SCREEN;
                break;
            case "OFFICE_COMPUTER":
                this.type = HardwareType.OFFICE_COMPUTER;
                break;
            case "OFFICE_PRINTER":
                this.type = HardwareType.OFFICE_PRINTER;
                break;
            case "DRIVE_THRU_DIRECTOR":
                this.type = HardwareType.DRIVE_THRU_DIRECTOR;
                break;
            case "OCU":
                this.type = HardwareType.OCU;
                break;
            case "PHONE":
                this.type = HardwareType.PHONE;
                break;
            case "CHEF":
                this.type = HardwareType.CHEF;
                break;
            case "PHU":
                this.type = HardwareType.PHU;
                break;
            case "DMB_SCREEN":
                this.type = HardwareType.DMB_SCREEN;
                break;
            case "DMB_CONTROLLER":
                this.type = HardwareType.DMB_CONTROLLER;
                break;
            case "KIOSK":
                this.type = HardwareType.KIOSK;
                break;
            case "VERIFONE":
                this.type = HardwareType.VERIFONE;
                break;
            case "ODMB_SCREEN":
                this.type = HardwareType.ODMB_SCREEN;
                break;
            case "ODMB_CONTROLLER":
                this.type = HardwareType.ODMB_CONTROLLER;
                break;
            default:
                this.type = HardwareType.DEFAULT;
                break;
            }
    }
    public String getTypeString(){
        String type_string;

        switch(type){
            case TERMINAL:
                type_string = "TERMINAL";
                break;
            case RECEIPT_PRINTER:
                type_string = "RECEIPT_PRINTER";
                break;
            case KITCHEN_SCREEN:
                type_string = "KITCHEN_SCREEN";
                break;
            case OFFICE_COMPUTER:
                type_string = "OFFICE_COMPUTER";
                break;
            case OFFICE_PRINTER:
                type_string = "OFFICE_PRINTER";
                break;
            case DRIVE_THRU_DIRECTOR:
                type_string = "DRIVE_THRU_DIRECTOR";
                break;
            case OCU:
                type_string = "OCU";
                break;
            case PHONE:
                type_string = "PHONE";
                break;
            case CHEF:
                type_string = "CHEF";
                break;
            case PHU:
                type_string = "PHU";
                break;
            case DMB_SCREEN:
                type_string = "DMB_SCREEN";
                break;
            case DMB_CONTROLLER:
                type_string = "DMB_CONTROLLER";
                break;
            case KIOSK:
                type_string = "KIOSK";
                break;
            case VERIFONE:
                type_string = "VERIFONE";
                break;
            case ODMB_SCREEN:
                type_string = "ODMB_SCREEN";
                break;
            case ODMB_CONTROLLER:
                type_string = "ODMB_CONTROLLER";
                break;
            default:
                type_string = "DEFAULT";
                break;
        }

        return type_string;
    }

    public void setType(HardwareType type){
        this.type = type;
    }
    public HardwareType getType(){
        if(type==null){
            type = HardwareType.DEFAULT;
        }
            return type;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "name='" + Name + '\'' +
                ", ip=" + Ip +
                ", subNet=" + SubNet +
                ", Type=" + type +
                '}';
    }

    /* ***************************************************************
    |                     HARDWARE TYPE ENUM                          |
    ******************************************************************/

    public enum HardwareType{
        TERMINAL,RECEIPT_PRINTER,
        KITCHEN_SCREEN,OFFICE_COMPUTER,
        OFFICE_PRINTER,DRIVE_THRU_DIRECTOR,
        OCU,PHONE,CHEF,PHU,DMB_SCREEN,
        DMB_CONTROLLER,KIOSK,VERIFONE,
        ODMB_SCREEN,ODMB_CONTROLLER,DEFAULT;
    }
}

