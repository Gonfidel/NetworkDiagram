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

    public void setType(HardwareType type){
        this.type = type;
    }
    public HardwareType getType(){ if(type==null){ type = HardwareType.DEFAULT;  }
        return type;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "name='" + Name + '\'' +
                ", ip=" + Ip +
                ", subNet=" + SubNet +
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
