package com.demo.mybatis.mapper;

import com.demo.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper  {

    /**
     * 通过id返回用户
     * @method selectUserById
     * @date 18:54 2019-02-10
     * @auther wayne
     * @param [id]
     * @return com.demo.mybatis.entity.User
     */
    public User selectUserById(long id) throws Exception;

    /**
     * 新增用户
     * @method insertUser
     * @date 19:40 2019-02-10
     * @auther wayne
     * @param [user]
     * @return int
     */
    public int insertUser(User user) throws Exception;

}
