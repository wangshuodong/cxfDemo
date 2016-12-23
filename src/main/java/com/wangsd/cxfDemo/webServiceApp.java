package com.wangsd.cxfDemo;

import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2016/12/19.
 */
public class webServiceApp {
    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorldImpl implementor = new HelloWorldImpl();
        String address = "http://192.168.205.74:9999/helloWorld";
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}
