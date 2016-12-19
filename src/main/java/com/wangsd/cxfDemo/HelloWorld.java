package com.wangsd.cxfDemo;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Administrator on 2016/12/19.
 */
@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);
    String[] SayHiToUserList(List<User> userList);
}
