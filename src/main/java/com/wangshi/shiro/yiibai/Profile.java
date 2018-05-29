/*
 * ==============================================================
 * Copyright (c) 2012 ~ 2018. anyuncloud.com All rights reserved.
 *                                           Created by wangjian
 * ==============================================================
 */

package com.wangshi.shiro.yiibai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by wangjian
 * Date: 18-5-29
 * Time: 上午11:04
 */
public class Profile {

    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor");
    }

    public void printAge(){
        System.out.println("Age : " + student.getAge());
    }

    public void printName(){
        System.out.println("Name : " + student.getName());
    }
}
