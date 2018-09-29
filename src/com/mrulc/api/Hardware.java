package com.mrulc.api;

import javafx.beans.property.SimpleStringProperty;

import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hardware {

    private String name;
    private InetAddress ip;
    private InetAddress subNet;

    private SimpleStringProperty sspName;
    private SimpleStringProperty sspIp;
    private SimpleStringProperty sspSubNet;


/* *****************************************************************
                           CONSTRUCTOR
 ***************************************************************** */
    public Hardware(String name, String ip, String subNet) throws UnknownHostException{
         this.name = name;
         this.ip = InetAddress.getByName(ip);
         this.subNet = InetAddress.getByName(subNet);
         this.sspName = new SimpleStringProperty(name);
         this.sspIp = new SimpleStringProperty(ip);
         this.sspSubNet = new SimpleStringProperty(subNet);
}
/* *************************************************************** */

    public void setName(String name) {
        this.name = name;
        this.sspName = new SimpleStringProperty(name);
}

    public void setIp(String ip) throws UnknownHostException {
        this.ip = InetAddress.getByName(ip);
        this.sspIp = new SimpleStringProperty(ip);
    }

    public void setSubNet(String subNet) throws UnknownHostException{
        this.subNet = InetAddress.getByName(subNet);
        this.sspSubNet = new SimpleStringProperty(subNet);
    }

    public String getName() {
        return name;
    }

    public InetAddress getIp() {

        return ip;
    }

    public InetAddress getSubNet() {
        return subNet;
    }


    public SimpleStringProperty getNameProperty() {
        return sspName;
    }

    public SimpleStringProperty getIpProperty() {

        return sspIp;
    }

    public SimpleStringProperty getSubNetProperty() {
        return sspSubNet;
    }







}
