package com.mrulc.api;

import javafx.beans.property.SimpleStringProperty;

import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hardware {

    private SimpleStringProperty sspName;
    private SimpleStringProperty sspIp;
    private SimpleStringProperty sspSubNet;


/* *****************************************************************
                           CONSTRUCTOR
 ***************************************************************** */

    public Hardware(){

    }
    public Hardware(String name, String ip, String subNet) throws UnknownHostException{
         this.sspName.set(name);
         this.sspIp.set(ip);
         this.sspSubNet.set(subNet);
}
/* *************************************************************** */

    public void setName(String name) {
        this.sspName = new SimpleStringProperty(name);
}

    public void setIp(String ip) throws UnknownHostException {
        this.sspIp = new SimpleStringProperty(ip);
    }

    public void setSubNet(String subNet) throws UnknownHostException{
        this.sspSubNet = new SimpleStringProperty(subNet);
    }

    public SimpleStringProperty getName() {
        return sspName;
    }

    public SimpleStringProperty getIp() {
        return sspIp;
    }

    public SimpleStringProperty getSubNet() {
        return sspSubNet;
    }




    @Override
    public String toString() {
        return "Hardware{" +
                "name='" + sspName + '\'' +
                ", ip=" + sspIp +
                ", subNet=" + sspSubNet +
                '}';
    }
}
