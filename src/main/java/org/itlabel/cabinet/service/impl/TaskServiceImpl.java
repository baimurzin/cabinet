package org.itlabel.cabinet.service.impl;

import org.itlabel.cabinet.model.Task;
import org.itlabel.cabinet.repository.TaskRepository;
import org.itlabel.cabinet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    @Transactional
    public Task addTask(Task task) {
        Task savedTask = taskRepository.saveAndFlush(task);
        return savedTask;
    }

    @Override
    @Transactional
    public void deleteTask(Long id) {
        //TODO - проверить существование Task
        taskRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Task getTaskById(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    @Transactional
    public Task editTask(Task task) {
        return taskRepository.saveAndFlush(task);
    }

    @Override
    @Transactional
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}