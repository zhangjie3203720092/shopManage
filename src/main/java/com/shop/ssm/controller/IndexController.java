package com.shop.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class IndexController {
    @RequestMapping("/zking/zking.shtml")
    public String toIndex(){
        return "test/index";
    }

    @RequestMapping("/i18n")
    public String toI18n(String locale, HttpSession session){
        if (null != locale && "zh".equals(locale)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.CHINA);
        }
        else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }
        return "index";
    }
}
