package one.com.info.serviceimpl;

import one.com.info.pojo.User;
import one.com.info.service.IUserService;

public class UserService implements IUserService {

    private User user;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




    public void getUserName(String name) {
        //System.out.println("username =" + user.getUserName());
        System.out.println("hello name");
    }
}
