package one.com.info.test;

import one.com.info.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:one/bean.xml"})
public class MainTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("one/bean.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.getUserName("");
    }


    @Test
    public void test2(){
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("one/bean.xml"));
        IUserService userService = (IUserService) xmlBeanFactory.getBean("userService");
        userService.getUserName("");
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("one/bean.xml");
        IUserService userService = applicationContext.getBean("userService",IUserService.class);
        userService.getUserName("");
    }


    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("one/bean.xml");
        IUserService userService = applicationContext.getBean("userFromFactory",IUserService.class);
        System.out.println(userService);
        userService.getUserName("");
    }
}
