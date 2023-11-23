package com.zuodong.frame.service.impl;

import com.zuodong.frame.dao.IUserDao;
import com.zuodong.frame.domain.po.User;
import com.zuodong.frame.domain.vo.UserVO;
import com.zuodong.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *  用户服务实现
 *
 * @author zuodong
 * @create 2023-11-23 21:26
 */
@Slf4j
@Service
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public List<UserVO> queryUserList() {

        List<UserVO> userVOList = new ArrayList<>();
        List<User> userList = userDao.queryUserList();

        for (User user : userList) {
            UserVO userVO = new UserVO();
            userVO.setUserId(user.getUserId());
            userVO.setUserNickname(user.getUserNickname());
            userVO.setCreateTime(user.getCreateTime());

            userVOList.add(userVO);
        }

        return userVOList;
    }
}
