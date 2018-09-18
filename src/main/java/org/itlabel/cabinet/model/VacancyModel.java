package org.itlabel.cabinet.model;

import javax.persistence.Id;

public class VacancyModel {
    @Id
    private Integer vacancyId;
    private String companyName;
    private String positionName;
    private Integer salary;
    private Integer currencyId;

}
