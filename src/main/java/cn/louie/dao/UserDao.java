package cn.louie.dao;

import cn.louie.entity.User;
import cn.louie.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDao {

    public User findById(int id) throws IOException {
        SqlSession session = MyBatisUtils.getSession();
        User user = session.selectOne("cn.louie.entity.User.findById", id);
        System.out.println("user:"+user.toString());
        session.close();
        return user;
    }

    public int addUser(User user) throws IOException {
        SqlSession session = MyBatisUtils.getSession();
        int num = session.insert("cn.louie.entity.User.addUser", user);
        System.out.println("新增"+num+"条成功！");
        session.commit();
        session.close();
        return num;
    }

    public int updateUser(User user) throws IOException {
        SqlSession session = MyBatisUtils.getSession();
        int num = session.insert("cn.louie.entity.User.updateUser", user);
        System.out.println("更新"+num+"条成功！");
        session.commit();
        session.close();
        return num;
    }

    public int deleteById(int id) throws IOException {
        SqlSession session = MyBatisUtils.getSession();
        int num = session.insert("cn.louie.entity.User.deleteById", id);
        System.out.println("删除"+num+"条成功！");
        session.commit();
        session.close();
        return num;
    }

    public List<User> selectAll() throws IOException {
        SqlSession session = MyBatisUtils.getSession();
        List<User> list = session.selectList("cn.louie.entity.User.selectAll");
        System.out.println(list);
        session.close();
        return list;
    }



}
