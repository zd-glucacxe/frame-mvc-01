package com.zuodong.frame.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zuodong
 * @create 2023-11-23 21:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {

    /**用户ID*/
    private String userId;
    /**用户昵称*/
    private String userNickname;
    /**创建时间*/
    private Date createTime;
}
