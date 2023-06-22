package com.tutorial.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import domain.Person;


@Controller
public class IterationExpressionController {
    // @GetMapping("/iterationExpression")
    // public String iterationExpression(Model model){
    //     List<Person> people = Arrays.asList(
    //         new Person(91,"Josh"),
    //         new Person(92,"Khine"),
    //         new Person(93,"Zar")
    //     );
    //     model.addAttribute("people",people );
    //     return "iterationExpression";
    // }

}
