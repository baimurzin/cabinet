package org.itlabel.cabinet.service;

import org.itlabel.cabinet.model.Vacancy;

import java.util.List;

public interface VacancyService {
    List<Vacancy> getAllVacancies();

    void saveVacancy(Vacancy vacancy) throws Exception;

    Vacancy getVacancyById(int id);

    void updateVacancy(Vacancy vacancy);

    void deleteVacancy(Vacancy vacancy);
}
