package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Vacancy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class StudentCabinetController {

    @RequestMapping("/profile")
    public String showProfilePage() {
        return "profile";
    }

    @RequestMapping("/tasks")
    public String showTasksPage() {
        return "tasks";
    }

    @RequestMapping("/level")
    public String showLevelPage() {
        return "level";
    }

    @RequestMapping("/chat")
    public String showChatPage() {
        return "chat";
    }

//    @RequestMapping("/career")
//    public ModelAndView showCareerPage() {
//        return new ModelAndView("career","vacancy", new Vacancy("Google",150000));
//    }

}
