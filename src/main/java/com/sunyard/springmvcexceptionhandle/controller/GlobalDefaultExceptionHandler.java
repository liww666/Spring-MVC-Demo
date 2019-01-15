package com.sunyard.springmvcexceptionhandle.controller;

import com.sunyard.springmvcexceptionhandle.exception.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局的ExceptionHandler
 * Created by lww on 2019/1/15.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(DataAccessException.class)
    public String databaseError(){
        return "databaseError";
    }
}
