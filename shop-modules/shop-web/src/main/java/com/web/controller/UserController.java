package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tqj
 * @Description
 * @create 2019/4/30 9:07
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("go")
    public void go(){
        System.out.println(66666);
    }
}
