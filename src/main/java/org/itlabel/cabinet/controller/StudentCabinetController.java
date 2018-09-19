package org.itlabel.cabinet.controller;

import org.itlabel.cabinet.model.Task;
import org.itlabel.cabinet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
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
        list.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                Long result = o1.getId() - o2.getId();
                int resultInt = 0;
                if (result > 0) resultInt = 1;
                if (result < 0) resultInt = -1;
                if (result.equals(0)) resultInt = 0;
                return resultInt;
            }
        });
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
    public String showCurrentTaskPage(@RequestParam("status") String status, Model model, @PathVariable("id") Long id) {
        if (status != null && !status.isEmpty()) {
            Task task = new Task();
            task = taskService.getTaskById(id);
            task.setStatus(status);
            taskService.editTask(task);
        }
        return "redirect:/tasks";
    }

    @Autowired(required = true)
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }
}
