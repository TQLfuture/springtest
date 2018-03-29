package one.com.info.test;

import one.com.info.dao.IUserDao;
import one.com.info.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:one/applicationContext.xml"})
public class MainTest2 {

    @Autowired
    private IUserDao userDao;

    @Test
    public void test(){
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("id",311);
        User user = userDao.getUser(hashMap);

        System.out.println(user.getAge() +"  == " + user.getUserName());
    }
}
