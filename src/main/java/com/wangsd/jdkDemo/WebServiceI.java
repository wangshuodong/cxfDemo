package com.wangsd.jdkDemo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Administrator on 2016/12/19.
 */
@WebService
public interface WebServiceI {
    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name, String pwd);
}
