package org.itlabel.cabinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//register as controller in application
@Controller
public class TestController {


    //mapping to host.com/path
    @RequestMapping("/test")
    public String test(Model model) {

        //params will passed
        model.addAttribute("name", "Example");

        //path/name of the view in resources/templates
        return "test";
    }
}
