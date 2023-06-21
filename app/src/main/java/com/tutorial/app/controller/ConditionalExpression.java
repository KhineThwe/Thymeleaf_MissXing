package com.tutorial.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import domain.Address;
import domain.Person;

@Controller
public class ConditionalExpression {
     @GetMapping("/conditionalExpression")
    public String conditionalExpression(Model model){
        Address address = new Address("1000 N 10th ST","52556");
        Person person1 = new Person(1,"Khine Zar Thwe",address);
        Person person2 = new Person(2,"Thwe",null);
        model.addAttribute("person1", person1);
        model.addAttribute("person2", person2);

        model.addAttribute("gender", "M");
        return "conditionalExpression";
    }
}
