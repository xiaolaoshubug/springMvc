package com.oay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*********************************************************
 * @Package: com.oay.controller
 * @ClassName: ResuFulController.java
 * @Description：描述
 * -----------------------------------
 * @author：ouay
 * @Version：v1.0
 * @Date: 2020-11-30
 *********************************************************/

@Controller
public class RestFulController {

    //  映射访问路径
    @RequestMapping("/index/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable String p2, Model model) {
        String result = p1 + p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果：" + result);
        //  返回视图位置
        return "test";
    }

    @RequestMapping(value = "/index2", method = {RequestMethod.GET, RequestMethod.POST})
    public String index2(Model model) {
        model.addAttribute("msg", "get请求");
        return "test";
    }

    //  转发--->重定向    通过SpringMVC来实现转发和重定向 - 无需视图解析器
    @RequestMapping("/test1/u")
    public String test1() {
        return "/index.jsp";
    }

    //  转发--->重定向    通过SpringMVC来实现转发和重定向 - 有视图解析器
    @RequestMapping("test2/u")
    public String test2() {
        return "redirect:/index.jsp";
        //return "redirect:hello.do"; //hello.do为另一个请求/
    }


}
