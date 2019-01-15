package com.sunyard.springmvcexceptionhandle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常逻辑view转物理view
 * Created by lww on 2019/1/15.
 */
@RestController
public class ExceptionController {
    @RequestMapping("/databaseError")
    public String databaseError(){
        return "databaseError";
    }

    @RequestMapping("/customexception")
    public String customexception(){
        return "自定义异常";
    }
}
