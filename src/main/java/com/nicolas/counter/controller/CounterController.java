package com.nicolas.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    @RequestMapping(value = "/counter", method = RequestMethod.GET)
    public String counter(HttpSession session, Model model) {

        Integer count = (Integer) session.getAttribute("counter");

        model.addAttribute("counter", count);

        System.out.println(count);

        return "counter";
    }

    @RequestMapping(value = "/counter", method = RequestMethod.POST)
    public String resetCounter(HttpSession session, Model model) {
        System.out.println("asdassssssssssssadasd");

        session.setAttribute("counter", 0);
    
        return "counter";
    }
}
