package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class StudentCabinetController {
    private List<Task> list = Arrays.asList(
            new Task(0l, 0, "Набери грибов", "Возьми корзинку, ножик и едь в лес.", "Новое"),
            new Task(1l, 1, "Собери банку сушеных комаров", "Возьми трехлитровую банку и едь на болото.",
                    "Новое"),
            new Task(2l, 2, "Сделай коллаж", "Возьми грибы, комаров и лист бумаги.", "Новое")
    );

    @RequestMapping("/profile")
    public String showProfilePage() {
        return "profile";
    }

    @RequestMapping("/tasks")
    public String showTasksPage(Model model) {
        model.addAttribute("tasks", list);
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

    @RequestMapping(value = "/task/{number}", method = GET)
    public String showCurrentTaskPage(Model model, @PathVariable("number") Integer number) {
        model.addAttribute("task", list.get(number));
        return "task";
    }

    @RequestMapping(value = "/task/{number}", method = POST)
    public String showCurrentTaskPage(@RequestParam("status") String status, Model model, @PathVariable("number") int number) {
        if (status!= null && !status.isEmpty()) {
            Task task = new Task();
            task = list.get(number);
            task.setStatus(status);
            list.set(number, task);
        }
        return "redirect:/tasks";
    }
}
