package com.itdr.controller;

import com.itdr.service.IndexService;
import com.itdr.service.impl.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
//    private static ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    @Autowired
    private IndexService indexService;


    //模拟转账
    public String zz(String aname,String bname,int money){
        String s = indexService.tm(aname,bname,money);
        indexService.tm2(aname,bname,money);
        return s;
    }

    public void zz2(String aname,String bname,int money){
        indexService.tm2(aname,bname,money);
    }
}
