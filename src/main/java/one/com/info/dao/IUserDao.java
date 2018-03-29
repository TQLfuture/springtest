package one.com.info.dao;

import one.com.info.pojo.User;

import java.util.HashMap;

public interface IUserDao  {

    public User getUser(HashMap<String,Object> hashMap);

}
