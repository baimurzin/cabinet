package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.TaskModel;

import java.util.List;

public interface TaskService {

    TaskModel findTaskById(Long id);

    List<TaskModel> findAllTasks();

    List<TaskModel> findAllTasksInProgram(Long id);

}
