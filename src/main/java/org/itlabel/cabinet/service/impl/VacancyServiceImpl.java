package org.itlabel.cabinet.service.impl;


import org.itlabel.cabinet.model.VacancyModel;
import org.itlabel.cabinet.repository.VacancyRepository;
import org.itlabel.cabinet.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {


    @Autowired
    VacancyRepository vacancyRepository;

    public List<VacancyModel> getAllVacancies() {
        return vacancyRepository.findAll();
    }

    public void saveVacancy(VacancyModel vacancyModel) throws Exception {
        vacancyRepository.save(vacancyModel);
    }

    public VacancyModel getVacancyById(int id) {
        return vacancyRepository.getOne(id);
    }

    public void updateVacancy(VacancyModel vacancyModel) {
        vacancyRepository.save(vacancyModel);
    }

    public void deleteVacancy(VacancyModel vacancyModel) {
        vacancyRepository.delete(vacancyModel);
    }


    public List<VacancyModel> findAllEmployersVacancyById(int id){
        return vacancyRepository.findAllEmployersVacancyById(id);
    }


}