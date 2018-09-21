package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.Progress;

import java.util.List;

public interface ProgressService {

    List<Progress> findAllPointsInGroup(Long id);

    List<Progress> findAllPointsForDoneTasksInGroup(Long id);

}
