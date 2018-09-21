package org.itlabel.cabinet.service.impl;


import org.itlabel.cabinet.model.ProgramModel;
import org.itlabel.cabinet.repository.ProgramRepository;
import org.itlabel.cabinet.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService {

    private ProgramRepository programRepository;

    @Autowired
    ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public ProgramModel findProgramById(Long id) {
        return programRepository.getOne(id);
    }

    @Override
    public List<ProgramModel> findAllPrograms() {
        return programRepository.findAll();
    }
}
