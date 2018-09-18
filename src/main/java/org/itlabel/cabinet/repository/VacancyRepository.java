package org.itlabel.cabinet.repository;

import org.itlabel.cabinet.model.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacancyRepository extends JpaRepository<Vacancy, Integer> {

}
