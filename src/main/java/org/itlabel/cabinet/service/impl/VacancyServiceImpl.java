package org.itlabel.cabinet.service.impl;


import org.itlabel.cabinet.model.Vacancy;
import org.itlabel.cabinet.repository.VacancyRepository;
import org.itlabel.cabinet.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {


    @Autowired
    VacancyRepository vacancyRepository;

    public List<Vacancy> getAllVacancies() {
        return vacancyRepository.findAll();
    }

    public void saveVacancy(Vacancy vacancy) throws Exception {
        if (vacancy.getCompanyName().length() < 2) {
            throw new Exception();
        }
        vacancyRepository.save(vacancy);
    }

    public Vacancy getVacancyById(int id) {
        return vacancyRepository.getOne(id);
    }

    public void updateVacancy(Vacancy vacancy) {
        vacancyRepository.save(vacancy);
    }

    public void deleteVacancy(Vacancy vacancy) {
        vacancyRepository.delete(vacancy);

    }
}