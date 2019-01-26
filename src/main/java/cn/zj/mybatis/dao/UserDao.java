package cn.zj.mybatis.dao;

import cn.zj.mybatis.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();

    /**
     * 添加数据
     *
     * @param user
     */
    void insert(User user);

    /**
     * 删除
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * 修改
     *
     * @param user
     */
    void updateById(User user);

    /**
     * 查询数据数
     *
     * @return
     */
    int findCount();

    /**
     * 通过id查询
     * @return
     */
    User findById(int id);

    /**
     * 模糊查询
     * @return
     */
    List<User> findByName(String username);

    /**
     * 添加并获取id
     * @param user
     */
    void add2Id(User user);
}
