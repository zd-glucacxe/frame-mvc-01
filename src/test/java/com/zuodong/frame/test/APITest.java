package com.zuodong.frame.test;

import com.alibaba.fastjson.JSON;
import com.zuodong.frame.domain.vo.UserVO;
import com.zuodong.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zuodong
 * @create 2023-11-23 20:32
 */

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class APITest {

    @Resource
    private IUserService userService;

    @Test
    public void test_queryUserList() {
        List<UserVO> userVOList = userService.queryUserList();
        log.info("测试结果：{}" + JSON.toJSONString(userVOList));
    }


}
