package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.Task;

import java.util.List;

public interface TaskService {

    Task addTask (Task task);
    void deleteTask(Long id);
    Task getTaskById(Long id);
    Task editTask(Task task);
    List<Task> getAll();
}
