package org.itlabel.cabinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
