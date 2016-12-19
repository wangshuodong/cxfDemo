package com.wangsd.cxfDemo;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/19.
 */
@WebService(endpointInterface= "com.wangsd.cxfDemo.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    Map<Integer, User> users = new LinkedHashMap<Integer, User>();

    public String sayHi(@WebParam(name = "text") String text) {
        return "Hello,"+text;
    }

    public String sayHiToUser(User user) {
        users.put(users.size()+1, user);
        return "Hello,"+user.getName();
    }

    public String[] SayHiToUserList(List<User> userList) {
        String[] result = new String[userList.size()];
        int i = 0;
        for(User u:userList){
            result[i] = "Hello " + u.getName();
            i++;
        }
        return result;
    }
}
