package com.zuodong.frame.dao;

import com.zuodong.frame.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zuodong
 * @create 2023-11-23 20:49
 * 用户的dao操作
 */
@Mapper
public interface IUserDao {

    /**
     * 查询用户列表
     * @return
     */
    List<User> queryUserList();
}
