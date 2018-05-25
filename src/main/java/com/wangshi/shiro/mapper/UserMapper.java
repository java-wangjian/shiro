/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.shiro.mapper;

import com.wangshi.shiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wangjian
 * Date: 18-5-25
 * Time: 下午2:01
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
