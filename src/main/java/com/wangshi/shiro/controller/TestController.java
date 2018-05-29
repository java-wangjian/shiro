/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.shiro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian
 * Date: 18-5-25
 * Time: 下午5:57
 */

@RestController
public class TestController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

//    @RequestMapping("/index")
//    public String
}
