package com.sunyard.springmvcexceptionhandle.mvc;

import com.sunyard.springmvcexceptionhandle.exception.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义HandlerExceptionResolver
 * Created by lww on 2019/1/15.
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if(e instanceof CustomException){
            return new ModelAndView("customexception");
        }
        return null;
    }
}
