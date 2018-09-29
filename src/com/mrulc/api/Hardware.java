package com.mrulc.api;

import javafx.beans.property.SimpleStringProperty;

import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hardware {

    private String name;
    private InetAddress ip;
    private InetAddress subNet;

    //private SimpleStringProperty sspName;
    //private SimpleStringProperty sspIp;
    //private SimpleStringProperty sspSubNet;


/* *****************************************************************
                           CONSTRUCTOR
 ***************************************************************** */

    public Hardware(){

    }
    public Hardware(String name, String ip, String subNet) throws UnknownHostException{
         this.name = name;
         this.ip = InetAddress.getByName(ip);
         this.subNet = InetAddress.getByName(subNet);
        // this.sspName.set(name);
        // this.sspIp.set(ip);
        // this.sspSubNet.set(subNet);
}
/* *************************************************************** */

    public void setName(String name) {
        this.name = name;
        //this.sspName.set(name);
}

    public void setIp(String ip) throws UnknownHostException {
        this.ip = InetAddress.getByName(ip);
        //this.sspIp.set(ip);
    }

    public void setSubNet(String subNet) throws UnknownHostException{
        this.subNet = InetAddress.getByName(subNet);
        //this.sspSubNet.set(subNet);
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


   // public SimpleStringProperty getNameProperty() {
       // return sspName;
   // }

   // public SimpleStringProperty getIpProperty() {

      //  return sspIp;
   // }

    //public SimpleStringProperty getSubNetProperty() {
        //return sspSubNet;
    //}


    @Override
    public String toString() {
        return "Hardware{" +
                "name='" + name + '\'' +
                ", ip=" + ip +
                ", subNet=" + subNet +
                '}';
    }
}
