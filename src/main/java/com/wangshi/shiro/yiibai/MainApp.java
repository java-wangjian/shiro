/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.shiro.yiibai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangjian
 * Date: 18-5-29
 * Time: 上午11:07
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printName();
        profile.printAge();
        System.out.println();
    }
}
