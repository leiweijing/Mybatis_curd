package cn.louie.test;

import cn.louie.dao.UserDao;
import cn.louie.entity.User;
import cn.louie.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDao();

//        User user = new User();
//        user.setId(3);
//        user.setName("candy");
//        user.setPassword("111111");
//        user.setNumber("101");
//        userDao.updateUser(user);
//        userDao.deleteById(3);
           userDao.selectAll();

    }
}



