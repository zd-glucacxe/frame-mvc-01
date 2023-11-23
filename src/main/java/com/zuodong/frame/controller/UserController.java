package com.zuodong.frame.controller;

import com.zuodong.frame.common.Result;
import com.zuodong.frame.domain.res.UserRes;
import com.zuodong.frame.domain.vo.UserVO;
import com.zuodong.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zuodong
 * @create 2023-11-23 21:35
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * http://localhost:8099/queryUserInfo
     */
    @RequestMapping("queryUserInfo")
    public UserRes queryUserInfo() {
        try {
            log.info("查询用户信息");
            List<UserVO> userVOList = userService.queryUserList();
            return UserRes.builder().userVOList(userVOList).result(Result.buildSuccess()).build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return UserRes.builder().result(Result.buildFail()).build();
        }
    }

}
