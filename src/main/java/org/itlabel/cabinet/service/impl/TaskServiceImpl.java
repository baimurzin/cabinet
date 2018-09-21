package org.itlabel.cabinet.service.impl;


import org.itlabel.cabinet.model.TaskModel;
import org.itlabel.cabinet.repository.TaskRepository;
import org.itlabel.cabinet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Autowired
    TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskModel findTaskById(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    public List<TaskModel> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public List<TaskModel> findAllTasksInProgram(Long id) {
        return taskRepository.findAllByProgramId(id);
    }
}
