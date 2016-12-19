package com.wangsd.jdkDemo;

import javax.jws.WebService;

/**
 * Created by Administrator on 2016/12/19.
 */
@WebService
public class WebServiceImpl implements WebServiceI {
    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello " + name);
        return "sayHello " + name;
    }

    @Override
    public String save(String name, String pwd) {
        System.out.println("WebService save " + name + "， " + pwd);
        return "save Success";
    }
}
