package com.tutorial.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import domain.Address;
import domain.Person;

@Controller
public class SimpleExpressionController {
    // @GetMapping("/simpleExpression")
    // public String simpleExpression(Model model){
    //     Address address = new Address("1000 N 10th ST","52556");
    //     Person person = new Person(1,"Khine Zar Thwe",address);
    //     model.addAttribute("person", person);
    //     return "simpleExpression";
    // }
}
