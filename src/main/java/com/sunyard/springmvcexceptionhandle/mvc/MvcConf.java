package com.sunyard.springmvcexceptionhandle.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lww on 2019/1/15.
 */
@Configuration
public class MvcConf {

    @Bean
    public MyHandlerExceptionResolver myHandlerExceptionResolver(){
        return new MyHandlerExceptionResolver();
    }
}
