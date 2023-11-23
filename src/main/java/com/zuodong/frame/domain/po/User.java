package com.zuodong.frame.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zuodong
 * @create 2023-11-23 20:41
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**自增ID*/
    private Long id;
    /**用户ID*/
    private String userId;
    /**用户昵称*/
    private String userNickname;
    /**用户头像*/
    private String userHead;
    /**用户密码*/
    private String userPassword;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}
