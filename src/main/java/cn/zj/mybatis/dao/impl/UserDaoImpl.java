package cn.zj.mybatis.dao.impl;

import cn.zj.mybatis.dao.UserDao;
import cn.zj.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public List<User> findAll() {

        try {
            InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");

            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory build = builder.build(is);
            SqlSession sqlSession = build.openSession();

            List<User> users = sqlSession.selectList("cn.zj.mybatis.dao.UserDao.findAll");

            sqlSession.close();
            is.close();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void insert(User user) {

    }

    public void deleteById(int id) {

    }

    public void updateById(User user) {

    }

    public int findCount() {
        return 0;
    }

    public User findById(int id) {
        return null;
    }

    public List<User> findByName(String username) {
        return null;
    }

    public void add2Id(User user) {

    }
}
