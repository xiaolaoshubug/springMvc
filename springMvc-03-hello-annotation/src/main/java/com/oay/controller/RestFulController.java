package com.oay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*********************************************************
 * @Package: com.oay.controller
 * @ClassName: ResuFulController.java
 * @Description������
 * -----------------------------------
 * @author��ouay
 * @Version��v1.0
 * @Date: 2020-11-30
 *********************************************************/

@Controller
public class RestFulController {

    //  ӳ�����·��
    @RequestMapping("/index/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable String p2, Model model) {
        String result = p1 + p2;
        //Spring MVC���Զ�ʵ����һ��Model������������ͼ�д�ֵ
        model.addAttribute("msg", "�����" + result);
        //  ������ͼλ��
        return "test";
    }

    @RequestMapping(value = "/index2", method = {RequestMethod.GET, RequestMethod.POST})
    public String index2(Model model) {
        model.addAttribute("msg", "get����");
        return "test";
    }

    //  ת��--->�ض���    ͨ��SpringMVC��ʵ��ת�����ض��� - ������ͼ������
    @RequestMapping("/test1/u")
    public String test1() {
        return "/index.jsp";
    }

    //  ת��--->�ض���    ͨ��SpringMVC��ʵ��ת�����ض��� - ����ͼ������
    @RequestMapping("test2/u")
    public String test2() {
        return "redirect:/index.jsp";
        //return "redirect:hello.do"; //hello.doΪ��һ������/
    }


}
