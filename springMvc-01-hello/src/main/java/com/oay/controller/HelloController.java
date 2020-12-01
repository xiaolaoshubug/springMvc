package com.oay.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*********************************************************
 * @Package: com.oay.controller
 * @ClassName: HelloController.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-30
 *********************************************************/
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //  创建视图解释器
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "hello,SpringMcv....");
        mv.setViewName("hello");
        return mv;
    }
}
