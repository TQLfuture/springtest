package three.proxy.test;

import org.junit.Test;
import three.proxy.cglibproxy.CglibProxy;
import three.proxy.jdkproxy.JdkProxy;
import three.proxy.service.IUserService;
import three.proxy.service.impl.UserServiceImpl;

public class MainTest {

    @Test
    public void test1(){
        IUserService userService = new UserServiceImpl();
        IUserService  proxyService = (IUserService) new JdkProxy(userService).getProxyTarget();
        proxyService.add();
    }


    @Test
    public void test2(){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl proxyService = (UserServiceImpl) new CglibProxy(userService).getCglibProxy();
        proxyService.add();
    }
}
