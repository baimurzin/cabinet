package org.itlabel.cabinet.repository;


import org.itlabel.cabinet.model.ProgramModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<ProgramModel, Long> {
}
