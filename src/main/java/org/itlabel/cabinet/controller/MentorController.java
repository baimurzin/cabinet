package org.itlabel.cabinet.controller;


import org.itlabel.cabinet.model.GroupModel;
import org.itlabel.cabinet.model.Progress;
import org.itlabel.cabinet.model.UserModel;
import org.itlabel.cabinet.service.*;
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
    private TaskService taskService;
    private ProgramService programService;
    private ProgressService progressService;

    @Autowired
    public MentorController(UserService userService, GroupService groupService,
                            TaskService taskService, ProgramService programService,
                            ProgressService progressService) {
        this.userService = userService;
        this.groupService = groupService;
        this.taskService = taskService;
        this.programService = programService;
        this.progressService = progressService;
    }

    @RequestMapping("/groups")
    public String toShowListOfGroups(Model model) {
        List<GroupModel> groups = groupService.findAllGroups();
        model.addAttribute("groups", groups);
        return "groups";
    }

    @RequestMapping("/groups/{groupId}")
    public String toShowListOfStudents(Model model, @PathVariable Long groupId) {
        List<UserModel> students = userService.findAllUsersByProgram(groupId);
        List<Progress> allPoints = progressService.findAllPointsInGroup(groupId);
        List<Progress> allDoneTaskPoints = progressService.findAllPointsForDoneTasksInGroup(groupId);
        //List<Progress> pointsForDoneTasks = progressService.findAllPointsForDoneTasksInGroup(groupId);
        Double numOfAllPoints = 0.0;
        Double numOfAllDoneTaskPoints = 0.0;
        for (Progress elem : allPoints) {
            if (allDoneTaskPoints.contains(elem)) {
                numOfAllDoneTaskPoints += elem.getNumberOfPoints();
            }
            numOfAllPoints += elem.getTask().getPoint();
        }
        System.out.println(numOfAllPoints);

        Integer numOfStudents = students.size();
        model.addAttribute("num", numOfStudents);
        model.addAttribute("group", groupService.findGroupById(groupId));
        model.addAttribute("students", students);
        model.addAttribute("program", programService.findProgramById(groupId));
        model.addAttribute("allPoints", numOfAllPoints);
        model.addAttribute("allDoneTaskPoints", numOfAllDoneTaskPoints);

        return "students";
    }

    @RequestMapping("/{userId}")
    public String toShowStudentInfo(Model model, @PathVariable Long userId) {
        model.addAttribute("student", userService.findUserById(userId));
        return "student_info";
    }

    @RequestMapping("/programs")
    public String toShowListOfPrograms(Model model) {
        model.addAttribute("programs", programService.findAllPrograms());
        return "programs";
    }

    @RequestMapping("/programs/{programId}")
    public String toShowProgramInfo(Model model, @PathVariable Long programId) {
        model.addAttribute("program", programService.findProgramById(programId));
        model.addAttribute("tasks", taskService.findAllTasksInProgram(programId));
        return "program_info";
    }
}
