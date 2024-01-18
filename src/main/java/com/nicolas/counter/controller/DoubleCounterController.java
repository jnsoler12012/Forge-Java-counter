package com.nicolas.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class DoubleCounterController {
     @RequestMapping(value = "/double", method = RequestMethod.GET)
    public String index(HttpSession session){
        
        Integer count = (Integer) session.getAttribute("counter");

        if(count == null){
            session.setAttribute("counter", 0);
        }
        else{
            session.setAttribute("counter", count + 2);
        }


        System.out.println(count);

        return "counterPlusTwo";
    }
}
