package org.itlabel.cabinet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/*
 *@author Yakovlev Alexandr
 */

@Entity
@Setter
@Getter
@Table(name = "vacancy_model")
public class VacancyModel {

    public Integer getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(Integer vacancyId) {
        this.vacancyId = vacancyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getVacancyDescription() {
        return vacancyDescription;
    }

    public void setVacancyDescription(String vacancyDescription) {
        this.vacancyDescription = vacancyDescription;
    }

    public UserModel getUser_model() {
        return user_model;
    }

    public void setUser_model(UserModel user_model) {
        this.user_model = user_model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vacancyId;
    private String companyName;
    private String positionName;
    private Integer salary;
    private Integer currencyId;
    private String vacancyDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_model_id")
    private UserModel user_model;

}
