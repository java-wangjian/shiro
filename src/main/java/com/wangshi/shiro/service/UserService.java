/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.shiro.service;

import com.wangshi.shiro.model.User;

/**
 * Created by wangjian
 * Date: 18-5-25
 * Time: 下午2:03
 */
public interface UserService {
    User findByUsername(String username);
}
