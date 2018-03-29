package one.com.info.dao;

import one.com.info.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserDao  extends BaseDao implements IUserDao {

   public User getUser(HashMap<String,Object> hashMap){
       User user = getSqlSessionTemplate().selectOne("selectUserById",hashMap);
       return user;
   }
}
