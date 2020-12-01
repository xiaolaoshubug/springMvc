package com.oay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*********************************************************
 * @Package: com.oay.controller
 * @ClassName: HelloController.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-30
 *********************************************************/
@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("msg", "hello,SpringMVC");
        return "hello";
    }
}
