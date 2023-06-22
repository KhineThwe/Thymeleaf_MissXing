package com.tutorial.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.Employee;

@Controller
public class EmployeeController {
    @GetMapping({"/","/addEmp"})
    public String getEmpForm(@ModelAttribute("emp") Employee emp){
        return "empForm";
    }

    @PostMapping("/addEmp")
    public String saveEmp(@Valid @ModelAttribute("emp") Employee emp,BindingResult result,RedirectAttributes ra){
        //save to DB
        if(result.hasErrors()){
            System.out.print("Hey Error");
            return "empForm";
        }
        ra.addFlashAttribute("savedEmployee", emp);
        System.out.print("Hey Error");
        return "redirect:/detail";
    }

    @GetMapping("/detail")
    public String detail(){
        return "empDetails";
    }
}
