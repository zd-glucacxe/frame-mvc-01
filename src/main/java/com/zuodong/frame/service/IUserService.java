package com.zuodong.frame.service;

import com.zuodong.frame.domain.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zuodong
 * @create 2023-11-23 21:22
 */


public interface IUserService {
    /**
     * 查询用户前端返回信息
     * @return
     */

    List<UserVO> queryUserList();


}
