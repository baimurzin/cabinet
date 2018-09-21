package org.itlabel.cabinet.service;


import org.itlabel.cabinet.model.ProgramModel;

import java.util.List;

public interface ProgramService {

    ProgramModel findProgramById(Long id);

    List<ProgramModel> findAllPrograms();

}
