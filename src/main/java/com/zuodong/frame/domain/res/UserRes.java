package com.zuodong.frame.domain.res;

import com.zuodong.frame.common.Result;
import com.zuodong.frame.domain.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *  返回结果
 *
 * @author zuodong
 * @create 2023-11-23 21:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRes {

    private Result result;
    private List<UserVO> userVOList;
}
