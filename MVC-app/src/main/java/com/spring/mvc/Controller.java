package com.spring.mvc;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/home")
    public String firstView(){
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmp(Model model){
        model.addAttribute("employee", new Employee());
        return "askView";
    }


    @RequestMapping("/showDetails")
    public String showEmp(@ModelAttribute("employee") Employee emp){


        return "showView";
    }
}
