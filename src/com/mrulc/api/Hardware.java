package com.mrulc.api;

import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hardware {

    private String name;
    private InetAddress ip;
    private InetAddress subNet;


/* *****************************************************************
                           CONSTRUCTOR
 ***************************************************************** */
    public Hardware(String name, String ip, String subNet) throws UnknownHostException{
         this.name = name;
         this.ip = InetAddress.getByName(ip);
         this.subNet = InetAddress.getByName(subNet);
}
/* *************************************************************** */

    public void setName(String name) {
        this.name = name;
}

    public void setIp(String ip) throws UnknownHostException {
        this.ip = InetAddress.getByName(ip);
    }

    public void setSubNet(String subNet) throws UnknownHostException{
        this.subNet = InetAddress.getByName(subNet);
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










}
