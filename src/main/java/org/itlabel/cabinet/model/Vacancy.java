package org.itlabel.cabinet.model;

import javax.persistence.criteria.CriteriaBuilder;

/*
 *@author Yakovlev Alexandr
 */
public class Vacancy {
    private Integer vacancyId;
    private String companyName;
    private String positionName;
    private Integer salary;
    private Integer currencyId;

    public Vacancy(Integer vacancyId, String companyName, String positionName, Integer salary, Integer currencyId) {
        this.vacancyId = vacancyId;
        this.companyName = companyName;
        this.positionName = positionName;
        this.salary = salary;
        this.currencyId = currencyId;
    }

    private String vacancyDescription;

    public Vacancy(Integer vacancyId, String companyName, String positionName, Integer salary, Integer currencyId, String vacancyDescription) {
        this.vacancyId = vacancyId;
        this.companyName = companyName;
        this.positionName = positionName;
        this.salary = salary;
        this.currencyId = currencyId;
        this.vacancyDescription = vacancyDescription;
    }

    public Integer getVacancyId() {
        return vacancyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public String getVacancyDescription() {
        if(vacancyDescription!=null)return vacancyDescription;
        return "";
    }

    public void setVacancyId(Integer vacancyId) {
        this.vacancyId = vacancyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public void setVacancyDescription(String vacancyDescription) {
        this.vacancyDescription = vacancyDescription;
    }
}
