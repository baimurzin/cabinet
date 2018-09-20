package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Task;
import org.itlabel.cabinet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class StudentCabinetController {

    private TaskService taskService;

    @RequestMapping("/profile")
    public String showProfilePage() {
        return "profile";
    }

    @RequestMapping("/tasks")
    public String showTasksPage(Model model) {
        List<Task> list = taskService.getAll();
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
    public String showCurrentTaskPage(Model model, @PathVariable("id") Long id) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "task";
    }

    @RequestMapping(value = "/task/{id}", method = POST)
    public String showCurrentTaskPage(@RequestParam("status") String status, @PathVariable("id") Long id) {
        if (status != null && !status.isEmpty()) {
            Task task = taskService.getTaskById(id);
            task.setStatus(status);
            taskService.editTask(task);
        }
        return "redirect:/tasks";
    }

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
}
