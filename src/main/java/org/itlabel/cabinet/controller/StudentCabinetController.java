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
            (
                    new Task(1, "Набери грибов", "Возьми корзинку, ножик и едь в лес.", "Новое")),
            new Task(2, "Собери банку сушеных комаров", "Возьми трехлитровую банку и едь на болото.",
                    "Новое"),
            new Task(3, "Сделай коллаж", "Возьми грибы, комаров и лист бумаги.", "Новое")

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

    @RequestMapping(value = "/task/{id}", method = GET)
    public String showCurrentTaskPage(Model model, @PathVariable("id") int id) {
        model.addAttribute("task", list.get(id - 1));
        return "task";
    }

    @RequestMapping(value = "/task/{id}", method = POST)
    public String showCurrentTaskPage(@RequestParam("taskStatus") String taskStatus,
                                      Model model,
                                      @PathVariable("id") int id
    ) {
        Task task = new Task();
        task = list.get(id - 1);
        task.setTaskStatus(taskStatus);
        list.set(id - 1, task);
        return "redirect:/tasks";
    }
}
