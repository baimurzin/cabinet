package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.VacancyModel;

import java.util.List;

public interface VacancyService {
    List<VacancyModel> getAllVacancies();

    void saveVacancy(VacancyModel vacancyModel) throws Exception;

    VacancyModel getVacancyById(int id);

    void updateVacancy(VacancyModel vacancyModel);

    void deleteVacancy(VacancyModel vacancyModel);
    List<VacancyModel> findAllEmployersVacancyById(int id);
}
