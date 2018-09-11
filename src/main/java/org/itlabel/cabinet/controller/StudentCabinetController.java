package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class StudentCabinetController {
    private LinkedList<Task> list = new LinkedList();

    @RequestMapping("/profile")
    public String showProfilePage() {
        return "profile";
    }

    @RequestMapping("/tasks")
    public String showTasksPage(Model model) {
        Task task1 = new Task(1, "Набери грибов", "Возьми корзинку, ножик и едь в лес.", "Новое");
        Task task2 = new Task(2, "Собери банку сушеных комаров", "Возьми трехлитровую банку и едь на болото.",
                "Новое");
        Task task3 = new Task(3, "Сделай коллаж", "Возьми грибы, комаров и лист бумаги.", "Новое");

        list.add(task1);
        list.add(task2);
        list.add(task3);
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

    @RequestMapping(value = "/task/{id}", method = GET)
    public String showCurrentTaskPage(Model model, @PathVariable("id") int id) {
        model.addAttribute("task", list.get(id-1));
        return "task";
    }
}
