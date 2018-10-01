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

    public void setTypeString(String type) {
        switch(type.trim()){
            case "TERMINAL":
                this.type = HardwareType.TERMINAL;
            case "RECEIPT_PRINTER":
                this.type = HardwareType.RECEIPT_PRINTER;
            case "KITCHEN_SCREEN":
                this.type = HardwareType.KITCHEN_SCREEN;
            case "OFFICE_COMPUTER":
                this.type = HardwareType.OFFICE_COMPUTER;
            case "OFFICE_PRINTER":
                this.type = HardwareType.OFFICE_PRINTER;
            case "DRIVE_THRU_DIRECTOR":
                this.type = HardwareType.DRIVE_THRU_DIRECTOR;
            case "OCU":
                this.type = HardwareType.OCU;
            case "PHONE":
                this.type = HardwareType.PHONE;
            case "CHEF":
                this.type = HardwareType.CHEF;
            case "PHU":
                this.type = HardwareType.PHU;
            case "DMB_SCREEN":
                this.type = HardwareType.DMB_SCREEN;
            case "DMB_CONTROLLER":
                this.type = HardwareType.DMB_CONTROLLER;
            case "KIOSK":
                this.type = HardwareType.KIOSK;
            case "VERIFONE":
                this.type = HardwareType.VERIFONE;
            case "ODMB_SCREEN":
                this.type = HardwareType.ODMB_SCREEN;
            case "ODMB_CONTROLLER":
                this.type = HardwareType.ODMB_CONTROLLER;
            default:
                this.type = HardwareType.DEFAULT;
            }
    }
    public String getTypeString(){
        String type_string;

        switch(type){
            case TERMINAL:
                type_string = "TERMINAL";
            case RECEIPT_PRINTER:
                type_string = "RECEIPT_PRINTER";
            case KITCHEN_SCREEN:
                type_string = "KITCHEN_SCREEN";
            case OFFICE_COMPUTER:
                type_string = "OFFICE_COMPUTER";
            case OFFICE_PRINTER:
                type_string = "OFFICE_PRINTER";
            case DRIVE_THRU_DIRECTOR:
                type_string = "DRIVE_THRU_DIRECTOR";
            case OCU:
                type_string = "OCU";
            case PHONE:
                type_string = "PHONE";
            case CHEF:
                type_string = "CHEF";
            case PHU:
                type_string = "PHU";
            case DMB_SCREEN:
                type_string = "DMB_SCREEN";
            case DMB_CONTROLLER:
                type_string = "DMB_CONTROLLER";
            case KIOSK:
                type_string = "KIOSK";
            case VERIFONE:
                type_string = "VERIFONE";;
            case ODMB_SCREEN:
                type_string = "ODMB_SCREEN";
            case ODMB_CONTROLLER:
                type_string = "ODMB_CONTROLLER";
            default:
                type_string = "DEFAULT";
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

