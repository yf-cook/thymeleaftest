package com.example.springthymeleaf.controller;

import com.example.springthymeleaf.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class WebController {

    @RequestMapping(value ={"/","index"})
    public String index(ModelMap modelMap){
        Book book = new Book();
        book.setName("娃哈哈");
        modelMap.addAttribute("book",book);
        modelMap.addAttribute("name","张三");
        Date date = new Date();
        modelMap.addAttribute("today",date.getTime());
        System.out.println(book.getName());
        return "index";
    }

    @RequestMapping(value = "/main")
    public String mainText(){
        return "main";
    }
}
