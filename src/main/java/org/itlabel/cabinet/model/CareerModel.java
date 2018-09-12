package org.itlabel.cabinet.model;

/*
 *@author Yakovlev Alexandr
 */
public class CareerModel{
    private Vacancy[] vacancies;
    private User user;

    public CareerModel(Vacancy[] vacancies, User user) {
        this.vacancies = vacancies;
        this.user = user;
    }

    public Vacancy getVacancy(int i) {
        return vacancies[i];
    }

    public User getUser() {
        return user;
    }
}
