package cn.louie.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {

    /**
     * 创建 SqlSessionFactory
     * 通过配置文件创建，是一个SqlSession工厂类
     * @return
     * @throws IOException
     */
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        return factory;
    }

    /**
     * 获得 SqlSession
     * SqlSession通过ID找到对应的sql语句，执行sql语句
     * @return
     * @throws IOException
     */
    public static SqlSession getSession() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }
}
