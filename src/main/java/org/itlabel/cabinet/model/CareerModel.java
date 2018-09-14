package org.itlabel.cabinet.model;

import java.util.List;

/*
 *@author Yakovlev Alexandr
 */
public class CareerModel{
    private List<Vacancy> vacancies;
    private User user;

    public CareerModel(List vacancies, User user) {
        this.vacancies = vacancies;
        this.user = user;
    }

    public Vacancy getVacancy(int i) {
        return vacancies.get(i);
    }

    public User getUser() {
        return user;
    }
}
