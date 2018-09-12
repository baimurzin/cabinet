package org.itlabel.cabinet.controller;


import org.itlabel.cabinet.model.GroupModel;
import org.itlabel.cabinet.service.GroupService;
import org.itlabel.cabinet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MentorController {

    private UserService userService;
    private GroupService groupService;

    @Autowired
    public MentorController(UserService userService, GroupService groupService) {
        this.userService = userService;
        this.groupService = groupService;
    }

    @RequestMapping("/groups")
    public String toShowListOfGroups(Model model) {
        List<GroupModel> groups = groupService.findAllGroups();
        model.addAttribute("groups", groups);
        return "groups";
    }

    @RequestMapping("/groups/{groupId}")
    public String toShowListOfStudents(Model model, @PathVariable Long groupId) {
        model.addAttribute("group", groupService.findGroupById(groupId));
        model.addAttribute("students", userService.findAllUsers());
        return "students";
    }

    @RequestMapping("/{userId}")
    public String toShowStudentInfo(Model model, @PathVariable Long userId) {
        model.addAttribute("student", userService.findUserById(userId));
        return "student_info";
    }
}
