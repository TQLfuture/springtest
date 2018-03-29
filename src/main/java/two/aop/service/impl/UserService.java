package two.aop.service.impl;

import two.aop.service.IUserService;

public class UserService implements IUserService {
    public void add() {
        System.out.println("add");
    }

    public void update() {
        System.out.println("update");
    }

    public void delete() {
        System.out.println("delete");
    }
}
