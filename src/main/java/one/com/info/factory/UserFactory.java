package one.com.info.factory;

import one.com.info.service.IUserService;
import one.com.info.serviceimpl.UserService;

public class UserFactory {

    private static IUserService userService = new UserService();


    public IUserService getUserServiceIntance(){
        return userService;
    }
}
