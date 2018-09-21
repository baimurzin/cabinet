package org.itlabel.cabinet.service.impl;

import org.itlabel.cabinet.model.ProgramModel;
import org.itlabel.cabinet.model.Progress;
import org.itlabel.cabinet.repository.ProgressRepository;
import org.itlabel.cabinet.service.ProgramService;
import org.itlabel.cabinet.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProgressServiceImpl implements ProgressService {

    private ProgressRepository progressRepository;

    @Autowired
    public ProgressServiceImpl(ProgressRepository progressRepository) {
        this.progressRepository = progressRepository;
    }

    @Override
    public List<Progress> findAllPointsInGroup(Long id) {
        return progressRepository.findAllTasksByGroupId(id);
    }

    @Override
    public List<Progress> findAllPointsForDoneTasksInGroup(Long id) {
        return progressRepository.findAllDoneTasksByGroupId(id);
    }
}
