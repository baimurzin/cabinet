package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

@Controller
public class StudentCabinetController {
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
        Map<Integer, Task> map = new TreeMap<>();
        map.put(task1.getTaskId(), task1);
        map.put(task2.getTaskId(), task2);
        map.put(task3.getTaskId(), task3);
        model.addAllAttributes((Collection<?>) map); // ???
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
