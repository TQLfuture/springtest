package two.aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import two.aop.service.ILogService;
import two.aop.service.IUserService;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:two/beans.xml"})*/
public class MainTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("two/beans.xml");
        ILogService logService = (ILogService) applicationContext.getBean("logService");
        logService.after();
    }

    @Test
    public void test2()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("two/beans2.xml");
        IUserService userService = applicationContext.getBean("userService",IUserService.class);
        userService.add();
    }

    @Test
    public void test3()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("two/beans3.xml");
        IUserService userService = applicationContext.getBean("userService",IUserService.class);
        userService.add();
    }
}
