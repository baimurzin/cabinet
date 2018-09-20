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
        return taskRepository.saveAndFlush(task);
    }

    @Override
    @Transactional
    public void deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
        }
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    @Transactional
    public Task editTask(Task task) {
        return taskRepository.saveAndFlush(task);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAllByIdOrderById();
    }
}
