package com.sunyard.springmvcexceptionhandle.controller;

import com.sunyard.springmvcexceptionhandle.exception.CustomException;
import com.sunyard.springmvcexceptionhandle.exception.DataAccessException;
import com.sunyard.springmvcexceptionhandle.exception.OrderNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lww on 2019/1/15.
 */
@RestController
public class OrderController {
    /*
    参数传入controller的三种方式
    1.request中获取
    2.@RequestParam,默认为必须
    3.直接在方法中加入同名参数
     */
    @RequestMapping("/showorder")
    public ModelAndView showOrder(@RequestParam(name="id",required = false) String id, Model model){
//        String id=request.getParameter("id");
        if(id==null){
            throw new OrderNotFoundException();
        }

        try{
            Integer.parseInt(id);
        }catch (NumberFormatException e){
            throw new CustomException();
        }
        if("0".equals(id)){
            throw new DataAccessException();
        }
        model.addAttribute("result","order detail:"+id);
        return new ModelAndView("test");
    }
}
