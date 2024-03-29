package com.hy.hotel.mapper;

import com.hy.hotel.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 登录
     */
    int login(UserLogin userLogin);

    /**
     * 修改密码
     */
    int updatePassword(UserLogin userLogin);

    /**
     * 注册
     */
    int insertUser(UserLogin userLogin);
}
