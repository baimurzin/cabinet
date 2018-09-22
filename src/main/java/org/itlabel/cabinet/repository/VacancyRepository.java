package org.itlabel.cabinet.repository;

import org.itlabel.cabinet.model.VacancyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacancyRepository extends JpaRepository<VacancyModel, Integer> {
    @Modifying
    @Query(value = "SELECT * FROM vacancy_model u WHERE u.user_model_id = ?",
            nativeQuery = true)
    List<VacancyModel> findAllEmployersVacancyById(int id);



}
